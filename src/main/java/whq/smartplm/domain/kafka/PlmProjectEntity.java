package whq.smartplm.domain.kafka;

import javax.persistence.*;


@Entity
@Table(name = "plm_project", schema = "kafka", catalog = "smartplm")
public class PlmProjectEntity {

    private int syncId;
    private String projectName;
    private String rfqCode;
    private String groupProjetCode;
    private String customerType;
    private String projectNameSimple;
    private String isrfq;
    private String productType;
    private String budgetPm;
    private String classification;
    private String acrprjname;
    private String superseded;
    private String cusnickName;
    private String profitCenter;
    private String projectLeader;
    private String prjCreationDate;
    private String prjLastUpdate;
    private String sequence;
    private String creator;
    private String prjSchCreationDate;
    private String businessType;
    private String projectStatus;
    private String warrantyYear;
    private String projectionc0DueDate;
    private String projectionc1DueDate;
    private String projectionc2DueDate;
    private String projectionc3DueDate;
    private String projectionc4DueDate;
    private String projectionc5DueDate;
    private String projectionc6DueDate;
    private String actualc0DueDate;
    private String actualc1DueDate;
    private String actualc2DueDate;
    private String actualc3DueDate;
    private String actualc4DueDate;
    private String actualc5DueDate;
    private String actualc6DueDate;
    private String c0duedate;
    private String c1duedate;
    private String c2duedate;
    private String c3duedate;
    private String c4duedate;
    private String c5duedate;
    private String c6duedate;
    private String plantcode;


    @Basic
    @Column(name = "sync_id")
    public int getSyncId() {
        return syncId;
    }

    public void setSyncId(int syncId) {
        this.syncId = syncId;
    }

    @Id
    @Column(name = "projectname")
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Basic
    @Column(name = "rfqcode")
    public String getRfqCode() {
        return rfqCode;
    }

    public void setRfqCode(String rfqCode) {
        this.rfqCode = rfqCode;
    }

    @Basic
    @Column(name = "groupprojectcode")
    public String getGroupProjetCode() {
        return groupProjetCode;
    }

    public void setGroupProjetCode(String groupProjetCode) {
        this.groupProjetCode = groupProjetCode;
    }

    @Basic
    @Column(name = "customertype")
    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Basic
    @Column(name = "projectnamesimple")
    public String getProjectNameSimple() {
        return projectNameSimple;
    }

    public void setProjectNameSimple(String projectNameSimple) {
        this.projectNameSimple = projectNameSimple;
    }

    @Basic
    @Column(name = "isrfq")
    public String getIsrfq() {
        return isrfq;
    }

    public void setIsrfq(String isrfq) {
        this.isrfq = isrfq;
    }

    @Basic
    @Column(name = "producttype")
    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Basic
    @Column(name = "budgetpm")
    public String getBudgetPm() {
        return budgetPm;
    }

    public void setBudgetPm(String budgetPm) {
        this.budgetPm = budgetPm;
    }

    @Basic
    @Column(name = "classification")
    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Basic
    @Column(name = "acrprjname")
    public String getAcrprjname() {
        return acrprjname;
    }

    public void setAcrprjname(String acrprjname) {
        this.acrprjname = acrprjname;
    }

    @Basic
    @Column(name = "superseded")
    public String getSuperseded() {
        return superseded;
    }

    public void setSuperseded(String superseded) {
        this.superseded = superseded;
    }

    @Basic
    @Column(name = "cusnickname")
    public String getCusnickName() {
        return cusnickName;
    }

    public void setCusnickName(String cusnickName) {
        this.cusnickName = cusnickName;
    }

    @Basic
    @Column(name = "profitcenter")
    public String getProfitCenter() {
        return profitCenter;
    }

    public void setProfitCenter(String profitCenter) {
        this.profitCenter = profitCenter;
    }

    @Basic
    @Column(name = "projectleader")
    public String getProjectLeader() {
        return projectLeader;
    }

    public void setProjectLeader(String projectLeader) {
        this.projectLeader = projectLeader;
    }

    @Basic
    @Column(name = "prjcreationdate")
    public String getPrjCreationDate() {
        return prjCreationDate;
    }

    public void setPrjCreationDate(String prjCreationDate) {
        this.prjCreationDate = prjCreationDate;
    }

    @Basic
    @Column(name = "prjlastupdate")
    public String getPrjLastUpdate() {
        return prjLastUpdate;
    }

    public void setPrjLastUpdate(String prjLastUpdate) {
        this.prjLastUpdate = prjLastUpdate;
    }

    @Basic
    @Column(name = "sequence")
    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    @Basic
    @Column(name = "creator")
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Basic
    @Column(name = "prjschcreationdate")
    public String getPrjSchCreationDate() {
        return prjSchCreationDate;
    }

    public void setPrjSchCreationDate(String prjSchCreationDate) {
        this.prjSchCreationDate = prjSchCreationDate;
    }

    @Basic
    @Column(name = "businesstype")
    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    @Basic
    @Column(name = "projectstatus")
    public String getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    @Basic
    @Column(name = "warrantyyear")
    public String getWarrantyYear() {
        return warrantyYear;
    }

    public void setWarrantyYear(String warrantyYear) {
        this.warrantyYear = warrantyYear;
    }

    @Basic
    @Column(name = "projectionc0duedate")
    public String getProjectionc0DueDate() {
        return projectionc0DueDate;
    }

