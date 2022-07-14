package com.estockMarket.companyService.command.api.commands;

import java.math.BigDecimal;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
public class DeleteCompanyCommand {
	@TargetAggregateIdentifier
	private String uuid;
	private String companyCode;
	public DeleteCompanyCommand() {
		super();
	}
	public DeleteCompanyCommand(String uuid, String companyCode) {
		super();
		this.uuid = uuid;
		this.companyCode = companyCode;
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

}
