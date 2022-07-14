package com.estockMarket.companyService.command.api.commands;

import java.math.BigDecimal;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.axonframework.modelling.command.TargetAggregateIdentifier;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
public class CompanyCreateCommand {

	@TargetAggregateIdentifier
	private String uuid;
	private String companyCode;
	private String companyName;
	private String ceoName;
	private BigDecimal turnOver;
	private String website;
	private String enlistedStockMarkets;
	public CompanyCreateCommand() {
		super();
	}
	public CompanyCreateCommand(String uuid, String companyCode, String companyName, String ceoName,
			BigDecimal turnOver, String website, String enlistedStockMarkets) {
		super();
		this.uuid = uuid;
		this.companyCode = companyCode;
		this.companyName = companyName;
		this.ceoName = ceoName;
		this.turnOver = turnOver;
		this.website = website;
		this.enlistedStockMarkets = enlistedStockMarkets;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
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
