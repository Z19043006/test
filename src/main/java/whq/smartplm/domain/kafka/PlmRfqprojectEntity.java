package whq.smartplm.domain.kafka;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;


/**
 * The persistent class for the plm_rfqproject database table.
 * 
 */
@Entity

@Table(name="plm_rfqproject",schema = "kafka" ,catalog = "smartplm")
public class PlmRfqprojectEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="project_code")
	private String projectCode;

	@Column(name="acrproject_name")
	private String acrprojectName;

	private String budgetpm;

	private String cusnickname;

	private String plantcode;

	@Column(name="profit_center")
	private String profitCenter;

	@Column(name="profit_center_disp")
	private String profitCenterDisp;

	@Column(name="project_creation_date")
	private Timestamp projectCreationDate;

	@Column(name="project_creator")
	private String projectCreator;

	@Column(name="project_last_update")
	private Timestamp projectLastUpdate;

	@Column(name="project_leader")
	private String projectLeader;

	@Column(name="project_modifier")
	private String projectModifier;

	@Column(name="project_plan_creation_date")
	private Timestamp projectPlanCreationDate;

	@Column(name="project_plan_creator")
	private String projectPlanCreator;

	@Column(name="project_plan_last_update")
	private Timestamp projectPlanLastUpdate;

	@Column(name="project_plan_modifier")
	private String projectPlanModifier;

	@Column(name="project_status")
	private String projectStatus;

	private String revision;

	private String superseded;

	@Column(name="sync_id")
	private Long syncId;

	private String zcustomertype;

	private Timestamp zrfqduedate;

	private Timestamp zrfqreceivedate;

	private String zrfqtype;

	public PlmRfqprojectEntity() {
	}

	public String getProjectCode() {
		return this.projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getAcrprojectName() {
		return this.acrprojectName;
	}

	public void setAcrprojectName(String acrprojectName) {
		this.acrprojectName = acrprojectName;
	}

	public String getBudgetpm() {
		return this.budgetpm;
	}

	public void setBudgetpm(String budgetpm) {
		this.budgetpm = budgetpm;
	}

	public String getCusnickname() {
		return this.cusnickname;
	}

	public void setCusnickname(String cusnickname) {
		this.cusnickname = cusnickname;
	}

	public String getPlantcode() {
		return this.plantcode;
	}

	public void setPlantcode(String plantcode) {
		this.plantcode = plantcode;
	}

	public String getProfitCenter() {
		return this.profitCenter;
	}

	public void setProfitCenter(String profitCenter) {
		this.profitCenter = profitCenter;
	}

	public String getProfitCenterDisp() {
		return this.profitCenterDisp;
	}

	public void setProfitCenterDisp(String profitCenterDisp) {
		this.profitCenterDisp = profitCenterDisp;
	}

	public Timestamp getProjectCreationDate() {
		return this.projectCreationDate;
	}

	public void setProjectCreationDate(Timestamp projectCreationDate) {
		this.projectCreationDate = projectCreationDate;
	}

	public String getProjectCreator() {
		return this.projectCreator;
	}

	public void setProjectCreator(String projectCreator) {
		this.projectCreator = projectCreator;
	}

	public Timestamp getProjectLastUpdate() {
		return this.projectLastUpdate;
	}

	public void setProjectLastUpdate(Timestamp projectLastUpdate) {
		this.projectLastUpdate = projectLastUpdate;
	}

	public String getProjectLeader() {
		return this.projectLeader;
	}

	public void setProjectLeader(String projectLeader) {
		this.projectLeader = projectLeader;
	}

	public String getProjectModifier() {
		return this.projectModifier;
	}

	public void setProjectModifier(String projectModifier) {
		this.projectModifier = projectModifier;
	}

	public Timestamp getProjectPlanCreationDate() {
		return this.projectPlanCreationDate;
	}

	public void setProjectPlanCreationDate(Timestamp projectPlanCreationDate) {
		this.projectPlanCreationDate = projectPlanCreationDate;
	}

	public String getProjectPlanCreator() {
		return this.projectPlanCreator;
	}

	public void setProjectPlanCreator(String projectPlanCreator) {
		this.projectPlanCreator = projectPlanCreator;
	}

	public Timestamp getProjectPlanLastUpdate() {
		return this.projectPlanLastUpdate;
	}

	public void setProjectPlanLastUpdate(Timestamp projectPlanLastUpdate) {
		this.projectPlanLastUpdate = projectPlanLastUpdate;
	}

	public String getProjectPlanModifier() {
		return this.projectPlanModifier;
	}

	public void setProjectPlanModifier(String projectPlanModifier) {
		this.projectPlanModifier = projectPlanModifier;
	}

	public String getProjectStatus() {
		return this.projectStatus;
	}

	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}

	public String getRevision() {
		return this.revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}

	public String getSuperseded() {
		return this.superseded;
	}

	public void setSuperseded(String superseded) {
		this.superseded = superseded;
	}

	public Long getSyncId() {
		return this.syncId;
	}

	public void setSyncId(Long syncId) {
		this.syncId = syncId;
	}

	public String getZcustomertype() {
		return this.zcustomertype;
	}

	public void setZcustomertype(String zcustomertype) {
		this.zcustomertype = zcustomertype;
	}

	public Timestamp getZrfqduedate() {
		return this.zrfqduedate;
	}

	public void setZrfqduedate(Timestamp zrfqduedate) {
		this.zrfqduedate = zrfqduedate;
	}

	public Timestamp getZrfqreceivedate() {
		return this.zrfqreceivedate;
	}

	public void setZrfqreceivedate(Timestamp zrfqreceivedate) {
		this.zrfqreceivedate = zrfqreceivedate;
	}

	public String getZrfqtype() {
		return this.zrfqtype;
	}

	public void setZrfqtype(String zrfqtype) {
		this.zrfqtype = zrfqtype;
	}


	@Override
	public String toString() {
		return "PlmRfqproject{" +
				"projectCode='" + projectCode + '\'' +
				", acrprojectName='" + acrprojectName + '\'' +
				", budgetpm='" + budgetpm + '\'' +
				", cusnickname='" + cusnickname + '\'' +
				", plantcode='" + plantcode + '\'' +
				", profitCenter='" + profitCenter + '\'' +
				", profitCenterDisp='" + profitCenterDisp + '\'' +
				", projectCreationDate=" + projectCreationDate +
				", projectCreator='" + projectCreator + '\'' +
				", projectLastUpdate=" + projectLastUpdate +
				", projectLeader='" + projectLeader + '\'' +
				", projectModifier='" + projectModifier + '\'' +
				", projectPlanCreationDate=" + projectPlanCreationDate +
				", projectPlanCreator='" + projectPlanCreator + '\'' +
				", projectPlanLastUpdate=" + projectPlanLastUpdate +
				", projectPlanModifier='" + projectPlanModifier + '\'' +
				", projectStatus='" + projectStatus + '\'' +
				", revision='" + revision + '\'' +
				", superseded='" + superseded + '\'' +
				", syncId=" + syncId +
				", zcustomertype='" + zcustomertype + '\'' +
				", zrfqduedate=" + zrfqduedate +
				", zrfqreceivedate=" + zrfqreceivedate +
				", zrfqtype='" + zrfqtype + '\'' +
				'}';
	}
}