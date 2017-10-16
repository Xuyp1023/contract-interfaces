package com.betterjr.modules.contract.data;

public class ContractTempStampPlaceData implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1496931604901767316L;

    /**
     * 编号
     */
    private Long id;

    /**
     * 合同模板编号
     */
    private Long templateId;

    /**
     * 合同模板名称
     */
    private String templateName;

    /**
     * 签约方
     */
    private String signatory;

    /**
     * 签约顺序
     */
    private Integer sequence;

    /**
     * 位置类型
     */
    private String type;

    /**
     * 页码
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
     * 关键字
     */
    private String keyWord;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(final Long templateId) {
        this.templateId = templateId;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(final String templateName) {
        this.templateName = templateName;
    }

    public String getSignatory() {
        return signatory;
    }

    public void setSignatory(final String signatory) {
        this.signatory = signatory;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(final Integer anSequence) {
        this.sequence = anSequence;
    }

    public String getType() {
        return type;
    }

    public void setType(final String type) {
        this.type = type;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", templateId=").append(templateId);
        sb.append(", templateName=").append(templateName);
        sb.append(", signatory=").append(signatory);
        sb.append(", sequence=").append(sequence);
        sb.append(", type=").append(type);
        sb.append(", pagination=").append(pagination);
        sb.append(", axisX=").append(axisX);
        sb.append(", axisY=").append(axisY);
        sb.append(", keyWord=").append(keyWord);
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
        final ContractTempStampPlaceData other = (ContractTempStampPlaceData) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getTemplateId() == null ? other.getTemplateId() == null
                        : this.getTemplateId().equals(other.getTemplateId()))
                && (this.getTemplateName() == null ? other.getTemplateName() == null
                        : this.getTemplateName().equals(other.getTemplateName()))
                && (this.getSignatory() == null ? other.getSignatory() == null
                        : this.getSignatory().equals(other.getSignatory()))
                && (this.getSequence() == null ? other.getSequence() == null
                        : this.getSequence().equals(other.getSequence()))
                && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
                && (this.getPagination() == null ? other.getPagination() == null
                        : this.getPagination().equals(other.getPagination()))
                && (this.getAxisX() == null ? other.getAxisX() == null : this.getAxisX().equals(other.getAxisX()))
                && (this.getAxisY() == null ? other.getAxisY() == null : this.getAxisY().equals(other.getAxisY()))
                && (this.getKeyWord() == null ? other.getKeyWord() == null
                        : this.getKeyWord().equals(other.getKeyWord()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTemplateId() == null) ? 0 : getTemplateId().hashCode());
        result = prime * result + ((getTemplateName() == null) ? 0 : getTemplateName().hashCode());
        result = prime * result + ((getSignatory() == null) ? 0 : getSignatory().hashCode());
        result = prime * result + ((getSequence() == null) ? 0 : getSequence().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getPagination() == null) ? 0 : getPagination().hashCode());
        result = prime * result + ((getAxisX() == null) ? 0 : getAxisX().hashCode());
        result = prime * result + ((getAxisY() == null) ? 0 : getAxisY().hashCode());
        result = prime * result + ((getKeyWord() == null) ? 0 : getKeyWord().hashCode());
        return result;
    }
}