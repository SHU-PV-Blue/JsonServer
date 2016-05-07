package com.wolfogre.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.wolfogre.domain.Switch;
import com.wolfogre.domain.Transformer;
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
 * Created by Jason Song(wolfogre.com) on 2016/5/7.
 */
public class TransformerAction extends ActionSupport {
	private Map<String,Object> dataMap;
	private String type;

	public TransformerAction() {
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

		if(!type.equals("10KV变压器") && !type.equals("35KV变压器(0.4-35KV)") && !type.equals("35KV变压器(10-35KV)"))
		{
			dataMap.put("code", 4);
			return SUCCESS;
		}

		if(actionContext.getParameters().size() != 1)
		{
			dataMap.put("code", 5);
			return SUCCESS;
		}


		if(type.equals("35KV变压器(10-35KV)")){
			//TODO:这种类型只有一条数据，且数据格式和其他的不一样，懒得建表了，直接返回
			HashMap<String, Object> resultData = new HashMap<>();

			resultData.put("类型","35KV变压器(10-35KV)");
			resultData.put("产品名","干式变压器(双绕组变压器)");
			resultData.put("额定容量",10000000);
			resultData.put("额定频率",50);
			resultData.put("额定电流",164.962);
			resultData.put("空载额定变比","38.5±2*5%/10 KV");
			resultData.put("半穿越阻抗电压",8);
			resultData.put("调压方式","有载调压");
			resultData.put("额定电压","38.5/10 KV");
			resultData.put("调压范围","38.5±2*5%");
			resultData.put("联接组标号","D,yn11");
			resultData.put("中性点接地方式","高压侧中性点不接地系统,低压侧中性点不接地系统");
			resultData.put("极性","负极性");

			HashMap[] resultDataList = {resultData};

			dataMap.put("data", resultDataList);
			dataMap.put("code", 0);
			return SUCCESS;
		}


		Configuration configuration = new Configuration().configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		Session session = sessionFactory.openSession();

		SQLQuery sqlQuery = session.createSQLQuery("SELECT * FROM `transformer` WHERE `类型` = '" + type + "'").addEntity(Transformer.class);
		List<Transformer> transformerList;
		try{
			transformerList = sqlQuery.list();
		}catch (Exception ex){
			session.close();
			sessionFactory.close();
			dataMap.put("code", 1);
			return SUCCESS;
		}

		session.close();
		sessionFactory.close();

		if(transformerList.isEmpty()){
			dataMap.put("code", 6);
			return SUCCESS;
		}

		dataMap.put("data", transformerList);
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
