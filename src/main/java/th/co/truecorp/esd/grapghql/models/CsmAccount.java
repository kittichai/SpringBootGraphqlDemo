package th.co.truecorp.esd.grapghql.models;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/*
import model.CsmPayChannel;
import model.JoinColumn;
import model.OneToOne;
import model.Temporal;
*/

@Entity
@Table(name = "CSM_ACCOUNT")
public class CsmAccount {

	@Column(name = "ACCT_BAL_POLICY")
	private String acctBalPolicy;

	@Column(name = "APPLICATION_ID")
	private String applicationId;

	@Column(name = "BILLING_CURRENCY")
	private String billingCurrency;

	@Column(name = "BUSINESS_ENTITY_ID")
	private BigDecimal businessEntityId;

	@Column(name = "COLL_FIX_CSR_CD")
	private String collFixCsrCd;

	@Column(name = "COLL_FIX_POLICY_CD")
	private String collFixPolicyCd;

	@Column(name = "COLL_IND")
	private String collInd;

	@Column(name = "COLL_PRMT_WAVE_IND")
	private String collPrmtWaveInd;

	@Column(name = "COLL_PUNISHMENT_LEVELS")
	private String collPunishmentLevels;

	// @Temporal(TemporalType.DATE)
	@Column(name = "COLL_START_DATE")
	private Date collStartDate;

	@Column(name = "COLL_STATUS")
	private String collStatus;

	@Column(name = "CONV_RUN_NO")
	private BigDecimal convRunNo;

	@Id
	@Column(name = "CUSTOMER_ID")
	private String customerId;

	@Column(name = "DL_SERVICE_CODE")
	private String dlServiceCode;

	@Column(name = "DL_UPDATE_STAMP")
	private BigDecimal dlUpdateStamp;

	@Column(name = "DOCUMENT_TYPE")
	private String documentType;

	@Column(name = "EXTERNAL_ID")
	private String externalId;

	@Column(name = "FULL_SUSPENSION_IND")
	private String fullSuspensionInd;

	@Column(name = "L3_SUSPENSION_RSN")
	private String l3SuspensionRsn;

	@Column(name = "L9_ACC_STS_BAN")
	private BigDecimal l9AccStsBan;

	@Column(name = "L9_ACC_SUB_TYPE")
	private String l9AccSubType;

	@Column(name = "L9_ACCOUNT_PRIORITY")
	private String l9AccountPriority;

	@Column(name = "L9_AGREEMENT_ID")
	private BigDecimal l9AgreementId;

	@Column(name = "L9_ATB_CHARITY_CODE")
	private String l9AtbCharityCode;

	@Column(name = "L9_AUTO_BLACKLIST_IND")
	private String l9AutoBlacklistInd;

	@Column(name = "L9_AUTO_BLACKLIST_RSN_CD")
	private String l9AutoBlacklistRsnCd;

	// @Temporal(TemporalType.DATE)
	@Column(name = "L9_AUTO_BLACKLIST_UP_DATE")
	private Date l9AutoBlacklistUpDate;

	// @Temporal(TemporalType.DATE)
	@Column(name = "L9_CL_WAIVER_UPD_DATE")
	private Date l9ClWaiverUpdDate;

	// @Temporal(TemporalType.DATE)
	@Column(name = "L9_COL_LAST_ACT_DATE")
	private Date l9ColLastActDate;

	@Column(name = "L9_COL_RSN_CD")
	private String l9ColRsnCd;

	@Column(name = "L9_COL_STATUS")
	private String l9ColStatus;

	// @Temporal(TemporalType.DATE)
	@Column(name = "L9_COLL_WAIVER_EXP_DATE")
	private Date l9CollWaiverExpDate;

	@Column(name = "L9_COMPANY_CODE")
	private String l9CompanyCode;

	// @Temporal(TemporalType.DATE)
	@Column(name = "L9_CONV_EFFECTIVE_DATE")
	private Date l9ConvEffectiveDate;

	@Column(name = "L9_CONVERGENCE_CODE")
	private String l9ConvergenceCode;

	// @Temporal(TemporalType.DATE)
	@Column(name = "L9_CRD_LAST_ACT_DATE")
	private Date l9CrdLastActDate;

	@Column(name = "L9_CRD_LMT_FIX_POLICY_CD")
	private String l9CrdLmtFixPolicyCd;

	// @Temporal(TemporalType.DATE)
	@Column(name = "L9_CRD_LMT_WAIVER_EXP_DATE")
	private Date l9CrdLmtWaiverExpDate;

