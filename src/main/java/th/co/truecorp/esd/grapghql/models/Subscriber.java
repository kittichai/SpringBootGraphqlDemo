package th.co.truecorp.esd.grapghql.models;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.google.common.base.Supplier;

@Entity
@Table(name = "SUBSCRIBER")
public class Subscriber {

	@Column(name = "APPLICATION_ID")
	private String applicationId;

	@Column(name = "BUSINESS_ENTITY_ID")
	private BigDecimal businessEntityId;

	@Column(name = "CALC_PYM_CATEGORY")
	private String calcPymCategory;

	@Column(name = "CH_NODE_ID")
	private BigDecimal chNodeId;

	@Column(name = "CONV_RUN_NO")
	private BigDecimal convRunNo;

	@Column(name = "DEALER_CODE")
	private String dealerCode;

	@Column(name = "DL_SERVICE_CODE")
	private String dlServiceCode;

	@Column(name = "DL_UPDATE_STAMP")
	private BigDecimal dlUpdateStamp;

	// @Temporal(TemporalType.DATE)
	@Column(name = "EFFECTIVE_DATE")
	private Date effectiveDate;

	// @Temporal(TemporalType.DATE)
	@Column(name = "EXPIRATION_DATE")
	private Date expirationDate;

	@Column(name = "EXTERNAL_ID")
	private String externalId;

	// @Temporal(TemporalType.DATE)
	@Column(name = "INIT_ACT_DATE")
	private Date initActDate;

	@Column(name = "INITIAL_DLR_CODE")
	private String initialDlrCode;

	@Column(name = "INS_TRX_ID")
	private BigDecimal insTrxId;

	@Column(name = "L3_FIRST_RECHARGE_INDICATOR")
	private String l3FirstRechargeIndicator;

	@Column(name = "L9_ADDR_BAD_DEBT_FLAG")
	private String l9AddrBadDebtFlag;

	@Column(name = "L9_ADDR_FRD_FLAG")
	private String l9AddrFrdFlag;

	@Column(name = "L9_BAR_BY_RATER")
	private String l9BarByRater;

	// @Temporal(TemporalType.DATE)
	@Column(name = "L9_BARRING_ACT_DATE")
	private Date l9BarringActDate;

	@Column(name = "L9_BARRING_ACT_RSN")
	private String l9BarringActRsn;

	@Column(name = "L9_BARRING_BY_REQ")
	private String l9BarringByReq;

	// @Temporal(TemporalType.DATE)
	@Column(name = "L9_COL_LAST_ACT_DATE")
	private Date l9ColLastActDate;

	@Column(name = "L9_COL_RSN_CD")
	private String l9ColRsnCd;

	@Column(name = "L9_COL_STATUS")
	private String l9ColStatus;

	@Column(name = "L9_CONVERGENCE_CODE")
	private String l9ConvergenceCode;

	// @Temporal(TemporalType.DATE)
	@Column(name = "L9_CRD_LAST_ACT_DATE")
	private Date l9CrdLastActDate;

	// @Temporal(TemporalType.DATE)
	@Column(name = "L9_CRD_LM_SUB_ACT_DATE")
	private Date l9CrdLmSubActDate;

	@Column(name = "L9_CRD_LM_SUB_RSN_CD")
	private String l9CrdLmSubRsnCd;

	@Column(name = "L9_CRD_RSN_CD")
	private String l9CrdRsnCd;

	@Column(name = "L9_CRD_STATUS")
	private String l9CrdStatus;

	@Column(name = "L9_DEALER_APP")
	private String l9DealerApp;

	@Column(name = "L9_DONOR_OPERATOR")
	private String l9DonorOperator;

	@Column(name = "L9_DONOR_ZONE")
	private String l9DonorZone;

	@Column(name = "L9_IMSI_ALIAS")
	private String l9ImsiAlias;

	@Column(name = "L9_INSTALLATION_TYPE")
	private String l9InstallationType;

	@Column(name = "L9_LAST_ACTIVITY_ID")
	private BigDecimal l9LastActivityId;

