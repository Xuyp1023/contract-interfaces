package com.betterjr.modules.contract.data;

/**
 * 用户电子合同签署信息
 * 
 * @author zhoucy
 *
 */
public class ContractStubData implements java.io.Serializable {

    private static final long serialVersionUID = -2708424027683831562L;

    /**
     * 编号
     */
    private Long id;

    /**
     * 电子合同编号
     */
    private Long contractId;

    /**
     * 签署方
     */
    private String signatory;

    /**
     * 签署顺序
     */
    private Long sequence;

    /**
     * 操作员编号
     */
    private Long operId;

    /**
     * 操作员名称
     */
    private String operName;

    /**
     * 企业帐号
     */
    private Long corpAccountId;

    /**
     * 签署人帐号
     */
    private Long signerAccountId;

    /**
     * 公司签署人编号
     */
    private Long corpSignerId;

    /**
     * 位置类型
     */
    private String positionType;

    /**
     * 签署页码，若为多页签章，支持页码格式；类似打印指定打印页
     */
    private String pagination;

    /**
     * X轴
     */
    private Long axisX;

    /**
     * Y轴
     */
    private Long axisY;

    /**
     * 印章定位关键字
     */

    private String keyWord;

    /**
     * 签署日期
     */
    private String signDate;

    /**
     * 签署时间
     */
    private String signTime;

    /**
     * 签署后pdf
     */
    private Long signPdf;

    /**
     * 业务状态
     */
    private String businStatus;

    /**
     * 文档状态
     */
    private String docStatus;

    /**
     * 公司
     */
    private Long custNo;

    /**
     * 公司名称
     */
    private String custName;

    /**
     * 在电子合同服务商那边的签署记录id
     */
    private String signServiceId;

    /**
     * 机构
     */
    private String operOrg;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Long getContractId() {
        return contractId;
    }

    public void setContractId(final Long contractId) {
        this.contractId = contractId;
    }

    public String getSignatory() {
        return signatory;
    }

    public void setSignatory(final String signatory) {
        this.signatory = signatory;
    }

    public Long getSequence() {
        return sequence;
    }

    public void setSequence(final Long sequence) {
        this.sequence = sequence;
    }

    public Long getOperId() {
        return operId;
    }

    public void setOperId(final Long operId) {
        this.operId = operId;
    }

    public String getOperName() {
        return this.operName;
    }

    public void setOperName(final String anOperName) {
        this.operName = anOperName;
    }

    public Long getCorpAccountId() {
        return corpAccountId;
    }

    public void setCorpAccountId(final Long corpAccountId) {
        this.corpAccountId = corpAccountId;
    }

    public Long getSignerAccountId() {
        return signerAccountId;
    }

    public void setSignerAccountId(final Long signerAccountId) {
        this.signerAccountId = signerAccountId;
    }

    public Long getCorpSignerId() {
        return corpSignerId;
    }

    public void setCorpSignerId(final Long corpSignerId) {
        this.corpSignerId = corpSignerId;
    }

    public String getPositionType() {
        return positionType;
    }

    public void setPositionType(final String positionType) {
        this.positionType = positionType;
    }

    public String getPagination() {
        return this.pagination;
    }

    public void setPagination(final String anPagination) {
        this.pagination = anPagination;
    }

    public Long getAxisX() {
        return axisX;
    }

    public void setAxisX(final Long axisX) {
        this.axisX = axisX;
    }

    public Long getAxisY() {
        return axisY;
    }

