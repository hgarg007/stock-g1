package com.einsite.controller;


import java.util.Arrays;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.einsite.dao.StockDao;

@Controller
@RequestMapping("/")
public class StockController {
	private StockDao dao;
	@RequestMapping(value= "/getStocks", method= RequestMethod.GET)
	public ModelAndView getStocks(@RequestParam("company") String companies) throws Exception{
		
		final String uri = "http://finance.google.com/finance/info?client=ig&q=NASDAQ:";
	    RestTemplate restTemplate = new RestTemplate();
	  
	   /* HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	    HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);*/
	   
	    ResponseEntity<String> entity = restTemplate.getForEntity(uri+companies, String.class);
	    String result=null;
	    if(entity.getStatusCode().equals(HttpStatus.OK)) 
	    	result=entity.getBody();
	    
	    result=result.substring(4, result.length());
		JSONArray json=new JSONArray(result);
		
		dao=new StockDao();
		dao.insertToLiveStock(json);
		ModelAndView model=new ModelAndView("result");
		model.addObject("res", json);
		return model;
	}
	
}