    public void setProjectionc0DueDate(String projectionc0DueDate) {
        this.projectionc0DueDate = projectionc0DueDate;
    }

    @Basic
    @Column(name = "projectionc1duedate")
    public String getProjectionc1DueDate() {
        return projectionc1DueDate;
    }

    public void setProjectionc1DueDate(String projectionc1DueDate) {
        this.projectionc1DueDate = projectionc1DueDate;
    }

    @Basic
    @Column(name = "projectionc2duedate")
    public String getProjectionc2DueDate() {
        return projectionc2DueDate;
    }

    public void setProjectionc2DueDate(String projectionc2DueDate) {
        this.projectionc2DueDate = projectionc2DueDate;
    }

    @Basic
    @Column(name = "projectionc3duedate")
    public String getProjectionc3DueDate() {
        return projectionc3DueDate;
    }

    public void setProjectionc3DueDate(String projectionc3DueDate) {
        this.projectionc3DueDate = projectionc3DueDate;
    }

    @Basic
    @Column(name = "projectionc4duedate")
    public String getProjectionc4DueDate() {
        return projectionc4DueDate;
    }

    public void setProjectionc4DueDate(String projectionc4DueDate) {
        this.projectionc4DueDate = projectionc4DueDate;
    }

    @Basic
    @Column(name = "projectionc5duedate")
    public String getProjectionc5DueDate() {
        return projectionc5DueDate;
    }

    public void setProjectionc5DueDate(String projectionc5DueDate) {
        this.projectionc5DueDate = projectionc5DueDate;
    }

    @Basic
    @Column(name = "projectionc6duedate")
    public String getProjectionc6DueDate() {
        return projectionc6DueDate;
    }

    public void setProjectionc6DueDate(String projectionc6DueDate) {
        this.projectionc6DueDate = projectionc6DueDate;
    }

    @Basic
    @Column(name = "actualc0duedate")
    public String getActualc0DueDate() {
        return actualc0DueDate;
    }

    public void setActualc0DueDate(String actualc0DueDate) {
        this.actualc0DueDate = actualc0DueDate;
    }

//    @Basic
//    @Column(name = "actualc1duedate")
//    public String getActualc1DueDate() {
//        return actualc1DueDate;
//    }
//
//    public void setActualc1DueDate(String actualc1DueDate) {
//        this.actualc1DueDate = actualc1DueDate;
//    }

    @Basic
    @Column(name = "actualc2duedate")
    public String getActualc2DueDate() {
        return actualc2DueDate;
    }

    public void setActualc2DueDate(String actualc2DueDate) {
        this.actualc2DueDate = actualc2DueDate;
    }

    @Basic
    @Column(name = "actualc3duedate")
    public String getActualc3DueDate() {
        return actualc3DueDate;
    }

    public void setActualc3DueDate(String actualc3DueDate) {
        this.actualc3DueDate = actualc3DueDate;
    }

    @Basic
    @Column(name = "actualc4duedate")
    public String getActualc4DueDate() {
        return actualc4DueDate;
    }

    public void setActualc4DueDate(String actualc4DueDate) {
        this.actualc4DueDate = actualc4DueDate;
    }

    @Basic
    @Column(name = "actualc5duedate")
    public String getActualc5DueDate() {
        return actualc5DueDate;
    }

    public void setActualc5DueDate(String actualc5DueDate) {
        this.actualc5DueDate = actualc5DueDate;
    }

    @Basic
    @Column(name = "actualc1duedate")
    public String getActualc6DueDate() {
        return actualc6DueDate;
    }

    public void setActualc6DueDate(String actualc6DueDate) {
        this.actualc6DueDate = actualc6DueDate;
    }

    @Basic
    @Column(name = "c0duedate")
    public String getC0duedate() {
        return c0duedate;
    }

    public void setC0duedate(String c0duedate) {
        this.c0duedate = c0duedate;
    }

    @Basic
    @Column(name = "c1duedate")
    public String getC1duedate() {
        return c1duedate;
    }

    public void setC1duedate(String c1duedate) {
        this.c1duedate = c1duedate;
    }

    @Basic
    @Column(name = "c2duedate")
    public String getC2duedate() {
        return c2duedate;
    }

    public void setC2duedate(String c2duedate) {
        this.c2duedate = c2duedate;
    }

    @Basic
    @Column(name = "c3duedate")
    public String getC3duedate() {
        return c3duedate;
    }

    public void setC3duedate(String c3duedate) {
        this.c3duedate = c3duedate;
    }

    @Basic
    @Column(name = "c4duedate")
    public String getC4duedate() {
        return c4duedate;
    }

    public void setC4duedate(String c4duedate) {
        this.c4duedate = c4duedate;
    }

    @Basic
    @Column(name = "c5duedate")
    public String getC5duedate() {
        return c5duedate;
    }

    public void setC5duedate(String c5duedate) {
        this.c5duedate = c5duedate;
    }

    @Basic
    @Column(name = "c6duedate")
    public String getC6duedate() {
        return c6duedate;
    }

    public void setC6duedate(String c6duedate) {
        this.c6duedate = c6duedate;
    }

    @Basic
    @Column(name = "plantcode")
    public String getPlantcode() {
        return plantcode;
    }

    public void setPlantcode(String plantcode) {
        this.plantcode = plantcode;
    }
}
