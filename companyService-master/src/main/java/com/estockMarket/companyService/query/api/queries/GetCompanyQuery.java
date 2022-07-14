package com.estockMarket.companyService.query.api.queries;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
public class GetCompanyQuery {

	private String companyCode;

	public GetCompanyQuery() {
		super();
	}

	public GetCompanyQuery(String companyCode) {
		super();
		this.companyCode = companyCode;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
}
