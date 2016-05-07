package com.wolfogre.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.wolfogre.domain.Weather;
import com.wolfogre.domain.WeatherPK;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jason Song(wolfogre.com) on 2016/4/30.
 */
public class WeatherAction extends ActionSupport {
	private String lat;
	private String lon;
	private Map<String,Object> dataMap;

	public WeatherAction() {
		dataMap = new HashMap<>();
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	@Override
	public String execute() throws Exception {
		dataMap.clear();
		ActionContext actionContext = ActionContext.getContext();

		if(lat == null || lon == null)
		{
			dataMap.put("code", 2);
			return SUCCESS;
		}

		double latValue, lonValue;

		try{
			latValue = Double.parseDouble(lat);
			lonValue = Double.parseDouble(lon);
		} catch (Exception ex){
			dataMap.put("code", 3);
			return SUCCESS;
		}

		if(latValue < -90 || latValue > 90 || lonValue < -180 || lonValue > 180)
		{
			dataMap.put("code", 4);
			return SUCCESS;
		}

		//计算最靠近的坐标记录点
		latValue = (Math.round(latValue + 0.5) + 90) % 180 - 90 - 0.5;
		lonValue = (Math.round(lonValue + 0.5) + 180) % 360 - 180  - 0.5;

		if(actionContext.getParameters().size() != 2)
		{
			dataMap.put("code", 5);
			return SUCCESS;
		}

		Configuration configuration = new Configuration().configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();

		Weather irradiance = (Weather)session.get(Weather.class, new WeatherPK("irradiance", latValue, lonValue));
		Weather temperature = (Weather)session.get(Weather.class, new WeatherPK("temperature", latValue, lonValue));
		Weather humidity = (Weather)session.get(Weather.class, new WeatherPK("humidity", latValue, lonValue));
		Weather wind = (Weather)session.get(Weather.class, new WeatherPK("wind", latValue, lonValue));

		Weather H0 = (Weather)session.get(Weather.class, new WeatherPK("H0", latValue, lonValue));
		Weather Hd = (Weather)session.get(Weather.class, new WeatherPK("Hd", latValue, lonValue));
		Weather Kt = (Weather)session.get(Weather.class, new WeatherPK("Kt", latValue, lonValue));
		Weather Ws = (Weather)session.get(Weather.class, new WeatherPK("Ws", latValue, lonValue));

		session.close();
		sessionFactory.close();

		if(irradiance == null || temperature == null || humidity == null || wind == null)
		{
			dataMap.put("code", 6);
			return SUCCESS;
		}

		Double[] irradianceData = getDataArray(irradiance);
		Double[] temperatureData = getDataArray(temperature);
		Double[] humidityData = getDataArray(humidity);
		Double[] windData = getDataArray(wind);

		Double[] H0Data = getDataArray(H0);
		Double[] HdData = getDataArray(Hd);
		Double[] KtData = getDataArray(Kt);
		Double[] WsData = getDataArray(Ws);

		dataMap.put("lat", latValue);
		dataMap.put("lon", lonValue);

		Map<String,Object>[] dataArray = new Map[12];
		for(int i = 0; i < 12; ++i){
			Map<String,Object> tempMap = new HashMap<>();
			tempMap.put("H", irradianceData[i]);
			tempMap.put("temperature", temperatureData[i]);
			tempMap.put("humidity", humidityData[i]);
			tempMap.put("wind", windData[i]);

			tempMap.put("H0", H0Data[i]);
			tempMap.put("Hd", HdData[i]);
			tempMap.put("Kt", KtData[i]);
			tempMap.put("Ws", WsData[i]);
			dataArray[i] = tempMap;
		}
		dataMap.put("data", dataArray);
		dataMap.put("code", 0);
		return SUCCESS;
	}

	protected Double[] getDataArray(Weather weather){
		Double[] result = new Double[12];
		result[0] = weather.getJan();
		result[1] = weather.getFeb();
		result[2] = weather.getMar();
		result[3] = weather.getApr();
		result[4] = weather.getMay();
		result[5] = weather.getJun();
		result[6] = weather.getJul();
		result[7] = weather.getAug();
		result[8] = weather.getSep();
		result[9] = weather.getOct();
		result[10] = weather.getNov();
		result[11] = weather.getDec();
		return result;
	}
}