	@Column(name = "L9_MARKETING_CODE")
	private String l9MarketingCode;

	@Column(name = "L9_MULTI_SIM_IND")
	private String l9MultiSimInd;

	@Column(name = "L9_PHASE_CODE")
	private String l9PhaseCode;

	@Column(name = "L9_PORT_IND")
	private String l9PortInd;

	@Column(name = "L9_PROJECT_CODE")
	private String l9ProjectCode;

	// @Temporal(TemporalType.DATE)
	@Column(name = "L9_PROOF_DATE")
	private Date l9ProofDate;

	@Column(name = "L9_PROOF_DOC")
	private String l9ProofDoc;

	@Column(name = "L9_REC_OPERATOR")
	private String l9RecOperator;

	@Column(name = "L9_REC_ZONE")
	private String l9RecZone;

	@Column(name = "L9_RELATED_SUBSCRIBER")
	private BigDecimal l9RelatedSubscriber;

	// @Temporal(TemporalType.DATE)
	@Column(name = "L9_RF_ACT_DATE")
	private Date l9RfActDate;

	@Column(name = "L9_RF_BAN")
	private BigDecimal l9RfBan;

	@Column(name = "L9_RF_SERVICE_LEVEL")
	private String l9RfServiceLevel;

	// @Temporal(TemporalType.DATE)
	@Column(name = "L9_RMV_ACT_DATE")
	private Date l9RmvActDate;

	@Column(name = "L9_RMV_BAN")
	private BigDecimal l9RmvBan;

	@Column(name = "L9_RMV_SERVICE_LEVEL")
	private String l9RmvServiceLevel;

	@Column(name = "L9_SALE_CHANNEL")
	private String l9SaleChannel;

	@Column(name = "L9_SALE_ID")
	private String l9SaleId;

	@Column(name = "L9_SMS_IND")
	private String l9SmsInd;

	@Column(name = "L9_SMS_LANGUAGE")
	private String l9SmsLanguage;

	@Column(name = "L9_SPLIT_PERIOD")
	private String l9SplitPeriod;

	// @Temporal(TemporalType.DATE)
	@Column(name = "L9_TMV_ACT_DATE")
	private Date l9TmvActDate;

	@Column(name = "L9_TMV_BAN")
	private BigDecimal l9TmvBan;

	@Column(name = "L9_TMV_SERVICE_LEVEL")
	private String l9TmvServiceLevel;

	@Column(name = "L9_TRUE_LIFE_ID")
	private String l9TrueLifeId;

	@Column(name = "LANGUAGE")
	private String language;

	@Column(name = "LINK_NEXT_SUB_NO")
	private BigDecimal linkNextSubNo;

	@Column(name = "LINK_PREV_SUB_NO")
	private BigDecimal linkPrevSubNo;

	@Column(name = "OPERATOR_ID")
	private BigDecimal operatorId;

	// @Temporal(TemporalType.DATE)
	@Column(name = "ORIG_ACT_DATE")
	private Date origActDate;

	@Column(name = "PRIM_RES_PARAM_CD")
	private String primResParamCd;

	@Column(name = "PRIM_RESOURCE_TP")
	private String primResourceTp;

	@Column(name = "PRIM_RESOURCE_VAL")
	private String primResourceVal;

	@Column(name = "REQUIRED_PARTITION")
	private String requiredPartition;

	@Column(name = "ROUTING_POLICY_ID")
	private BigDecimal routingPolicyId;

	@Column(name = "SUB_PASSWORD")
	private String subPassword;

	@Column(name = "SUB_SEQ_NO")
	private BigDecimal subSeqNo;

	@Column(name = "SUB_STATUS")
	private String subStatus;

	// @Temporal(TemporalType.DATE)
	@Column(name = "SUB_STATUS_DATE")
	private Date subStatusDate;

	// @Temporal(TemporalType.DATE)
	@Column(name = "SUB_STS_ISSUE_DATE")
	private Date subStsIssueDate;

	@Column(name = "SUB_STS_LAST_ACT")
	private String subStsLastAct;

