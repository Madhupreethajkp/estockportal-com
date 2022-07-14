package com.estockMarket.companyService.model;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;




import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class CompanyWriteModel {
	
	@NotEmpty(message = "cannot be empty or null")
	private String companyCode;

	@NotEmpty(message = "cannot be empty or null")
	private String companyName;

	@NotEmpty(message = "cannot be empty or null")
	private String ceoName;

	@NotNull(message = "cannot be empty or null")
	@DecimalMin("100000000.01")
	private BigDecimal turnOver;

	@NotEmpty(message = "cannot be empty or null")
	private String website;

	
	@NotEmpty(message = "cannot be empty or null")
	private String enlistedStockMarkets;


	public CompanyWriteModel() {
		super();
	}


	public CompanyWriteModel(@NotEmpty(message = "cannot be empty or null") String companyCode,
			@NotEmpty(message = "cannot be empty or null") String companyName,
			@NotEmpty(message = "cannot be empty or null") String ceoName,
			@NotNull(message = "cannot be empty or null") @DecimalMin("100000000.01") BigDecimal turnOver,
			@NotEmpty(message = "cannot be empty or null") String website,
			@NotEmpty(message = "cannot be empty or null") String enlistedStockMarkets) {
		super();
		this.companyCode = companyCode;
		this.companyName = companyName;
		this.ceoName = ceoName;
		this.turnOver = turnOver;
		this.website = website;
		this.enlistedStockMarkets = enlistedStockMarkets;
	}


	public String getCompanyCode() {
		return companyCode;
	}


	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getCeoName() {
		return ceoName;
	}


	public void setCeoName(String ceoName) {
		this.ceoName = ceoName;
	}


	public BigDecimal getTurnOver() {
		return turnOver;
	}


	public void setTurnOver(BigDecimal turnOver) {
		this.turnOver = turnOver;
	}


	public String getWebsite() {
		return website;
	}


	public void setWebsite(String website) {
		this.website = website;
	}


	public String getEnlistedStockMarkets() {
		return enlistedStockMarkets;
	}


	public void setEnlistedStockMarkets(String enlistedStockMarkets) {
		this.enlistedStockMarkets = enlistedStockMarkets;
	}

}
