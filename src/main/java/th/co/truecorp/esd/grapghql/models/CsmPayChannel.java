package th.co.truecorp.esd.grapghql.models;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
import model.Column;
import model.CsmAccount;
import model.OneToOne;
import model.Temporal;
*/

@Entity
@Table(name = "CSM_PAY_CHANNEL")
public class CsmPayChannel {

	@Column(name="APPLICATION_ID")
	private String applicationId;

	@Column(name="BANK_ACCT_NO")
	private String bankAcctNo;

	@Column(name="BANK_ACCT_TYPE")
	private String bankAcctType;

	@Column(name="BANK_BRANCH_NO")
	private String bankBranchNo;

	@Column(name="BANK_CODE")
	private String bankCode;

	@Column(name="BEN")
	private String ben;

	@Column(name="BAN")
	private String ban;
	
	@Column(name="BEN_NUMBER")
	private BigDecimal benNumber;

	@Column(name="BUSINESS_ENTITY_ID")
	private BigDecimal businessEntityId;

	@Column(name="CONV_RUN_NO")
	private BigDecimal convRunNo;

	//@Temporal(TemporalType.DATE)
	@Column(name="CREDIT_CARD_EXP_DT")
	private Date creditCardExpDt;

	@Column(name="CREDIT_CARD_NO")
	private String creditCardNo;

	@Column(name="CREDIT_CARD_TYPE")
	private String creditCardType;

	@Id
	@Column(name="CUSTOMER_ID")
	private BigDecimal customerId;

	@Column(name="DL_SERVICE_CODE")
	private String dlServiceCode;

	@Column(name="DL_UPDATE_STAMP")
	private BigDecimal dlUpdateStamp;

	@Column(name="EXTERNAL_ID")
	private String externalId;

	//@Temporal(TemporalType.DATE)
	@Column(name="ISSUE_DATE")
	private Date issueDate;

	@Column(name="L9_BANK_BRANCH_NAME")
	private String l9BankBranchName;

	@Column(name="L9_BANK_NAME")
	private String l9BankName;

	//@Temporal(TemporalType.DATE)
	@Column(name="L9_DD_APPROVAL_DATE")
	private Date l9DdApprovalDate;

	//@Temporal(TemporalType.DATE)
	@Column(name="OPEN_DATE")
	private Date openDate;

	@Column(name="OPERATOR_ID")
	private BigDecimal operatorId;

	@Column(name="PAYMENT_CATEGORY")
	private String paymentCategory;

	@Column(name="PAYMENT_METHOD")
	private String paymentMethod;

	@Column(name="PAYMENT_TYPE")
	private String paymentType;

	@Column(name="PCN_DESC")
	private String pcnDesc;

	@Column(name="PCN_NUMBER")
	private BigDecimal pcnNumber;

	@Column(name="PCN_STATUS")
	private String pcnStatus;

	@Column(name="PIN_NUMBER")
	private String pinNumber;

	@Column(name="PYM_CHANNEL_NO")
	private BigDecimal pymChannelNo;

	@Column(name="PYM_OWNER_DET")
	private String pymOwnerDet;

	@Column(name="RECURR_FREQ")
	private String recurrFreq;

	@Column(name="RECURR_FREQ_VAL")
	private BigDecimal recurrFreqVal;

	@Column(name="RECURR_PYM_AMT")
	private BigDecimal recurrPymAmt;

	//@Temporal(TemporalType.DATE)
	@Column(name="STATUS_DATE")
	private Date statusDate;

	//@Temporal(TemporalType.DATE)
	@Column(name="SYS_CREATION_DATE")
	private Date sysCreationDate;

	//@Temporal(TemporalType.DATE)
	@Column(name="SYS_UPDATE_DATE")
	private Date sysUpdateDate;

	//bi-directional one-to-one association to CsmAccount
	//@OneToOne(mappedBy="csmPayChannel")
	//private CsmAccount csmAccount;

