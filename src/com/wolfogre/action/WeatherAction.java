package com.wolfogre.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

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

		if(actionContext.getParameters().size() != 2)
		{
			dataMap.put("code", 5);
			return SUCCESS;
		}
		dataMap.put("code", 0);
		dataMap.put("lat", getLat());
		dataMap.put("lon", getLon());
		Map<String,Object> tempMap = new HashMap<>();
		tempMap.put("irradiance", new double[]{1,2,3,4,5,6,7,8,9,10,11,12});
		tempMap.put("temperature", new double[]{1,2,3,4,5,6,7,8,9,10,11,12});
		tempMap.put("humidity", new double[]{1,2,3,4,5,6,7,8,9,10,11,12});
		tempMap.put("wind", new double[]{1,2,3,4,5,6,7,8,9,10,11,12});
		dataMap.put("data", tempMap);
		return SUCCESS;
	}
}
