package com.wolfogre.action;

import com.opensymphony.xwork2.ActionSupport;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jason Song(wolfogre.com) on 2016/4/30.
 */
public class TestAction extends ActionSupport {
	private Map<String,Object> dataMap;

	@Override
	public String execute() throws Exception {
		dataMap = new HashMap<>();
		Map<String,Object> m = new HashMap<>();
		m.put("name","haha");
		m.put("num",100);
		m.put("num2",3.14);
		dataMap.put("message", "mapJson");
		dataMap.put("value", m);
		return SUCCESS;
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}
}
