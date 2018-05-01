package th.co.truecorp.esd.grapghql.models;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="CHARGE_DISTRIBUTE")
public class ChargeDistribute {

	@Column(name="AGR_LEVEL")
	private String agrLevel;

	@Column(name="AGREEMENT_NO")
	private BigDecimal agreementNo;

	@Column(name="APPLICATION_ID")
	private String applicationId;

	@Column(name="CHG_SPLIT_TYPE")
	private String chgSplitType;

	@Column(name="CONV_RUN_NO")
	private BigDecimal convRunNo;

	@Column(name="DISTRIBUTION_NO")
	private BigDecimal distributionNo;

	@Column(name="DL_SERVICE_CODE")
	private String dlServiceCode;

	@Column(name="DL_UPDATE_STAMP")
	private BigDecimal dlUpdateStamp;

	//@Temporal(TemporalType.DATE)
	@Column(name="EFF_ISSUE_DATE")
	private Date effIssueDate;

	//@Temporal(TemporalType.DATE)
	@Column(name="EFFECTIVE_DATE")
	private Date effectiveDate;

	//@Temporal(TemporalType.DATE)
	@Column(name="EXP_ISSUE_DATE")
	private Date expIssueDate;

	//@Temporal(TemporalType.DATE)
	@Column(name="EXPIRATION_DATE")
	private Date expirationDate;

	@Column(name="INS_TRX_ID")
	private BigDecimal insTrxId;

	@Column(name="OPERATOR_ID")
	private BigDecimal operatorId;

	private String soc;

	@Column(name="SOC_SEQ_NO")
	private BigDecimal socSeqNo;

	@Column(name="SOURCE_AGR_NO")
	private BigDecimal sourceAgrNo;

	//@Temporal(TemporalType.DATE)
	@Column(name="SYS_CREATION_DATE")
	private Date sysCreationDate;

	//@Temporal(TemporalType.DATE)
	@Column(name="SYS_UPDATE_DATE")
	private Date sysUpdateDate;

	@Column(name="TARGET_PCN")
	private BigDecimal targetPcn;

	@Id
	@Column(name="TRX_ID")
	private String trxId;

	public ChargeDistribute() {
	}

	public String getAgrLevel() {
		return this.agrLevel;
	}

	public void setAgrLevel(String agrLevel) {
		this.agrLevel = agrLevel;
	}

	public BigDecimal getAgreementNo() {
		return this.agreementNo;
	}

	public void setAgreementNo(BigDecimal agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getChgSplitType() {
		return this.chgSplitType;
	}

	public void setChgSplitType(String chgSplitType) {
		this.chgSplitType = chgSplitType;
	}

	public BigDecimal getConvRunNo() {
		return this.convRunNo;
	}

	public void setConvRunNo(BigDecimal convRunNo) {
		this.convRunNo = convRunNo;
	}

	public BigDecimal getDistributionNo() {
		return this.distributionNo;
	}

	public void setDistributionNo(BigDecimal distributionNo) {
		this.distributionNo = distributionNo;
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

	public Date getEffIssueDate() {
		return this.effIssueDate;
	}

	public void setEffIssueDate(Date effIssueDate) {
		this.effIssueDate = effIssueDate;
	}

	public Date getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Date getExpIssueDate() {
		return this.expIssueDate;
	}

	public void setExpIssueDate(Date expIssueDate) {
		this.expIssueDate = expIssueDate;
	}

	public Date getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public BigDecimal getInsTrxId() {
		return this.insTrxId;
	}

	public void setInsTrxId(BigDecimal insTrxId) {
		this.insTrxId = insTrxId;
	}

	public BigDecimal getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(BigDecimal operatorId) {
		this.operatorId = operatorId;
	}

	public String getSoc() {
		return this.soc;
	}

	public void setSoc(String soc) {
		this.soc = soc;
	}

	public BigDecimal getSocSeqNo() {
		return this.socSeqNo;
	}

	public void setSocSeqNo(BigDecimal socSeqNo) {
		this.socSeqNo = socSeqNo;
	}

	public BigDecimal getSourceAgrNo() {
		return this.sourceAgrNo;
	}

	public void setSourceAgrNo(BigDecimal sourceAgrNo) {
		this.sourceAgrNo = sourceAgrNo;
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

	public BigDecimal getTargetPcn() {
		return this.targetPcn;
	}

	public void setTargetPcn(BigDecimal targetPcn) {
		this.targetPcn = targetPcn;
	}

	public String getTrxId() {
		return this.trxId;
	}

	public void setTrxId(String trxId) {
		this.trxId = trxId;
	}
}
