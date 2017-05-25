package com.einsite.dao;

import java.sql.Date;

import org.json.JSONArray;
import org.json.JSONObject;

import com.einsite.model.LiveStock;

public class StockDao {
	
	public void insertToLiveStock(JSONArray json) {
		for(int i=0; i<json.length();++i) {
			JSONObject jboj=(JSONObject) json.get(i);
			LiveStock ls=new LiveStock(jboj.get("t").toString(), jboj.get("e").toString(), Float.valueOf((String) jboj.get("l")), Float.valueOf((String) jboj.get("cp")), Date.valueOf((String) jboj.get("d")), jboj.get("c").toString());
			//Session.save(ls);
		}
			
	}
	
	public void insertToCompany() {
		//Read from Excel file
	}
}