    public void setAxisY(final Long axisY) {
        this.axisY = axisY;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(final String keyWord) {
        this.keyWord = keyWord;
    }

    public String getSignDate() {
        return signDate;
    }

    public void setSignDate(final String signDate) {
        this.signDate = signDate == null ? null : signDate.trim();
    }

    public String getSignTime() {
        return signTime;
    }

    public void setSignTime(final String signTime) {
        this.signTime = signTime == null ? null : signTime.trim();
    }

    public Long getSignPdf() {
        return signPdf;
    }

    public void setSignPdf(final Long signPdf) {
        this.signPdf = signPdf;
    }

    public String getBusinStatus() {
        return businStatus;
    }

    public void setBusinStatus(final String businStatus) {
        this.businStatus = businStatus;
    }

    public String getDocStatus() {
        return docStatus;
    }

    public void setDocStatus(final String docStatus) {
        this.docStatus = docStatus;
    }

    public Long getCustNo() {
        return custNo;
    }

    public void setCustNo(final Long custNo) {
        this.custNo = custNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(final String custName) {
        this.custName = custName;
    }

    public String getOperOrg() {
        return operOrg;
    }

    public void setOperOrg(final String operOrg) {
        this.operOrg = operOrg;
    }

    public String getSignServiceId() {
        return this.signServiceId;
    }

    public void setSignServiceId(final String anSignServiceId) {
        this.signServiceId = anSignServiceId;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", contractId=").append(contractId);
        sb.append(", signatory=").append(signatory);
        sb.append(", sequence=").append(sequence);
        sb.append(", operId=").append(operId);
        sb.append(", operName=").append(operName);
        sb.append(", corpAccountId=").append(corpAccountId);
        sb.append(", signerAccountId=").append(signerAccountId);
        sb.append(", corpSignerId=").append(corpSignerId);
        sb.append(", positionType=").append(positionType);
        sb.append(", pagination=").append(pagination);
        sb.append(", axisX=").append(axisX);
        sb.append(", axisY=").append(axisY);
        sb.append(", keyWord=").append(keyWord);
        sb.append(", signDate=").append(signDate);
        sb.append(", signTime=").append(signTime);
        sb.append(", signPdf=").append(signPdf);
        sb.append(", businStatus=").append(businStatus);
        sb.append(", docStatus=").append(docStatus);
        sb.append(", custNo=").append(custNo);
        sb.append(", custName=").append(custName);
        sb.append(", operOrg=").append(operOrg);
        sb.append(", signServiceId=").append(signServiceId);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(final Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        final ContractStubData other = (ContractStubData) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getContractId() == null ? other.getContractId() == null : this.getContractId().equals(other.getContractId()))
                && (this.getSignatory() == null ? other.getSignatory() == null : this.getSignatory().equals(other.getSignatory()))
                && (this.getSequence() == null ? other.getSequence() == null : this.getSequence().equals(other.getSequence()))
                && (this.getOperId() == null ? other.getOperId() == null : this.getOperId().equals(other.getOperId()))
                && (this.getOperName() == null ? other.getOperName() == null : this.getOperName().equals(other.getOperName()))
                && (this.getCorpAccountId() == null ? other.getCorpAccountId() == null : this.getCorpAccountId().equals(other.getCorpAccountId()))
                && (this.getSignerAccountId() == null ? other.getSignerAccountId() == null
                        : this.getSignerAccountId().equals(other.getSignerAccountId()))
                && (this.getCorpSignerId() == null ? other.getCorpSignerId() == null : this.getCorpSignerId().equals(other.getCorpSignerId()))
                && (this.getPositionType() == null ? other.getPositionType() == null : this.getPositionType().equals(other.getPositionType()))
                && (this.getPagination() == null ? other.getPagination() == null : this.getPagination().equals(other.getPagination()))
                && (this.getAxisX() == null ? other.getAxisX() == null : this.getAxisX().equals(other.getAxisX()))
                && (this.getAxisY() == null ? other.getAxisY() == null : this.getAxisY().equals(other.getAxisY()))
                && (this.getKeyWord() == null ? other.getKeyWord() == null : this.getKeyWord().equals(other.getKeyWord()))
                && (this.getSignDate() == null ? other.getSignDate() == null : this.getSignDate().equals(other.getSignDate()))
                && (this.getSignTime() == null ? other.getSignTime() == null : this.getSignTime().equals(other.getSignTime()))
                && (this.getSignPdf() == null ? other.getSignPdf() == null : this.getSignPdf().equals(other.getSignPdf()))
                && (this.getBusinStatus() == null ? other.getBusinStatus() == null : this.getBusinStatus().equals(other.getBusinStatus()))
                && (this.getDocStatus() == null ? other.getDocStatus() == null : this.getDocStatus().equals(other.getDocStatus()))
                && (this.getCustNo() == null ? other.getCustNo() == null : this.getCustNo().equals(other.getCustNo()))
                && (this.getCustName() == null ? other.getCustName() == null : this.getCustName().equals(other.getCustName()))
                && (this.getOperOrg() == null ? other.getOperOrg() == null : this.getOperOrg().equals(other.getOperOrg()))
                && (this.getSignServiceId() == null ? other.getSignServiceId() == null : this.getSignServiceId().equals(other.getSignServiceId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getContractId() == null) ? 0 : getContractId().hashCode());
        result = prime * result + ((getSignatory() == null) ? 0 : getSignatory().hashCode());
        result = prime * result + ((getSequence() == null) ? 0 : getSequence().hashCode());
        result = prime * result + ((getOperId() == null) ? 0 : getOperId().hashCode());
        result = prime * result + ((getOperName() == null) ? 0 : getOperName().hashCode());
        result = prime * result + ((getCorpAccountId() == null) ? 0 : getCorpAccountId().hashCode());
        result = prime * result + ((getSignerAccountId() == null) ? 0 : getSignerAccountId().hashCode());
        result = prime * result + ((getCorpSignerId() == null) ? 0 : getCorpSignerId().hashCode());
        result = prime * result + ((getPositionType() == null) ? 0 : getPositionType().hashCode());
        result = prime * result + ((getPagination() == null) ? 0 : getPagination().hashCode());
        result = prime * result + ((getAxisX() == null) ? 0 : getAxisX().hashCode());
        result = prime * result + ((getAxisY() == null) ? 0 : getAxisY().hashCode());
        result = prime * result + ((getKeyWord() == null) ? 0 : getKeyWord().hashCode());
        result = prime * result + ((getSignDate() == null) ? 0 : getSignDate().hashCode());
        result = prime * result + ((getSignTime() == null) ? 0 : getSignTime().hashCode());
        result = prime * result + ((getSignPdf() == null) ? 0 : getSignPdf().hashCode());
        result = prime * result + ((getBusinStatus() == null) ? 0 : getBusinStatus().hashCode());
        result = prime * result + ((getDocStatus() == null) ? 0 : getDocStatus().hashCode());
        result = prime * result + ((getCustNo() == null) ? 0 : getCustNo().hashCode());
        result = prime * result + ((getCustName() == null) ? 0 : getCustName().hashCode());
        result = prime * result + ((getOperOrg() == null) ? 0 : getOperOrg().hashCode());
        result = prime * result + ((getSignServiceId() == null) ? 0 : getSignServiceId().hashCode());
        return result;
    }
}