package com.premium.stc.model;

import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="stockexchange")
public class StockExchange {
	@Id
	@Column(name="stockexchange_id")
	private int id;
	@Column(name="stockexchange_name")
	private String name;
	private String brief;
	@Column(name="contactaddress")
	private String contactAddress;
	private String remarks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrief() {
		return brief;
	}

	public void setBrief(String brief) {
		this.brief = brief;
	}

	public String getContactAddress() {
		return contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "StockExchange [id=" + id + ", stockExchange=" +name + ", brief=" + brief + ", contactAddress="
				+ contactAddress + ", remarks=" + remarks + "]";
	}
	

}