	@Column(name = "SUB_STS_RSN_CD")
	private String subStsRsnCd;

	@Id
	@Column(name = "SUBSCRIBER_NO")
	private int subscriberNo;

	@Column(name = "SUBSCRIBER_TYPE")
	private String subscriberType;

	// @Temporal(TemporalType.DATE)
	@Column(name = "SYS_CREATION_DATE")
	private Date sysCreationDate;

	// @Temporal(TemporalType.DATE)
	@Column(name = "SYS_UPDATE_DATE")
	private Date sysUpdateDate;

	@Column(name = "TRX_ID")
	private BigDecimal trxId;

	// bi-directional many-to-one association to Customer
	//@OneToMany(fetch = FetchType.EAGER, mappedBy = "customer")
	@ManyToOne
	@JoinColumn(name = "CUSTOMER_ID")
	private Customer customer;

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public BigDecimal getBusinessEntityId() {
		return this.businessEntityId;
	}

	public void setBusinessEntityId(BigDecimal businessEntityId) {
		this.businessEntityId = businessEntityId;
	}

	public String getCalcPymCategory() {
		return this.calcPymCategory;
	}

	public void setCalcPymCategory(String calcPymCategory) {
		this.calcPymCategory = calcPymCategory;
	}

	public BigDecimal getChNodeId() {
		return this.chNodeId;
	}

	public void setChNodeId(BigDecimal chNodeId) {
		this.chNodeId = chNodeId;
	}

	public BigDecimal getConvRunNo() {
		return this.convRunNo;
	}

	public void setConvRunNo(BigDecimal convRunNo) {
		this.convRunNo = convRunNo;
	}

	public String getDealerCode() {
		return this.dealerCode;
	}

