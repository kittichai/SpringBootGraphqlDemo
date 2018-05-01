package th.co.truecorp.esd.grapghql.models.filter;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CustomerFilter {
	
	private int customerId;
	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getCustomerType() {
		return customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	private int operatorId;
	private String certification;
	private String customerType;

	@JsonProperty("customerId")
	public int getCustomerId() {
		return customerId;
	}

	public int getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
}