	public CsmPayChannel() {
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getBankAcctNo() {
		return this.bankAcctNo;
	}

	public void setBankAcctNo(String bankAcctNo) {
		this.bankAcctNo = bankAcctNo;
	}

	public String getBankAcctType() {
		return this.bankAcctType;
	}

	public void setBankAcctType(String bankAcctType) {
		this.bankAcctType = bankAcctType;
	}

	public String getBankBranchNo() {
		return this.bankBranchNo;
	}

	public void setBankBranchNo(String bankBranchNo) {
		this.bankBranchNo = bankBranchNo;
	}

	public String getBankCode() {
		return this.bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
/*
	public BigDecimal getBen() {
		return this.ben;
	}

	public void setBen(BigDecimal ben) {
		this.ben = ben;
	}
*/
	public BigDecimal getBenNumber() {
		return this.benNumber;
	}

	public void setBenNumber(BigDecimal benNumber) {
		this.benNumber = benNumber;
	}

	public BigDecimal getBusinessEntityId() {
		return this.businessEntityId;
	}

	public void setBusinessEntityId(BigDecimal businessEntityId) {
		this.businessEntityId = businessEntityId;
	}

	public BigDecimal getConvRunNo() {
		return this.convRunNo;
	}

	public void setConvRunNo(BigDecimal convRunNo) {
		this.convRunNo = convRunNo;
	}

	public Date getCreditCardExpDt() {
		return this.creditCardExpDt;
	}

	public void setCreditCardExpDt(Date creditCardExpDt) {
		this.creditCardExpDt = creditCardExpDt;
	}

	public String getCreditCardNo() {
		return this.creditCardNo;
	}

	public void setCreditCardNo(String creditCardNo) {
		this.creditCardNo = creditCardNo;
	}

	public String getCreditCardType() {
		return this.creditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}

	public BigDecimal getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(BigDecimal customerId) {
		this.customerId = customerId;
	}

	public String getDlServiceCode() {
		return this.dlServiceCode;
	}

	public void setDlServiceCode(String dlServiceCode) {
		this.dlServiceCode = dlServiceCode;
	}

	public BigDecimal getDlUpdateStamp() {
		return this.dlUpdateStamp;
	}

	public void setDlUpdateStamp(BigDecimal dlUpdateStamp) {
		this.dlUpdateStamp = dlUpdateStamp;
	}

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public Date getIssueDate() {
		return this.issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public String getL9BankBranchName() {
		return this.l9BankBranchName;
	}

	public void setL9BankBranchName(String l9BankBranchName) {
		this.l9BankBranchName = l9BankBranchName;
	}

	public String getL9BankName() {
		return this.l9BankName;
	}

	public void setL9BankName(String l9BankName) {
		this.l9BankName = l9BankName;
	}

	public Date getL9DdApprovalDate() {
		return this.l9DdApprovalDate;
	}

	public void setL9DdApprovalDate(Date l9DdApprovalDate) {
		this.l9DdApprovalDate = l9DdApprovalDate;
	}

	public Date getOpenDate() {
		return this.openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public BigDecimal getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(BigDecimal operatorId) {
		this.operatorId = operatorId;
	}

	public String getPaymentCategory() {
		return this.paymentCategory;
	}

	public void setPaymentCategory(String paymentCategory) {
		this.paymentCategory = paymentCategory;
	}

	public String getPaymentMethod() {
		return this.paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getPaymentType() {
		return this.paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPcnDesc() {
		return this.pcnDesc;
	}

	public void setPcnDesc(String pcnDesc) {
		this.pcnDesc = pcnDesc;
	}

	public BigDecimal getPcnNumber() {
		return this.pcnNumber;
	}

	public void setPcnNumber(BigDecimal pcnNumber) {
		this.pcnNumber = pcnNumber;
	}

	public String getPcnStatus() {
		return this.pcnStatus;
	}

	public void setPcnStatus(String pcnStatus) {
		this.pcnStatus = pcnStatus;
	}

	public String getPinNumber() {
		return this.pinNumber;
	}

	public void setPinNumber(String pinNumber) {
		this.pinNumber = pinNumber;
	}

	public BigDecimal getPymChannelNo() {
		return this.pymChannelNo;
	}

	public void setPymChannelNo(BigDecimal pymChannelNo) {
		this.pymChannelNo = pymChannelNo;
	}

	public String getPymOwnerDet() {
		return this.pymOwnerDet;
	}

	public void setPymOwnerDet(String pymOwnerDet) {
		this.pymOwnerDet = pymOwnerDet;
	}

	public String getRecurrFreq() {
		return this.recurrFreq;
	}

	public void setRecurrFreq(String recurrFreq) {
		this.recurrFreq = recurrFreq;
	}

	public BigDecimal getRecurrFreqVal() {
		return this.recurrFreqVal;
	}

	public void setRecurrFreqVal(BigDecimal recurrFreqVal) {
		this.recurrFreqVal = recurrFreqVal;
	}

	public BigDecimal getRecurrPymAmt() {
		return this.recurrPymAmt;
	}

	public void setRecurrPymAmt(BigDecimal recurrPymAmt) {
		this.recurrPymAmt = recurrPymAmt;
	}

	public Date getStatusDate() {
		return this.statusDate;
	}

	public void setStatusDate(Date statusDate) {
		this.statusDate = statusDate;
	}

	public Date getSysCreationDate() {
		return this.sysCreationDate;
	}

	public void setSysCreationDate(Date sysCreationDate) {
		this.sysCreationDate = sysCreationDate;
	}

	public Date getSysUpdateDate() {
		return this.sysUpdateDate;
	}

	public void setSysUpdateDate(Date sysUpdateDate) {
		this.sysUpdateDate = sysUpdateDate;
	}

	public String getBen() {
		return ben;
	}

	public void setBen(String ben) {
		this.ben = ben;
	}

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}

	/*
	public CsmAccount getCsmAccount() {
		return this.csmAccount;
	}

	public void setCsmAccount(CsmAccount csmAccount) {
		this.csmAccount = csmAccount;
	}
	*/
}