	@Column(name = "L9_CRD_LMT_WAIVER_IND")
	private String l9CrdLmtWaiverInd;

	@Column(name = "L9_CRD_RSN_CD")
	private String l9CrdRsnCd;

	@Column(name = "L9_CRD_STATUS")
	private String l9CrdStatus;

	@Column(name = "L9_CREDIT_CLASS")
	private String l9CreditClass;

	// @Temporal(TemporalType.DATE)
	@Column(name = "L9_CREDIT_CLASS_UPD_DATE")
	private Date l9CreditClassUpdDate;

	// @Temporal(TemporalType.DATE)
	@Column(name = "L9_CREDIT_LIMIT_EXP_DATE")
	private Date l9CreditLimitExpDate;

	@Column(name = "L9_CREDIT_LIMIT_RSN_CODE")
	private String l9CreditLimitRsnCode;

	@Column(name = "L9_CUST_BRANCH_NO")
	private String l9CustBranchNo;

	@Column(name = "L9_CUST_TAX_ID")
	private String l9CustTaxId;

	@Column(name = "L9_IDD_INDICATOR")
	private String l9IddIndicator;

	@Column(name = "L9_INITIATION_REASON")
	private String l9InitiationReason;

	@Column(name = "L9_IR_INDICATOR")
	private String l9IrIndicator;

	@Column(name = "L9_LEGACY_BAN")
	private BigDecimal l9LegacyBan;

	@Column(name = "L9_MANUAL_BLACKLIST_IND")
	private String l9ManualBlacklistInd;

	@Column(name = "L9_MANUAL_BLACKLIST_RSN_CD")
	private String l9ManualBlacklistRsnCd;

	// @Temporal(TemporalType.DATE)
	@Column(name = "L9_MANUAL_BLACKLIST_UP_DATE")
	private Date l9ManualBlacklistUpDate;

	// @Temporal(TemporalType.DATE)
	@Column(name = "L9_OBLG_CALC_FORM_UPD_DATE")
	private Date l9OblgCalcFormUpdDate;

	@Column(name = "L9_OBLIGATION_CALC_FORMULA")
	private String l9ObligationCalcFormula;

	@Column(name = "L9_OPERATOR_ID")
	private BigDecimal l9OperatorId;

	@Column(name = "L9_OPERATOR_NAME")
	private String l9OperatorName;

	@Column(name = "L9_PARENT_BAN")
	private BigDecimal l9ParentBan;

	// @Temporal(TemporalType.DATE)
	@Column(name = "L9_PERSONAL_CL_UPD_DATE")
	private Date l9PersonalClUpdDate;

	@Column(name = "L9_PRSNL_CREDIT_LIMIT")
	private BigDecimal l9PrsnlCreditLimit;

	@Column(name = "L9_RELATED_OU")
	private BigDecimal l9RelatedOu;

	@Column(name = "L9_SPECIAL_INSTRUCTIONS")
	private String l9SpecialInstructions;

	// @Temporal(TemporalType.DATE)
	@Column(name = "L9_TEMP_CL_UPD_DATE")
	private Date l9TempClUpdDate;

	@Column(name = "L9_TEMP_CREDIT_LIMIT")
	private BigDecimal l9TempCreditLimit;

	@Column(name = "L9_WHT_CERTI_NO")
	private String l9WhtCertiNo;

	@Column(name = "L9_WHT_IND")
	private String l9WhtInd;

	// @Temporal(TemporalType.DATE)
	@Column(name = "L9_WHT_TAX_UP_DATE")
	private Date l9WhtTaxUpDate;

	// @Temporal(TemporalType.DATE)
	@Column(name = "OPEN_DATE")
	private Date openDate;

	@Column(name = "OPERATOR_ID")
	private BigDecimal operatorId;

	@Column(name = "SUSPENTION_TYPE")
	private String suspentionType;

	// @Temporal(TemporalType.DATE)
	@Column(name = "SYS_CREATION_DATE")
	private Date sysCreationDate;

	// @Temporal(TemporalType.DATE)
	@Column(name = "SYS_UPDATE_DATE")
	private Date sysUpdateDate;

	// bi-directional one-to-one association to CsmPayChannel
	@OneToOne
	@JoinColumn(name = "BAN", referencedColumnName = "BAN")
	private CsmPayChannel csmPayChannel;

	public CsmAccount() {
	}

	public String getAcctBalPolicy() {
		return this.acctBalPolicy;
	}

