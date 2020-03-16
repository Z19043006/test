package whq.smartplm.domain.kafka;


import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "plm_ecr_coverpage", schema = "kafka", catalog = "smartplm")
public class PlmEcrCoverPageEntity {
    @Id
    @Column(name = "sync_id")
    long syncId;
    @Column(name = "ecr_no")
    String ecrNo;
    @Column(name = "ecn_no")
    String ecnNo;
    @Column(name = "creator")
    String creator;
    @Column(name = "ecn_subject")
    String ecnSubject;
    @Column(name = "process_flow_flag")
    String processFlowFlag;
    @Column(name = "issue_date")
    String issueDate;
    @Column(name = "modelno1")
    String modelno1;
    @Column(name = "acrprjname")
    String acrprjname;
    @Column(name = "role_setting_name")
    String roleSettingName;
    @Column(name = "reason_for_change")
    String reasonForChange;
    @Column(name = "description")
    String description;
    @Column(name = "apply_brand")
    String applyBrand;
    @Column(name = "qmtype")
    String qmtype;
    @Column(name = "emc_safety")
    String emcSafety;
    @Column(name = "change_from_shipment_of")
    String changeFromAhipmentOf;
    @Column(name = "batchtest")
    String batchtest;
    @Column(name = "batch_plant")
    String batchPlant;
    @Column(name = "affecteditem_bom_plant")
    String affecteditemBomPlant;
    @Column(name = "cost_down")
    String costDown;
    @Column(name = "rework")
    String rework;
    @Column(name = "scrap")
    String scrap;
    @Column(name = "ecrurl")
    String ecrurl;
    @Column(name = "profitcenterdisp")
    String profitcenterdisp;
    @Column(name = "bg_name")
    String bgName;
    @Column(name = "bu_name")
    String buName;
    @Column(name = "product_type")
    String productType;
    @Column(name = "last_updated")
    String lastUpdated;
    @Column(name = "finished_date")
    String finishedDate;

    //String ecoPlant;//kafka column not ready，stand-by

    public long getSyncId() {
        return syncId;
    }

    public void setSyncId(long syncId) {
        this.syncId = syncId;
    }

    public String getEcrNo() {
        return ecrNo;
    }

    public void setEcrNo(String ecrNo) {
        this.ecrNo = ecrNo;
    }

    public String getEcnNo() {
        return ecnNo;
    }

    public void setEcnNo(String ecnNo) {
        this.ecnNo = ecnNo;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getEcnSubject() {
        return ecnSubject;
    }

    public void setEcnSubject(String ecnSubject) {
        this.ecnSubject = ecnSubject;
    }

    public String getProcessFlowFlag() {
        return processFlowFlag;
    }

    public void setProcessFlowFlag(String processFlowFlag) {
        this.processFlowFlag = processFlowFlag;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getModelno1() {
        return modelno1;
    }

    public void setModelno1(String modelno1) {
        this.modelno1 = modelno1;
    }

    public String getAcrprjname() {
        return acrprjname;
    }

    public void setAcrprjname(String acrprjname) {
        this.acrprjname = acrprjname;
    }

    public String getRoleSettingName() {
        return roleSettingName;
    }

    public void setRoleSettingName(String roleSettingName) {
        this.roleSettingName = roleSettingName;
    }

    public String getReasonForChange() {
        return reasonForChange;
    }

    public void setReasonForChange(String reasonForChange) {
        this.reasonForChange = reasonForChange;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getApplyBrand() {
        return applyBrand;
    }

    public void setApplyBrand(String applyBrand) {
        this.applyBrand = applyBrand;
    }

    public String getQmtype() {
        return qmtype;
    }

    public void setQmtype(String qmtype) {
        this.qmtype = qmtype;
    }

    public String getEmcSafety() {
        return emcSafety;
    }

    public void setEmcSafety(String emcSafety) {
        this.emcSafety = emcSafety;
    }

    public String getChangeFromAhipmentOf() {
        return changeFromAhipmentOf;
    }

    public void setChangeFromAhipmentOf(String changeFromAhipmentOf) {
        this.changeFromAhipmentOf = changeFromAhipmentOf;
    }

    public String getBatchtest() {
        return batchtest;
    }

    public void setBatchtest(String batchtest) {
        this.batchtest = batchtest;
    }

    public String getBatchPlant() {
        return batchPlant;
    }

    public void setBatchPlant(String batchPlant) {
        this.batchPlant = batchPlant;
    }

    public String getAffecteditemBomPlant() {
        return affecteditemBomPlant;
    }

    public void setAffecteditemBomPlant(String affecteditemBomPlant) {
        this.affecteditemBomPlant = affecteditemBomPlant;
    }

    public String getCostDown() {
        return costDown;
    }

    public void setCostDown(String costDown) {
        this.costDown = costDown;
    }

    public String getRework() {
        return rework;
    }

    public void setRework(String rework) {
        this.rework = rework;
    }

    public String getScrap() {
        return scrap;
    }

    public void setScrap(String scrap) {
        this.scrap = scrap;
    }

    public String getEcrurl() {
        return ecrurl;
    }

    public void setEcrurl(String ecrurl) {
        this.ecrurl = ecrurl;
    }

    public String getProfitcenterdisp() {
        return profitcenterdisp;
    }

    public void setProfitcenterdisp(String profitcenterdisp) {
        this.profitcenterdisp = profitcenterdisp;
    }

    public String getBgName() {
        return bgName;
    }

    public void setBgName(String bgName) {
        this.bgName = bgName;
    }

    public String getBuName() {
        return buName;
    }

    public void setBuName(String buName) {
        this.buName = buName;
    }

    public String getProductNype() {
        return productType;
    }

    public void setProductNype(String productNype) {
        this.productType = productNype;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getFinishedDate() {
        return finishedDate;
    }

    public void setFinishedDate(String finishedDate) {
        this.finishedDate = finishedDate;
    }

    @Override
    public String toString() {
        return "PlmEcrCoverPageEntity{" +
                "syncId=" + syncId +
                ", ecrNo='" + ecrNo + '\'' +
                ", ecnNo='" + ecnNo + '\'' +
                ", creator='" + creator + '\'' +
                ", ecnSubject='" + ecnSubject + '\'' +
                ", processFlowFlag='" + processFlowFlag + '\'' +
                ", issueDate='" + issueDate + '\'' +
                ", modelno1='" + modelno1 + '\'' +
                ", acrprjname='" + acrprjname + '\'' +
                ", roleSettingName='" + roleSettingName + '\'' +
                ", reasonForChange='" + reasonForChange + '\'' +
                ", description='" + description + '\'' +
                ", applyBrand='" + applyBrand + '\'' +
                ", qmtype='" + qmtype + '\'' +
                ", emcSafety='" + emcSafety + '\'' +
                ", changeFromAhipmentOf='" + changeFromAhipmentOf + '\'' +
                ", batchtest='" + batchtest + '\'' +
                ", batchPlant='" + batchPlant + '\'' +
                ", affecteditemBomPlant='" + affecteditemBomPlant + '\'' +
                ", costDown='" + costDown + '\'' +
                ", rework='" + rework + '\'' +
                ", scrap='" + scrap + '\'' +
                ", ecrurl='" + ecrurl + '\'' +
                ", profitcenterdisp='" + profitcenterdisp + '\'' +
                ", bgName='" + bgName + '\'' +
                ", buName='" + buName + '\'' +
                ", productType='" + productType + '\'' +
                ", lastUpdated='" + lastUpdated + '\'' +
                ", finishedDate='" + finishedDate + '\'' +
                '}';
    }
}
