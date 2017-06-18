package com.einsite.dao;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import com.einsite.model.LiveStock;
import com.einsite.utility.HibernateUtility;

public class StockDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void insertToLiveStock(JSONArray json) {
		sessionFactory= HibernateUtility.getSessionFactory();
		Session session=sessionFactory.openSession();
		System.out.println(session);
		Transaction tx= session.beginTransaction();
		for(int i=0; i<json.length();++i) {
			JSONObject jboj=(JSONObject) json.get(i);
			LiveStock ls=new LiveStock(jboj.get("t").toString(), jboj.get("e").toString(), Float.valueOf((String) jboj.get("l")), Float.valueOf((String) jboj.get("cp")), Date.valueOf(((String) jboj.get("lt_dts")).substring(0, 10)), jboj.get("c").toString());
			session.save(ls);
			tx.commit();
		}
		session.close();
	}
	
	public void insertToCompany() {
		//Read from Excel file
	}
}
