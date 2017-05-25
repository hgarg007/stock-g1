package com.einsite.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LIVESTOCK")
public class LiveStock {

	private String ticker;
	private String exchange;
	private float lastPrice;
	private float changePercent;
	private Date date;
	private String change;
	
	public LiveStock() {
		// TODO Auto-generated constructor stub
	}

	public LiveStock(String ticker, String exchange, float lastPrice, float changePercent, Date date,
			String change) {
		super();
		this.ticker = ticker;
		this.exchange = exchange;
		this.lastPrice = lastPrice;
		this.changePercent = changePercent;
		this.date = date;
		this.change = change;
	}

	
	@Column(name = "TICKER", nullable = false, length = 20)
	public String getTicker() {
		return ticker;
	}

	public void setTicker(String ticker) {
		this.ticker = ticker;
	}

	@Column(name = "EXCHANGE", nullable = false, length = 20)
	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	@Column(name = "LASTPRICE")
	public float getLastPrice() {
		return lastPrice;
	}

	public void setLastPrice(float lastPrice) {
		this.lastPrice = lastPrice;
	}

	@Column(name = "CHANGEPERCENT", nullable = false)
	public float getChangePercent() {
		return changePercent;
	}

	public void setChangePercent(float changePercent) {
		this.changePercent = changePercent;
	}

	//@Temporal(TemporalType.DATE)
	@Column(name = "DATE", nullable = false, length = 20)
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "CHANGE", nullable = false, length = 20)
	public String getChange() {
		return change;
	}

	public void setChange(String change) {
		this.change = change;
	}

}
