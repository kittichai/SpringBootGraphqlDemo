package th.co.truecorp.esd.grapghql.models;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

	@Column(name = "ANNIVERSARY_END_DAY")
	private BigDecimal anniversaryEndDay;

	@Column(name = "APPLICATION_ID")
	private String applicationId;

	@Column(name = "ASSISTANT_USER_ID")
	private BigDecimal assistantUserId;

	@Column(name = "BILL_CYC_PROD_FREQ")
	private BigDecimal billCycProdFreq;

	@Column(name = "BILL_CYCLE")
	private BigDecimal billCycle;

	@Column(name = "BUSINESS_ENTITY_ID")
	private BigDecimal businessEntityId;

	@Column(name = "CH_NODE_ID")
	private BigDecimal chNodeId;

	// @Temporal(TemporalType.DATE)
	@Column(name = "CHG_CYC_REQ_DATE")
	private String chgCycReqDate;

	@Column(name = "CHG_CYCLE_IND")
	private String chgCycleInd;

	@Column(name = "CHG_CYCLE_REQ_STS")
	private String chgCycleReqSts;

	@Column(name = "CONV_RUN_NO")
	private BigDecimal convRunNo;

	@Column(name = "CREDIT_CLASS")
	private String creditClass;

	@Column(name = "CUST_SUB_TYPE")
	private String custSubType;

	@Id
	@Column(name = "CUSTOMER_ID")
	private int customerId;

	@Column(name = "CUSTOMER_TYPE")
	private String customerType;

	@Column(name = "DEALER_CODE")
	private String dealerCode;

	@Column(name = "DFLT_POST_PCN")
	private BigDecimal dfltPostPcn;

	@Column(name = "DFLT_PRE_PCN")
	private BigDecimal dfltPrePcn;

	@Column(name = "DL_SERVICE_CODE")
	private String dlServiceCode;

	@Column(name = "DL_UPDATE_STAMP")
	private BigDecimal dlUpdateStamp;

	// @Temporal(TemporalType.DATE)
	@Column(name = "EFFECTIVE_DATE")
	private String effectiveDate;

	@Column(name = "ENTITY_LOCK_TYPE")
	private String entityLockType;

	// @Temporal(TemporalType.DATE)
	@Column(name = "EXPIRATION_DATE")
	private String expirationDate;

	@Column(name = "EXTERNAL_ID")
	private String externalId;

	@Column(name = "FINANCIAL_LOCK_TYPE")
	private String financialLockType;

	@Column(name = "L3_ALARM_NOFIF_TYPE")
	private String l3AlarmNofifType;

	@Column(name = "L3_ALARM_NOTIF_THRESHOLD")
	private BigDecimal l3AlarmNotifThreshold;

	@Column(name = "L3_CRD_LMT_THRESHOLD")
	private BigDecimal l3CrdLmtThreshold;

	@Column(name = "L3_CREDIT_LIMIT_IND")
	private String l3CreditLimitInd;

	// @Temporal(TemporalType.DATE)
	@Column(name = "L9_BIRTH_DATE")
	private String l9BirthDate;

	@Column(name = "L9_BLACKLIST_IND")
	private String l9BlacklistInd;

	@Column(name = "L9_BUSINESS_TYPE")
	private String l9BusinessType;

	@Column(name = "L9_CONTACT_LANG")
	private String l9ContactLang;

	@Column(name = "L9_EDUCATION")
	private String l9Education;

	@Column(name = "L9_EMPLOYEE_CODE")
	private String l9EmployeeCode;

	@Column(name = "L9_EMPLOYMENT_STATUS")
	private String l9EmploymentStatus;

	@Column(name = "L9_GRADING")
	private String l9Grading;

	@Column(name = "L9_IDENTIFICATION")
	private String l9Identification;

	// @Temporal(TemporalType.DATE)
	@Column(name = "L9_IDENTIFICATION_EXP_DATE")
	private String l9IdentificationExpDate;

	@Column(name = "L9_IDENTIFICATION_TYPE")
	private String l9IdentificationType;

	@Column(name = "L9_INDUSTRY_TYPE")
	private String l9IndustryType;

	@Column(name = "L9_INIT_TIME_IN_ADD")
	private String l9InitTimeInAdd;

	@Column(name = "L9_JOB_TYPE")
	private String l9JobType;

	@Column(name = "L9_NATIONALITY")
	private String l9Nationality;

	@Column(name = "L9_NO_OF_EMPLOYEES")
	private String l9NoOfEmployees;

	@Column(name = "L9_OCCUPATION")
	private String l9Occupation;

	// @Temporal(TemporalType.DATE)
	@Column(name = "L9_PERIOD_OF_WORK")
	private String l9PeriodOfWork;

	@Column(name = "L9_SALARY")
	private String l9Salary;

	@Column(name = "L9_SYSTEM_ID")
	private String l9SystemId;

	@Column(name = "L9_TIME_IN_BUSINESS")
	private String l9TimeInBusiness;

	@Column(name = "L9_TOTAL_SUBSCRIBER")
	private BigDecimal l9TotalSubscriber;

	@Column(name = "L9_TRUE_ID")
	private String l9TrueId;

	@Column(name = "L9_USER_ID")
	private BigDecimal l9UserId;

	@Column(name = "LARGE_CUST_IND")
	private String largeCustInd;

	@Column(name = "LAST_ACTIVITY_CODE")
	private String lastActivityCode;

	@Column(name = "LAST_ACTIVITY_REASON_CODE")
	private String lastActivityReasonCode;

	@Column(name = "LEGACY_CUST_NO")
	private BigDecimal legacyCustNo;

	@Column(name = "MARKETING_CHANNEL")
	private String marketingChannel;

	@Column(name = "NEW_CYC_PROD_FREQ")
	private BigDecimal newCycProdFreq;

	@Column(name = "NEW_CYCLE")
	private BigDecimal newCycle;

	@Column(name = "NEW_ONLINE_PARTITION_ID")
	private BigDecimal newOnlinePartitionId;

	@Column(name = "NEW_PARTITION_ID")
	private BigDecimal newPartitionId;

	@Column(name = "OFFER_CURRENCY")
	private String offerCurrency;

	@Column(name = "ONLINE_PARTITION_ID")
	private BigDecimal onlinePartitionId;

	// @Temporal(TemporalType.DATE)
	@Column(name = "OPEN_DATE")
	private String openDate;

	@Column(name = "OPERATOR_ID")
	private int operatorId;

	@Column(name = "PARTITION_ID")
	private BigDecimal partitionId;

	@Column(name = "RESOURCE_POOL")
	private String resourcePool;

	@Column(name = "SPC_MEMO_IND")
	private String spcMemoInd;

	// @Temporal(TemporalType.DATE)
	@Column(name = "SYS_CREATION_DATE")
	private String sysCreationDate;

	// @Temporal(TemporalType.DATE)
	@Column(name = "SYS_UPDATE_DATE")
	private String sysUpdateDate;

	@OneToMany(fetch = FetchType.EAGER, mappedBy="customer")
	private List<Subscriber> subscribers;

	public Customer() {
	}

	public BigDecimal getAnniversaryEndDay() {
		return this.anniversaryEndDay;
	}

	public void setAnniversaryEndDay(BigDecimal anniversaryEndDay) {
		this.anniversaryEndDay = anniversaryEndDay;
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public BigDecimal getAssistantUserId() {
		return this.assistantUserId;
	}

	public void setAssistantUserId(BigDecimal assistantUserId) {
		this.assistantUserId = assistantUserId;
	}

	public BigDecimal getBillCycProdFreq() {
		return this.billCycProdFreq;
	}

	public void setBillCycProdFreq(BigDecimal billCycProdFreq) {
		this.billCycProdFreq = billCycProdFreq;
	}

	public BigDecimal getBillCycle() {
		return this.billCycle;
	}

	public void setBillCycle(BigDecimal billCycle) {
		this.billCycle = billCycle;
	}

	public BigDecimal getBusinessEntityId() {
		return this.businessEntityId;
	}

	public void setBusinessEntityId(BigDecimal businessEntityId) {
		this.businessEntityId = businessEntityId;
	}

	public BigDecimal getChNodeId() {
		return this.chNodeId;
	}

	public void setChNodeId(BigDecimal chNodeId) {
		this.chNodeId = chNodeId;
	}

	public String getChgCycReqDate() {
		return this.chgCycReqDate;
	}

	public void setChgCycReqDate(String chgCycReqDate) {
		this.chgCycReqDate = chgCycReqDate;
	}

	public String getChgCycleInd() {
		return this.chgCycleInd;
	}

	public void setChgCycleInd(String chgCycleInd) {
		this.chgCycleInd = chgCycleInd;
	}

	public String getChgCycleReqSts() {
		return this.chgCycleReqSts;
	}

	public void setChgCycleReqSts(String chgCycleReqSts) {
		this.chgCycleReqSts = chgCycleReqSts;
	}

	public BigDecimal getConvRunNo() {
		return this.convRunNo;
	}

	public void setConvRunNo(BigDecimal convRunNo) {
		this.convRunNo = convRunNo;
	}

	public String getCreditClass() {
		return this.creditClass;
	}

	public void setCreditClass(String creditClass) {
		this.creditClass = creditClass;
	}

	public String getCustSubType() {
		return this.custSubType;
	}

	public void setCustSubType(String custSubType) {
		this.custSubType = custSubType;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerType() {
		return this.customerType;
	}

	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	public String getDealerCode() {
		return this.dealerCode;
	}

	public void setDealerCode(String dealerCode) {
		this.dealerCode = dealerCode;
	}

	public BigDecimal getDfltPostPcn() {
		return this.dfltPostPcn;
	}

	public void setDfltPostPcn(BigDecimal dfltPostPcn) {
		this.dfltPostPcn = dfltPostPcn;
	}

	public BigDecimal getDfltPrePcn() {
		return this.dfltPrePcn;
	}

	public void setDfltPrePcn(BigDecimal dfltPrePcn) {
		this.dfltPrePcn = dfltPrePcn;
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

	public String getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getEntityLockType() {
		return this.entityLockType;
	}

	public void setEntityLockType(String entityLockType) {
		this.entityLockType = entityLockType;
	}

	public String getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getFinancialLockType() {
		return this.financialLockType;
	}

	public void setFinancialLockType(String financialLockType) {
		this.financialLockType = financialLockType;
	}

	public String getL3AlarmNofifType() {
		return this.l3AlarmNofifType;
	}

	public void setL3AlarmNofifType(String l3AlarmNofifType) {
		this.l3AlarmNofifType = l3AlarmNofifType;
	}

	public BigDecimal getL3AlarmNotifThreshold() {
		return this.l3AlarmNotifThreshold;
	}

	public void setL3AlarmNotifThreshold(BigDecimal l3AlarmNotifThreshold) {
		this.l3AlarmNotifThreshold = l3AlarmNotifThreshold;
	}

	public BigDecimal getL3CrdLmtThreshold() {
		return this.l3CrdLmtThreshold;
	}

	public void setL3CrdLmtThreshold(BigDecimal l3CrdLmtThreshold) {
		this.l3CrdLmtThreshold = l3CrdLmtThreshold;
	}

	public String getL3CreditLimitInd() {
		return this.l3CreditLimitInd;
	}

	public void setL3CreditLimitInd(String l3CreditLimitInd) {
		this.l3CreditLimitInd = l3CreditLimitInd;
	}

	public String getL9BirthDate() {
		return this.l9BirthDate;
	}

	public void setL9BirthDate(String l9BirthDate) {
		this.l9BirthDate = l9BirthDate;
	}

	public String getL9BlacklistInd() {
		return this.l9BlacklistInd;
	}

	public void setL9BlacklistInd(String l9BlacklistInd) {
		this.l9BlacklistInd = l9BlacklistInd;
	}

	public String getL9BusinessType() {
		return this.l9BusinessType;
	}

	public void setL9BusinessType(String l9BusinessType) {
		this.l9BusinessType = l9BusinessType;
	}

	public String getL9ContactLang() {
		return this.l9ContactLang;
	}

	public void setL9ContactLang(String l9ContactLang) {
		this.l9ContactLang = l9ContactLang;
	}

	public String getL9Education() {
		return this.l9Education;
	}

	public void setL9Education(String l9Education) {
		this.l9Education = l9Education;
	}

	public String getL9EmployeeCode() {
		return this.l9EmployeeCode;
	}

	public void setL9EmployeeCode(String l9EmployeeCode) {
		this.l9EmployeeCode = l9EmployeeCode;
	}

	public String getL9EmploymentStatus() {
		return this.l9EmploymentStatus;
	}

	public void setL9EmploymentStatus(String l9EmploymentStatus) {
		this.l9EmploymentStatus = l9EmploymentStatus;
	}

	public String getL9Grading() {
		return this.l9Grading;
	}

	public void setL9Grading(String l9Grading) {
		this.l9Grading = l9Grading;
	}

	public String getL9Identification() {
		return this.l9Identification;
	}

	public void setL9Identification(String l9Identification) {
		this.l9Identification = l9Identification;
	}

	public String getL9IdentificationExpDate() {
		return this.l9IdentificationExpDate;
	}

	public void setL9IdentificationExpDate(String l9IdentificationExpDate) {
		this.l9IdentificationExpDate = l9IdentificationExpDate;
	}

	public String getL9IdentificationType() {
		return this.l9IdentificationType;
	}

	public void setL9IdentificationType(String l9IdentificationType) {
		this.l9IdentificationType = l9IdentificationType;
	}

	public String getL9IndustryType() {
		return this.l9IndustryType;
	}

	public void setL9IndustryType(String l9IndustryType) {
		this.l9IndustryType = l9IndustryType;
	}

	public String getL9InitTimeInAdd() {
		return this.l9InitTimeInAdd;
	}

	public void setL9InitTimeInAdd(String l9InitTimeInAdd) {
		this.l9InitTimeInAdd = l9InitTimeInAdd;
	}

	public String getL9JobType() {
		return this.l9JobType;
	}

	public void setL9JobType(String l9JobType) {
		this.l9JobType = l9JobType;
	}

	public String getL9Nationality() {
		return this.l9Nationality;
	}

	public void setL9Nationality(String l9Nationality) {
		this.l9Nationality = l9Nationality;
	}

	public String getL9NoOfEmployees() {
		return this.l9NoOfEmployees;
	}

	public void setL9NoOfEmployees(String l9NoOfEmployees) {
		this.l9NoOfEmployees = l9NoOfEmployees;
	}

	public String getL9Occupation() {
		return this.l9Occupation;
	}

	public void setL9Occupation(String l9Occupation) {
		this.l9Occupation = l9Occupation;
	}

	public String getL9PeriodOfWork() {
		return this.l9PeriodOfWork;
	}

	public void setL9PeriodOfWork(String l9PeriodOfWork) {
		this.l9PeriodOfWork = l9PeriodOfWork;
	}

	public String getL9Salary() {
		return this.l9Salary;
	}

	public void setL9Salary(String l9Salary) {
		this.l9Salary = l9Salary;
	}

	public String getL9SystemId() {
		return this.l9SystemId;
	}

	public void setL9SystemId(String l9SystemId) {
		this.l9SystemId = l9SystemId;
	}

	public String getL9TimeInBusiness() {
		return this.l9TimeInBusiness;
	}

	public void setL9TimeInBusiness(String l9TimeInBusiness) {
		this.l9TimeInBusiness = l9TimeInBusiness;
	}

	public BigDecimal getL9TotalSubscriber() {
		return this.l9TotalSubscriber;
	}

	public void setL9TotalSubscriber(BigDecimal l9TotalSubscriber) {
		this.l9TotalSubscriber = l9TotalSubscriber;
	}

	public String getL9TrueId() {
		return this.l9TrueId;
	}

	public void setL9TrueId(String l9TrueId) {
		this.l9TrueId = l9TrueId;
	}

	public BigDecimal getL9UserId() {
		return this.l9UserId;
	}

	public void setL9UserId(BigDecimal l9UserId) {
		this.l9UserId = l9UserId;
	}

	public String getLargeCustInd() {
		return this.largeCustInd;
	}

	public void setLargeCustInd(String largeCustInd) {
		this.largeCustInd = largeCustInd;
	}

	public String getLastActivityCode() {
		return this.lastActivityCode;
	}

	public void setLastActivityCode(String lastActivityCode) {
		this.lastActivityCode = lastActivityCode;
	}

	public String getLastActivityReasonCode() {
		return this.lastActivityReasonCode;
	}

	public void setLastActivityReasonCode(String lastActivityReasonCode) {
		this.lastActivityReasonCode = lastActivityReasonCode;
	}

	public BigDecimal getLegacyCustNo() {
		return this.legacyCustNo;
	}

	public void setLegacyCustNo(BigDecimal legacyCustNo) {
		this.legacyCustNo = legacyCustNo;
	}

	public String getMarketingChannel() {
		return this.marketingChannel;
	}

	public void setMarketingChannel(String marketingChannel) {
		this.marketingChannel = marketingChannel;
	}

	public BigDecimal getNewCycProdFreq() {
		return this.newCycProdFreq;
	}

	public void setNewCycProdFreq(BigDecimal newCycProdFreq) {
		this.newCycProdFreq = newCycProdFreq;
	}

	public BigDecimal getNewCycle() {
		return this.newCycle;
	}

	public void setNewCycle(BigDecimal newCycle) {
		this.newCycle = newCycle;
	}

	public BigDecimal getNewOnlinePartitionId() {
		return this.newOnlinePartitionId;
	}

	public void setNewOnlinePartitionId(BigDecimal newOnlinePartitionId) {
		this.newOnlinePartitionId = newOnlinePartitionId;
	}

	public BigDecimal getNewPartitionId() {
		return this.newPartitionId;
	}

	public void setNewPartitionId(BigDecimal newPartitionId) {
		this.newPartitionId = newPartitionId;
	}

	public String getOfferCurrency() {
		return this.offerCurrency;
	}

	public void setOfferCurrency(String offerCurrency) {
		this.offerCurrency = offerCurrency;
	}

	public BigDecimal getOnlinePartitionId() {
		return this.onlinePartitionId;
	}

	public void setOnlinePartitionId(BigDecimal onlinePartitionId) {
		this.onlinePartitionId = onlinePartitionId;
	}

	public String getOpenDate() {
		return this.openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	public int getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(int operatorId) {
		this.operatorId = operatorId;
	}

	public BigDecimal getPartitionId() {
		return this.partitionId;
	}

	public void setPartitionId(BigDecimal partitionId) {
		this.partitionId = partitionId;
	}

	public String getResourcePool() {
		return this.resourcePool;
	}

	public void setResourcePool(String resourcePool) {
		this.resourcePool = resourcePool;
	}

	public String getSpcMemoInd() {
		return this.spcMemoInd;
	}

	public void setSpcMemoInd(String spcMemoInd) {
		this.spcMemoInd = spcMemoInd;
	}

	public String getSysCreationDate() {
		return this.sysCreationDate;
	}

	public void setSysCreationDate(String sysCreationDate) {
		this.sysCreationDate = sysCreationDate;
	}

	public String getSysUpdateDate() {
		return this.sysUpdateDate;
	}

	public void setSysUpdateDate(String sysUpdateDate) {
		this.sysUpdateDate = sysUpdateDate;
	}

	public List<Subscriber> getSubscribers() {
		return subscribers;
	}

	public void setSubscribers(List<Subscriber> subscribers) {
		this.subscribers = subscribers;
	}

}
