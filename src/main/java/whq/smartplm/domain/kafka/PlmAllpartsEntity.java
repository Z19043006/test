package whq.smartplm.domain.kafka;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "plm_allparts", schema = "kafka", catalog = "smartplm")
public class PlmAllpartsEntity {
    private int syncId;
    private String partNumber;
    private String nomenClature;
    private String blocked;
    private String bomusage;
    private String brandname;
    private String className;
    private String zpartIdentity;
    private Timestamp creationDate;
    private String creator;
    private String envStandardString;
    private String gendesc;
    private String lastModifier;
    private Timestamp lastUpdate;
    private String lifecycleState;
    private String makeBuyIndicator;
    private String materialYype;
    private String middleClass;
    private String materialCategoryDesc;
    private String partSiteCode;
    private String productStatus;
    private String profitCenter;
    private String profitCenterdisp;
    private String projectName;
    private String sapdiVision;
    private String modelName;
    private String uccsiteCode;
    private Timestamp releaseDate;
    private String unitofmeasure;

    @Basic
    @Column(name = "sync_id")
    public int getSyncId() {
        return syncId;
    }

    public void setSyncId(int syncId) {
        this.syncId = syncId;
    }

    @Id
    @Column(name = "partnumber")
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    @Basic
    @Column(name = "nomenclature")
    public String getNomenClature() {
        return nomenClature;
    }

    public void setNomenClature(String nomenClature) {
        this.nomenClature = nomenClature;
    }

    @Basic
    @Column(name = "blocked")
    public String getBlocked() {
        return blocked;
    }

    public void setBlocked(String blocked) {
        this.blocked = blocked;
    }

    @Basic
    @Column(name = "bomusage")
    public String getBomusage() {
        return bomusage;
    }

    public void setBomusage(String bomusage) {
        this.bomusage = bomusage;
    }

    @Basic
    @Column(name = "brandname")
    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    @Basic
    @Column(name = "class")
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Basic
    @Column(name = "zpartidentity")
    public String getZpartIdentity() {
        return zpartIdentity;
    }

    public void setZpartIdentity(String zpartIdentity) {
        this.zpartIdentity = zpartIdentity;
    }

    @Basic
    @Column(name = "creationdate")
    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
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
    @Column(name = "envstandardstring")
    public String getEnvStandardString() {
        return envStandardString;
    }

    public void setEnvStandardString(String envStandardString) {
        this.envStandardString = envStandardString;
    }

    @Basic
    @Column(name = "gendesc")
    public String getGendesc() {
        return gendesc;
    }

    public void setGendesc(String gendesc) {
        this.gendesc = gendesc;
    }

    @Basic
    @Column(name = "lastmodifier")
    public String getLastModifier() {
        return lastModifier;
    }

    public void setLastModifier(String lastModifier) {
        this.lastModifier = lastModifier;
    }

    @Basic
    @Column(name = "lastupdate")
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Basic
    @Column(name = "lifecyclestate")
    public String getLifecycleState() {
        return lifecycleState;
    }

    public void setLifecycleState(String lifecycleState) {
        this.lifecycleState = lifecycleState;
    }

    @Basic
    @Column(name = "makebuyindicator")
    public String getMakeBuyIndicator() {
        return makeBuyIndicator;
    }

    public void setMakeBuyIndicator(String makeBuyIndicator) {
        this.makeBuyIndicator = makeBuyIndicator;
    }

    @Basic
    @Column(name = "materialtype")
    public String getMaterialYype() {
        return materialYype;
    }

    public void setMaterialYype(String materialYype) {
        this.materialYype = materialYype;
    }

    @Basic
    @Column(name = "middleclass")
    public String getMiddleClass() {
        return middleClass;
    }

    public void setMiddleClass(String middleClass) {
        this.middleClass = middleClass;
    }

    @Basic
    @Column(name = "materialcategorydesc")
    public String getMaterialCategoryDesc() {
        return materialCategoryDesc;
    }

    public void setMaterialCategoryDesc(String materialCategoryDesc) {
        this.materialCategoryDesc = materialCategoryDesc;
    }

    @Basic
    @Column(name = "partsitecode")
    public String getPartSiteCode() {
        return partSiteCode;
    }

    public void setPartSiteCode(String partSiteCode) {
        this.partSiteCode = partSiteCode;
    }

    @Basic
    @Column(name = "productstatus")
    public String getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(String productStatus) {
        this.productStatus = productStatus;
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
    @Column(name = "profitcenterdisp")
    public String getProfitCenterdisp() {
        return profitCenterdisp;
    }

    public void setProfitCenterdisp(String profitCenterdisp) {
        this.profitCenterdisp = profitCenterdisp;
    }

    @Basic
    @Column(name = "projectname")
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Basic
    @Column(name = "sapdivision")
    public String getSapdiVision() {
        return sapdiVision;
    }

    public void setSapdiVision(String sapdiVision) {
        this.sapdiVision = sapdiVision;
    }

    @Basic
    @Column(name = "modelname")
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Basic
    @Column(name = "uccsitecode")
    public String getUccsiteCode() {
        return uccsiteCode;
    }

    public void setUccsiteCode(String uccsiteCode) {
        this.uccsiteCode = uccsiteCode;
    }

    @Basic
    @Column(name = "releasedate")
    public Timestamp getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Timestamp releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Basic
    @Column(name = "unitofmeasure")
    public String getUnitofmeasure() {
        return unitofmeasure;
    }

    public void setUnitofmeasure(String unitofmeasure) {
        this.unitofmeasure = unitofmeasure;
    }


}
