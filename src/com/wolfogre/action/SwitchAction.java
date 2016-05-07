package com.wolfogre.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.wolfogre.domain.Switch;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Jason Song(wolfogre.com) on 2016/5/2.
 */
public class SwitchAction extends ActionSupport {
	private Map<String,Object> dataMap;
	private String type;

	public SwitchAction() {
		dataMap = new HashMap<>();
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

		if(type == null)
		{
			dataMap.put("code", 2);
			return SUCCESS;
		}

		if(!type.equals("高压") && !type.equals("低压"))
		{
			dataMap.put("code", 4);
			return SUCCESS;
		}

		if(actionContext.getParameters().size() != 1)
		{
			dataMap.put("code", 5);
			return SUCCESS;
		}

		Configuration configuration = new Configuration().configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();

		SQLQuery sqlQuery = session.createSQLQuery("SELECT * FROM `switch` WHERE `类型` = '" + type + "'").addEntity(Switch.class);
		List<Switch> switchList;
		try{
			switchList = sqlQuery.list();
		}catch (Exception ex){
			session.close();
			sessionFactory.close();
			dataMap.put("code", 1);
			return SUCCESS;
		}

		session.close();
		sessionFactory.close();

		if(switchList.isEmpty()){
			dataMap.put("code", 6);
			return SUCCESS;
		}

		dataMap.put("data", switchList);
		dataMap.put("code", 0);


		return SUCCESS;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
