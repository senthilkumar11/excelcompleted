package com.premium.stc.model;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class IPOPlaned {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(unique = true)
	private int companyCode;
	private String companyName;
	
	private int stockExchangeId;
	private double pricePerShare;
	private int totalNumberOfShares;
	private Date openDateTime;
	private String remarks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public int getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}

	public int getStockExchangeId() {
		return stockExchangeId;
	}

	public void setStockExchangeId(int stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}
	
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public double getPricePerShare() {
		return pricePerShare;
	}

	public void setPricePerShare(double pricePerShare) {
		this.pricePerShare = pricePerShare;
	}

	public int getTotalNumberOfShares() {
		return totalNumberOfShares;
	}

	public void setTotalNumberOfShares(int totalNumberOfShares) {
		this.totalNumberOfShares = totalNumberOfShares;
	}

	public Date getOpenDateTime() {
		return openDateTime;
	}

	public void setOpenDateTime(Date openDateTime) {
		this.openDateTime = openDateTime;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