	public void setDealerCode(String dealerCode) {
		this.dealerCode = dealerCode;
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

	public Date getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Date getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public Date getInitActDate() {
		return this.initActDate;
	}

	public void setInitActDate(Date initActDate) {
		this.initActDate = initActDate;
	}

	public String getInitialDlrCode() {
		return this.initialDlrCode;
	}

	public void setInitialDlrCode(String initialDlrCode) {
		this.initialDlrCode = initialDlrCode;
	}

	public BigDecimal getInsTrxId() {
		return this.insTrxId;
	}

	public void setInsTrxId(BigDecimal insTrxId) {
		this.insTrxId = insTrxId;
	}

	public String getL3FirstRechargeIndicator() {
		return this.l3FirstRechargeIndicator;
	}

	public void setL3FirstRechargeIndicator(String l3FirstRechargeIndicator) {
		this.l3FirstRechargeIndicator = l3FirstRechargeIndicator;
	}

	public String getL9AddrBadDebtFlag() {
		return this.l9AddrBadDebtFlag;
	}

	public void setL9AddrBadDebtFlag(String l9AddrBadDebtFlag) {
		this.l9AddrBadDebtFlag = l9AddrBadDebtFlag;
	}

	public String getL9AddrFrdFlag() {
		return this.l9AddrFrdFlag;
	}

	public void setL9AddrFrdFlag(String l9AddrFrdFlag) {
		this.l9AddrFrdFlag = l9AddrFrdFlag;
	}

	public String getL9BarByRater() {
		return this.l9BarByRater;
	}

	public void setL9BarByRater(String l9BarByRater) {
		this.l9BarByRater = l9BarByRater;
	}

	public Date getL9BarringActDate() {
		return this.l9BarringActDate;
	}

	public void setL9BarringActDate(Date l9BarringActDate) {
		this.l9BarringActDate = l9BarringActDate;
	}

	public String getL9BarringActRsn() {
		return this.l9BarringActRsn;
	}

	public void setL9BarringActRsn(String l9BarringActRsn) {
		this.l9BarringActRsn = l9BarringActRsn;
	}

	public String getL9BarringByReq() {
		return this.l9BarringByReq;
	}

	public void setL9BarringByReq(String l9BarringByReq) {
		this.l9BarringByReq = l9BarringByReq;
	}

	public Date getL9ColLastActDate() {
		return this.l9ColLastActDate;
	}

	public void setL9ColLastActDate(Date l9ColLastActDate) {
		this.l9ColLastActDate = l9ColLastActDate;
	}

	public String getL9ColRsnCd() {
		return this.l9ColRsnCd;
	}

	public void setL9ColRsnCd(String l9ColRsnCd) {
		this.l9ColRsnCd = l9ColRsnCd;
	}

	public String getL9ColStatus() {
		return this.l9ColStatus;
	}

	public void setL9ColStatus(String l9ColStatus) {
		this.l9ColStatus = l9ColStatus;
	}

	public String getL9ConvergenceCode() {
		return this.l9ConvergenceCode;
	}

	public void setL9ConvergenceCode(String l9ConvergenceCode) {
		this.l9ConvergenceCode = l9ConvergenceCode;
	}

	public Date getL9CrdLastActDate() {
		return this.l9CrdLastActDate;
	}

	public void setL9CrdLastActDate(Date l9CrdLastActDate) {
		this.l9CrdLastActDate = l9CrdLastActDate;
	}

	public Date getL9CrdLmSubActDate() {
		return this.l9CrdLmSubActDate;
	}

	public void setL9CrdLmSubActDate(Date l9CrdLmSubActDate) {
		this.l9CrdLmSubActDate = l9CrdLmSubActDate;
	}

	public String getL9CrdLmSubRsnCd() {
		return this.l9CrdLmSubRsnCd;
	}

	public void setL9CrdLmSubRsnCd(String l9CrdLmSubRsnCd) {
		this.l9CrdLmSubRsnCd = l9CrdLmSubRsnCd;
	}

	public String getL9CrdRsnCd() {
		return this.l9CrdRsnCd;
	}

	public void setL9CrdRsnCd(String l9CrdRsnCd) {
		this.l9CrdRsnCd = l9CrdRsnCd;
	}

	public String getL9CrdStatus() {
		return this.l9CrdStatus;
	}

	public void setL9CrdStatus(String l9CrdStatus) {
		this.l9CrdStatus = l9CrdStatus;
	}

	public String getL9DealerApp() {
		return this.l9DealerApp;
	}

	public void setL9DealerApp(String l9DealerApp) {
		this.l9DealerApp = l9DealerApp;
	}

	public String getL9DonorOperator() {
		return this.l9DonorOperator;
	}

	public void setL9DonorOperator(String l9DonorOperator) {
		this.l9DonorOperator = l9DonorOperator;
	}

	public String getL9DonorZone() {
		return this.l9DonorZone;
	}

	public void setL9DonorZone(String l9DonorZone) {
		this.l9DonorZone = l9DonorZone;
	}

	public String getL9ImsiAlias() {
		return this.l9ImsiAlias;
	}

	public void setL9ImsiAlias(String l9ImsiAlias) {
		this.l9ImsiAlias = l9ImsiAlias;
	}

	public String getL9InstallationType() {
		return this.l9InstallationType;
	}

	public void setL9InstallationType(String l9InstallationType) {
		this.l9InstallationType = l9InstallationType;
	}

	public BigDecimal getL9LastActivityId() {
		return this.l9LastActivityId;
	}

	public void setL9LastActivityId(BigDecimal l9LastActivityId) {
		this.l9LastActivityId = l9LastActivityId;
	}

	public String getL9MarketingCode() {
		return this.l9MarketingCode;
	}

	public void setL9MarketingCode(String l9MarketingCode) {
		this.l9MarketingCode = l9MarketingCode;
	}

	public String getL9MultiSimInd() {
		return this.l9MultiSimInd;
	}

	public void setL9MultiSimInd(String l9MultiSimInd) {
		this.l9MultiSimInd = l9MultiSimInd;
	}

	public String getL9PhaseCode() {
		return this.l9PhaseCode;
	}

	public void setL9PhaseCode(String l9PhaseCode) {
		this.l9PhaseCode = l9PhaseCode;
	}

	public String getL9PortInd() {
		return this.l9PortInd;
	}

	public void setL9PortInd(String l9PortInd) {
		this.l9PortInd = l9PortInd;
	}

	public String getL9ProjectCode() {
		return this.l9ProjectCode;
	}

	public void setL9ProjectCode(String l9ProjectCode) {
		this.l9ProjectCode = l9ProjectCode;
	}

	public Date getL9ProofDate() {
		return this.l9ProofDate;
	}

	public void setL9ProofDate(Date l9ProofDate) {
		this.l9ProofDate = l9ProofDate;
	}

	public String getL9ProofDoc() {
		return this.l9ProofDoc;
	}

	public void setL9ProofDoc(String l9ProofDoc) {
		this.l9ProofDoc = l9ProofDoc;
	}

	public String getL9RecOperator() {
		return this.l9RecOperator;
	}

	public void setL9RecOperator(String l9RecOperator) {
		this.l9RecOperator = l9RecOperator;
	}

	public String getL9RecZone() {
		return this.l9RecZone;
	}

	public void setL9RecZone(String l9RecZone) {
		this.l9RecZone = l9RecZone;
	}

	public BigDecimal getL9RelatedSubscriber() {
		return this.l9RelatedSubscriber;
	}

	public void setL9RelatedSubscriber(BigDecimal l9RelatedSubscriber) {
		this.l9RelatedSubscriber = l9RelatedSubscriber;
	}

	public Date getL9RfActDate() {
		return this.l9RfActDate;
	}

	public void setL9RfActDate(Date l9RfActDate) {
		this.l9RfActDate = l9RfActDate;
	}

	public BigDecimal getL9RfBan() {
		return this.l9RfBan;
	}

	public void setL9RfBan(BigDecimal l9RfBan) {
		this.l9RfBan = l9RfBan;
	}

	public String getL9RfServiceLevel() {
		return this.l9RfServiceLevel;
	}

	public void setL9RfServiceLevel(String l9RfServiceLevel) {
		this.l9RfServiceLevel = l9RfServiceLevel;
	}

	public Date getL9RmvActDate() {
		return this.l9RmvActDate;
	}

	public void setL9RmvActDate(Date l9RmvActDate) {
		this.l9RmvActDate = l9RmvActDate;
	}

	public BigDecimal getL9RmvBan() {
		return this.l9RmvBan;
	}

	public void setL9RmvBan(BigDecimal l9RmvBan) {
		this.l9RmvBan = l9RmvBan;
	}

	public String getL9RmvServiceLevel() {
		return this.l9RmvServiceLevel;
	}

	public void setL9RmvServiceLevel(String l9RmvServiceLevel) {
		this.l9RmvServiceLevel = l9RmvServiceLevel;
	}

	public String getL9SaleChannel() {
		return this.l9SaleChannel;
	}

	public void setL9SaleChannel(String l9SaleChannel) {
		this.l9SaleChannel = l9SaleChannel;
	}

	public String getL9SaleId() {
		return this.l9SaleId;
	}

	public void setL9SaleId(String l9SaleId) {
		this.l9SaleId = l9SaleId;
	}

	public String getL9SmsInd() {
		return this.l9SmsInd;
	}

	public void setL9SmsInd(String l9SmsInd) {
		this.l9SmsInd = l9SmsInd;
	}

	public String getL9SmsLanguage() {
		return this.l9SmsLanguage;
	}

	public void setL9SmsLanguage(String l9SmsLanguage) {
		this.l9SmsLanguage = l9SmsLanguage;
	}

	public String getL9SplitPeriod() {
		return this.l9SplitPeriod;
	}

	public void setL9SplitPeriod(String l9SplitPeriod) {
		this.l9SplitPeriod = l9SplitPeriod;
	}

	public Date getL9TmvActDate() {
		return this.l9TmvActDate;
	}

	public void setL9TmvActDate(Date l9TmvActDate) {
		this.l9TmvActDate = l9TmvActDate;
	}

	public BigDecimal getL9TmvBan() {
		return this.l9TmvBan;
	}

	public void setL9TmvBan(BigDecimal l9TmvBan) {
		this.l9TmvBan = l9TmvBan;
	}

	public String getL9TmvServiceLevel() {
		return this.l9TmvServiceLevel;
	}

	public void setL9TmvServiceLevel(String l9TmvServiceLevel) {
		this.l9TmvServiceLevel = l9TmvServiceLevel;
	}

	public String getL9TrueLifeId() {
		return this.l9TrueLifeId;
	}

	public void setL9TrueLifeId(String l9TrueLifeId) {
		this.l9TrueLifeId = l9TrueLifeId;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public BigDecimal getLinkNextSubNo() {
		return this.linkNextSubNo;
	}

	public void setLinkNextSubNo(BigDecimal linkNextSubNo) {
		this.linkNextSubNo = linkNextSubNo;
	}

	public BigDecimal getLinkPrevSubNo() {
		return this.linkPrevSubNo;
	}

	public void setLinkPrevSubNo(BigDecimal linkPrevSubNo) {
		this.linkPrevSubNo = linkPrevSubNo;
	}

	public BigDecimal getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(BigDecimal operatorId) {
		this.operatorId = operatorId;
	}

	public Date getOrigActDate() {
		return this.origActDate;
	}

	public void setOrigActDate(Date origActDate) {
		this.origActDate = origActDate;
	}

	public String getPrimResParamCd() {
		return this.primResParamCd;
	}

	public void setPrimResParamCd(String primResParamCd) {
		this.primResParamCd = primResParamCd;
	}

	public String getPrimResourceTp() {
		return this.primResourceTp;
	}

	public void setPrimResourceTp(String primResourceTp) {
		this.primResourceTp = primResourceTp;
	}

	public String getPrimResourceVal() {
		return this.primResourceVal;
	}

	public void setPrimResourceVal(String primResourceVal) {
		this.primResourceVal = primResourceVal;
	}

	public String getRequiredPartition() {
		return this.requiredPartition;
	}

	public void setRequiredPartition(String requiredPartition) {
		this.requiredPartition = requiredPartition;
	}

	public BigDecimal getRoutingPolicyId() {
		return this.routingPolicyId;
	}

	public void setRoutingPolicyId(BigDecimal routingPolicyId) {
		this.routingPolicyId = routingPolicyId;
	}

	public String getSubPassword() {
		return this.subPassword;
	}

	public void setSubPassword(String subPassword) {
		this.subPassword = subPassword;
	}

	public BigDecimal getSubSeqNo() {
		return this.subSeqNo;
	}

	public void setSubSeqNo(BigDecimal subSeqNo) {
		this.subSeqNo = subSeqNo;
	}

	public String getSubStatus() {
		return this.subStatus;
	}

	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}

	public Date getSubStatusDate() {
		return this.subStatusDate;
	}

	public void setSubStatusDate(Date subStatusDate) {
		this.subStatusDate = subStatusDate;
	}

	public Date getSubStsIssueDate() {
		return this.subStsIssueDate;
	}

	public void setSubStsIssueDate(Date subStsIssueDate) {
		this.subStsIssueDate = subStsIssueDate;
	}

	public String getSubStsLastAct() {
		return this.subStsLastAct;
	}

	public void setSubStsLastAct(String subStsLastAct) {
		this.subStsLastAct = subStsLastAct;
	}

	public String getSubStsRsnCd() {
		return this.subStsRsnCd;
	}

	public void setSubStsRsnCd(String subStsRsnCd) {
		this.subStsRsnCd = subStsRsnCd;
	}

	public int getSubscriberNo() {
		return this.subscriberNo;
	}

	public void setSubscriberNo(int subscriberNo) {
		this.subscriberNo = subscriberNo;
	}

	public String getSubscriberType() {
		return this.subscriberType;
	}

	public void setSubscriberType(String subscriberType) {
		this.subscriberType = subscriberType;
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

	public BigDecimal getTrxId() {
		return this.trxId;
	}

	public void setTrxId(BigDecimal trxId) {
		this.trxId = trxId;
	}

	public Customer getCustomer() {
		
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Subscriber() {
	}
}
