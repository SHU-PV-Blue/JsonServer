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
		dataMap.put("lat", latValue);
		dataMap.put("lon", lonValue);
		Map<String,Object>[] dataArray = new Map[12];
		for(int i = 0; i < 12; ++i){
			Map<String,Object> tempMap = new HashMap<>();
			tempMap.put("i", (double)i + 1);
			tempMap.put("t", (double)i + 1);
			tempMap.put("h", (double)i + 1);
			tempMap.put("w", (double)i + 1);
			dataArray[i] = tempMap;
		}
		dataMap.put("data", dataArray);
		return SUCCESS;
	}
}
