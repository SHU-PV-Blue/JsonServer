package com.wolfogre.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.wolfogre.domain.InverterCentralized;
import com.wolfogre.domain.InverterPhase;
import com.wolfogre.domain.InverterTandem;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.internal.SQLQueryImpl;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Jason Song(wolfogre.com) on 2016/5/2.
 */
public class InverterAction extends ActionSupport {
	private Map<String, Object> dataMap;

	public InverterAction() {
		dataMap = new HashMap<>();
	}

	public Map<String, Object> getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map<String, Object> dataMap) {
		this.dataMap = dataMap;
	}

	public String tandem(){
		return loadData("inverter-tandem");
	}

	public String centralized(){
		return loadData("inverter-centralized");
	}

	public String phase(){
		return loadData("inverter-phase");
	}

	String loadData(String dataSource){
		dataMap.clear();
		ActionContext actionContext = ActionContext.getContext();

		if(actionContext.getParameters().size() != 0)
		{
			dataMap.put("code", 5);
			return SUCCESS;
		}

		Configuration configuration = new Configuration().configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();

		SQLQuery sqlQuery = session.createSQLQuery("SELECT * FROM `" + dataSource + "`");
		if("inverter-tandem".equals(dataSource))
			sqlQuery.addEntity(InverterTandem.class);
		if("inverter-centralized".equals(dataSource))
			sqlQuery.addEntity(InverterCentralized.class);
		if("inverter-phase".equals(dataSource))
			sqlQuery.addEntity(InverterPhase.class);
		List inverterList;
		try{
			inverterList = sqlQuery.list();
		}catch (Exception ex){
			session.close();
			sessionFactory.close();
			dataMap.put("code", 1);
			return SUCCESS;
		}

		session.close();
		sessionFactory.close();

		if(inverterList.isEmpty()){
			dataMap.put("code", 6);
			return SUCCESS;
		}

		dataMap.put("data", inverterList);
		dataMap.put("code", 0);

		return SUCCESS;
	}
}