	public void setAcctBalPolicy(String acctBalPolicy) {
		this.acctBalPolicy = acctBalPolicy;
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getBillingCurrency() {
		return this.billingCurrency;
	}

	public void setBillingCurrency(String billingCurrency) {
		this.billingCurrency = billingCurrency;
	}

	public BigDecimal getBusinessEntityId() {
		return this.businessEntityId;
	}

	public void setBusinessEntityId(BigDecimal businessEntityId) {
		this.businessEntityId = businessEntityId;
	}

	public String getCollFixCsrCd() {
		return this.collFixCsrCd;
	}

	public void setCollFixCsrCd(String collFixCsrCd) {
		this.collFixCsrCd = collFixCsrCd;
	}

	public String getCollFixPolicyCd() {
		return this.collFixPolicyCd;
	}

	public void setCollFixPolicyCd(String collFixPolicyCd) {
		this.collFixPolicyCd = collFixPolicyCd;
	}

	public String getCollInd() {
		return this.collInd;
	}

	public void setCollInd(String collInd) {
		this.collInd = collInd;
	}

	public String getCollPrmtWaveInd() {
		return this.collPrmtWaveInd;
	}

	public void setCollPrmtWaveInd(String collPrmtWaveInd) {
		this.collPrmtWaveInd = collPrmtWaveInd;
	}

	public String getCollPunishmentLevels() {
		return this.collPunishmentLevels;
	}

	public void setCollPunishmentLevels(String collPunishmentLevels) {
		this.collPunishmentLevels = collPunishmentLevels;
	}

	public Date getCollStartDate() {
		return this.collStartDate;
	}

	public void setCollStartDate(Date collStartDate) {
		this.collStartDate = collStartDate;
	}

	public String getCollStatus() {
		return this.collStatus;
	}

	public void setCollStatus(String collStatus) {
		this.collStatus = collStatus;
	}

	public BigDecimal getConvRunNo() {
		return this.convRunNo;
	}

	public void setConvRunNo(BigDecimal convRunNo) {
		this.convRunNo = convRunNo;
	}

	public String getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(String customerId) {
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

	public String getDocumentType() {
		return this.documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getExternalId() {
		return this.externalId;
	}

	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	public String getFullSuspensionInd() {
		return this.fullSuspensionInd;
	}

	public void setFullSuspensionInd(String fullSuspensionInd) {
		this.fullSuspensionInd = fullSuspensionInd;
	}

	public String getL3SuspensionRsn() {
		return this.l3SuspensionRsn;
	}

	public void setL3SuspensionRsn(String l3SuspensionRsn) {
		this.l3SuspensionRsn = l3SuspensionRsn;
	}

	public BigDecimal getL9AccStsBan() {
		return this.l9AccStsBan;
	}

	public void setL9AccStsBan(BigDecimal l9AccStsBan) {
		this.l9AccStsBan = l9AccStsBan;
	}

	public String getL9AccSubType() {
		return this.l9AccSubType;
	}

	public void setL9AccSubType(String l9AccSubType) {
		this.l9AccSubType = l9AccSubType;
	}

	public String getL9AccountPriority() {
		return this.l9AccountPriority;
	}

	public void setL9AccountPriority(String l9AccountPriority) {
		this.l9AccountPriority = l9AccountPriority;
	}

	public BigDecimal getL9AgreementId() {
		return this.l9AgreementId;
	}

	public void setL9AgreementId(BigDecimal l9AgreementId) {
		this.l9AgreementId = l9AgreementId;
	}

	public String getL9AtbCharityCode() {
		return this.l9AtbCharityCode;
	}

	public void setL9AtbCharityCode(String l9AtbCharityCode) {
		this.l9AtbCharityCode = l9AtbCharityCode;
	}

	public String getL9AutoBlacklistInd() {
		return this.l9AutoBlacklistInd;
	}

	public void setL9AutoBlacklistInd(String l9AutoBlacklistInd) {
		this.l9AutoBlacklistInd = l9AutoBlacklistInd;
	}

	public String getL9AutoBlacklistRsnCd() {
		return this.l9AutoBlacklistRsnCd;
	}

	public void setL9AutoBlacklistRsnCd(String l9AutoBlacklistRsnCd) {
		this.l9AutoBlacklistRsnCd = l9AutoBlacklistRsnCd;
	}

	public Date getL9AutoBlacklistUpDate() {
		return this.l9AutoBlacklistUpDate;
	}

	public void setL9AutoBlacklistUpDate(Date l9AutoBlacklistUpDate) {
		this.l9AutoBlacklistUpDate = l9AutoBlacklistUpDate;
	}

	public Date getL9ClWaiverUpdDate() {
		return this.l9ClWaiverUpdDate;
	}

	public void setL9ClWaiverUpdDate(Date l9ClWaiverUpdDate) {
		this.l9ClWaiverUpdDate = l9ClWaiverUpdDate;
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

	public Date getL9CollWaiverExpDate() {
		return this.l9CollWaiverExpDate;
	}

	public void setL9CollWaiverExpDate(Date l9CollWaiverExpDate) {
		this.l9CollWaiverExpDate = l9CollWaiverExpDate;
	}

	public String getL9CompanyCode() {
		return this.l9CompanyCode;
	}

	public void setL9CompanyCode(String l9CompanyCode) {
		this.l9CompanyCode = l9CompanyCode;
	}

	public Date getL9ConvEffectiveDate() {
		return this.l9ConvEffectiveDate;
	}

	public void setL9ConvEffectiveDate(Date l9ConvEffectiveDate) {
		this.l9ConvEffectiveDate = l9ConvEffectiveDate;
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

	public String getL9CrdLmtFixPolicyCd() {
		return this.l9CrdLmtFixPolicyCd;
	}

	public void setL9CrdLmtFixPolicyCd(String l9CrdLmtFixPolicyCd) {
		this.l9CrdLmtFixPolicyCd = l9CrdLmtFixPolicyCd;
	}

	public Date getL9CrdLmtWaiverExpDate() {
		return this.l9CrdLmtWaiverExpDate;
	}

	public void setL9CrdLmtWaiverExpDate(Date l9CrdLmtWaiverExpDate) {
		this.l9CrdLmtWaiverExpDate = l9CrdLmtWaiverExpDate;
	}

	public String getL9CrdLmtWaiverInd() {
		return this.l9CrdLmtWaiverInd;
	}

	public void setL9CrdLmtWaiverInd(String l9CrdLmtWaiverInd) {
		this.l9CrdLmtWaiverInd = l9CrdLmtWaiverInd;
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

	public String getL9CreditClass() {
		return this.l9CreditClass;
	}

	public void setL9CreditClass(String l9CreditClass) {
		this.l9CreditClass = l9CreditClass;
	}

	public Date getL9CreditClassUpdDate() {
		return this.l9CreditClassUpdDate;
	}

	public void setL9CreditClassUpdDate(Date l9CreditClassUpdDate) {
		this.l9CreditClassUpdDate = l9CreditClassUpdDate;
	}

	public Date getL9CreditLimitExpDate() {
		return this.l9CreditLimitExpDate;
	}

	public void setL9CreditLimitExpDate(Date l9CreditLimitExpDate) {
		this.l9CreditLimitExpDate = l9CreditLimitExpDate;
	}

	public String getL9CreditLimitRsnCode() {
		return this.l9CreditLimitRsnCode;
	}

	public void setL9CreditLimitRsnCode(String l9CreditLimitRsnCode) {
		this.l9CreditLimitRsnCode = l9CreditLimitRsnCode;
	}

	public String getL9CustBranchNo() {
		return this.l9CustBranchNo;
	}

	public void setL9CustBranchNo(String l9CustBranchNo) {
		this.l9CustBranchNo = l9CustBranchNo;
	}

	public String getL9CustTaxId() {
		return this.l9CustTaxId;
	}

	public void setL9CustTaxId(String l9CustTaxId) {
		this.l9CustTaxId = l9CustTaxId;
	}

	public String getL9IddIndicator() {
		return this.l9IddIndicator;
	}

	public void setL9IddIndicator(String l9IddIndicator) {
		this.l9IddIndicator = l9IddIndicator;
	}

	public String getL9InitiationReason() {
		return this.l9InitiationReason;
	}

	public void setL9InitiationReason(String l9InitiationReason) {
		this.l9InitiationReason = l9InitiationReason;
	}

	public String getL9IrIndicator() {
		return this.l9IrIndicator;
	}

	public void setL9IrIndicator(String l9IrIndicator) {
		this.l9IrIndicator = l9IrIndicator;
	}

	public BigDecimal getL9LegacyBan() {
		return this.l9LegacyBan;
	}

	public void setL9LegacyBan(BigDecimal l9LegacyBan) {
		this.l9LegacyBan = l9LegacyBan;
	}

	public String getL9ManualBlacklistInd() {
		return this.l9ManualBlacklistInd;
	}

	public void setL9ManualBlacklistInd(String l9ManualBlacklistInd) {
		this.l9ManualBlacklistInd = l9ManualBlacklistInd;
	}

	public String getL9ManualBlacklistRsnCd() {
		return this.l9ManualBlacklistRsnCd;
	}

	public void setL9ManualBlacklistRsnCd(String l9ManualBlacklistRsnCd) {
		this.l9ManualBlacklistRsnCd = l9ManualBlacklistRsnCd;
	}

	public Date getL9ManualBlacklistUpDate() {
		return this.l9ManualBlacklistUpDate;
	}

	public void setL9ManualBlacklistUpDate(Date l9ManualBlacklistUpDate) {
		this.l9ManualBlacklistUpDate = l9ManualBlacklistUpDate;
	}

	public Date getL9OblgCalcFormUpdDate() {
		return this.l9OblgCalcFormUpdDate;
	}

	public void setL9OblgCalcFormUpdDate(Date l9OblgCalcFormUpdDate) {
		this.l9OblgCalcFormUpdDate = l9OblgCalcFormUpdDate;
	}

	public String getL9ObligationCalcFormula() {
		return this.l9ObligationCalcFormula;
	}

	public void setL9ObligationCalcFormula(String l9ObligationCalcFormula) {
		this.l9ObligationCalcFormula = l9ObligationCalcFormula;
	}

	public BigDecimal getL9OperatorId() {
		return this.l9OperatorId;
	}

	public void setL9OperatorId(BigDecimal l9OperatorId) {
		this.l9OperatorId = l9OperatorId;
	}

	public String getL9OperatorName() {
		return this.l9OperatorName;
	}

	public void setL9OperatorName(String l9OperatorName) {
		this.l9OperatorName = l9OperatorName;
	}

	public BigDecimal getL9ParentBan() {
		return this.l9ParentBan;
	}

	public void setL9ParentBan(BigDecimal l9ParentBan) {
		this.l9ParentBan = l9ParentBan;
	}

	public Date getL9PersonalClUpdDate() {
		return this.l9PersonalClUpdDate;
	}

	public void setL9PersonalClUpdDate(Date l9PersonalClUpdDate) {
		this.l9PersonalClUpdDate = l9PersonalClUpdDate;
	}

	public BigDecimal getL9PrsnlCreditLimit() {
		return this.l9PrsnlCreditLimit;
	}

	public void setL9PrsnlCreditLimit(BigDecimal l9PrsnlCreditLimit) {
		this.l9PrsnlCreditLimit = l9PrsnlCreditLimit;
	}

	public BigDecimal getL9RelatedOu() {
		return this.l9RelatedOu;
	}

	public void setL9RelatedOu(BigDecimal l9RelatedOu) {
		this.l9RelatedOu = l9RelatedOu;
	}

	public String getL9SpecialInstructions() {
		return this.l9SpecialInstructions;
	}

	public void setL9SpecialInstructions(String l9SpecialInstructions) {
		this.l9SpecialInstructions = l9SpecialInstructions;
	}

	public Date getL9TempClUpdDate() {
		return this.l9TempClUpdDate;
	}

	public void setL9TempClUpdDate(Date l9TempClUpdDate) {
		this.l9TempClUpdDate = l9TempClUpdDate;
	}

	public BigDecimal getL9TempCreditLimit() {
		return this.l9TempCreditLimit;
	}

	public void setL9TempCreditLimit(BigDecimal l9TempCreditLimit) {
		this.l9TempCreditLimit = l9TempCreditLimit;
	}

	public String getL9WhtCertiNo() {
		return this.l9WhtCertiNo;
	}

	public void setL9WhtCertiNo(String l9WhtCertiNo) {
		this.l9WhtCertiNo = l9WhtCertiNo;
	}

	public String getL9WhtInd() {
		return this.l9WhtInd;
	}

	public void setL9WhtInd(String l9WhtInd) {
		this.l9WhtInd = l9WhtInd;
	}

	public Date getL9WhtTaxUpDate() {
		return this.l9WhtTaxUpDate;
	}

	public void setL9WhtTaxUpDate(Date l9WhtTaxUpDate) {
		this.l9WhtTaxUpDate = l9WhtTaxUpDate;
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

	public String getSuspentionType() {
		return this.suspentionType;
	}

	public void setSuspentionType(String suspentionType) {
		this.suspentionType = suspentionType;
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

	public CsmPayChannel getCsmPayChannel() {
		return this.csmPayChannel;
	}

	public void setCsmPayChannel(CsmPayChannel csmPayChannel) {
		this.csmPayChannel = csmPayChannel;
	}

}
