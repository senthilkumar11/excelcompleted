package com.premium.stc.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Size(min=1,message="Required")
	private String companyName;
	private BigDecimal turnOver;
	private String ceo;
	private String boardOfDirectors;
	
	private int sectorId;
	private String briefWriteUp;
	private int stockPriceId;
	
	
	public Company(int id, String companyName, BigDecimal turnOver, String ceo, String boardOfDirectors,
			int sectorId, String briefWriteUp, int stockPriceId) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.turnOver = turnOver;
		this.ceo = ceo;
		this.boardOfDirectors = boardOfDirectors;
		this.sectorId = sectorId;
		this.briefWriteUp = briefWriteUp;
		this.stockPriceId = stockPriceId;
	}
	
	public Company() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public BigDecimal getTurnOver() {
		return turnOver;
	}
	public void setTurnOver(BigDecimal turnOver) {
		this.turnOver = turnOver;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}
	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}
	
	
	public int getSectorId() {
		return sectorId;
	}
	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}
	public String getBriefWriteUp() {
		return briefWriteUp;
	}
	public void setBriefWriteUp(String briefWriteUp) {
		this.briefWriteUp = briefWriteUp;
	}
	

	public int getStockPriceId() {
		return stockPriceId;
	}

	public void setStockPriceId(int stockPriceId) {
		this.stockPriceId = stockPriceId;
	}

	@Override
	public String toString() {
		return "Company [companyCode=" + id  + ", companyName=" + companyName + ", turnOver=" + turnOver
				+ ", ceo=" + ceo + ", boardOfDirectors=" + boardOfDirectors + ", sectorId=" + sectorId
				+ ", briefWriteUp=" + briefWriteUp + ", stockCode=" + stockPriceId + "]";
	}
	
	
	
}
