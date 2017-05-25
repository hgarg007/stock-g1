package com.einsite.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "COMPANY"	)
public class Company implements java.io.Serializable {
	
	private String symbol;
	private String name;
	private String marketCap;
	private String sector;
	private String industry;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(String symbol, String name, String marketCap, String sector, String industry) {
		super();
		this.symbol = symbol;
		this.name = name;
		this.marketCap = marketCap;
		this.sector = sector;
		this.industry = industry;
	}
	
	@Id
	@Column(name = "SYMBOL", unique = true, nullable = false)
	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	
	@Column(name = "NAME", nullable = false, length = 20)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "MARKETCAP", nullable = false, length = 20)
	public String getMarketCap() {
		return marketCap;
	}
	
	public void setMarketCap(String marketCap) {
		this.marketCap = marketCap;
	}

	@Column(name = "SECTOR", nullable = false, length = 20)
	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	@Column(name = "INDUSTRY", nullable = false, length = 20)
	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

}
