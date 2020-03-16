package whq.smartplm.domain.eco;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;


/**
 * The persistent class for the eco_coverpage database table.
 * 
 */
@Entity
@Table(name="eco_coverpage",schema = "ccm", catalog = "smartplm")
public class EcoCoverpageEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="eco_coverpage_generator",sequenceName="ccm.eco_coverpage_seq",allocationSize = 1)
	@GeneratedValue(strategy= GenerationType.SEQUENCE,generator = "eco_coverpage_generator")
	@Column(name="seq_no")
	private Long seqNo;

	private String attachments;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_on")
	private Timestamp createdOn;

	private String customer;

	@Column(name="customer_ec_initial_date")
	private Timestamp customerEcInitialDate;

	@Column(name="customer_ec_no")
	private String customerEcNo;

	private String description;

	@Column(name="description_of_change")
	private String descriptionOfChange;

	@Column(name="ecn_no")
	private String ecnNo;

	@Column(name="eco_cosigner")
	private String ecoCosigner;

	@NotBlank
	@Column(name="eco_no")
	private String ecoNo;

	@NotBlank
	@Column(name="ecr_no")
	private String ecrNo;

	@Column(name="flow_role")
	private String flowRole;

	@Column(name="impact_project")
	private String impactProject;

	@Column(name="inform_group")
	private String informGroup;

	@Column(name="issuer_id")
	private String issuerId;

	@Column(name="issuer_name")
	private String issuerName;

	@Column(name="last_modified_by")
	private String lastModifiedBy;

	@Column(name="last_modified_on")
	private Timestamp lastModifiedOn;

	private String productline;

	@Column(name="project_code")
	private String projectCode;

	@Column(name="reason_of_change")
	private String reasonOfChange;

	@Column(name="role_name_list")
	private String roleNameList;

	@Column(name="special_urgent_process")
	private String specialUrgentProcess;

	private String status;

	private String subject;

	@Column(name="utsr_id")
	private String utsrId;

	public EcoCoverpageEntity() {
	}

	public Long getSeqNo() {
		return this.seqNo;
	}

	public void setSeqNo(Long seqNo) {
		this.seqNo = seqNo;
	}

	public String getAttachments() {
		return this.attachments;
	}

	public void setAttachments(String attachments) {
		this.attachments = attachments;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getCustomer() {
		return this.customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Timestamp getCustomerEcInitialDate() {
		return this.customerEcInitialDate;
	}

	public void setCustomerEcInitialDate(Timestamp customerEcInitialDate) {
		this.customerEcInitialDate = customerEcInitialDate;
	}

	public String getCustomerEcNo() {
		return this.customerEcNo;
	}

	public void setCustomerEcNo(String customerEcNo) {
		this.customerEcNo = customerEcNo;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescriptionOfChange() {
		return this.descriptionOfChange;
	}

	public void setDescriptionOfChange(String descriptionOfChange) {
		this.descriptionOfChange = descriptionOfChange;
	}

	public String getEcnNo() {
		return this.ecnNo;
	}

	public void setEcnNo(String ecnNo) {
		this.ecnNo = ecnNo;
	}

	public String getEcoCosigner() {
		return this.ecoCosigner;
	}

	public void setEcoCosigner(String ecoCosigner) {
		this.ecoCosigner = ecoCosigner;
	}

	public String getEcoNo() {
		return this.ecoNo;
	}

	public void setEcoNo(String ecoNo) {
		this.ecoNo = ecoNo;
	}

	public String getEcrNo() {
		return this.ecrNo;
	}

	public void setEcrNo(String ecrNo) {
		this.ecrNo = ecrNo;
	}

	public String getFlowRole() {
		return this.flowRole;
	}

	public void setFlowRole(String flowRole) {
		this.flowRole = flowRole;
	}

	public String getImpactProject() {
		return this.impactProject;
	}

	public void setImpactProject(String impactProject) {
		this.impactProject = impactProject;
	}

	public String getInformGroup() {
		return this.informGroup;
	}

	public void setInformGroup(String informGroup) {
		this.informGroup = informGroup;
	}

	public String getIssuerId() {
		return this.issuerId;
	}

	public void setIssuerId(String issuerId) {
		this.issuerId = issuerId;
	}

	public String getIssuerName() {
		return this.issuerName;
	}

	public void setIssuerName(String issuerName) {
		this.issuerName = issuerName;
	}

	public String getLastModifiedBy() {
		return this.lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public Timestamp getLastModifiedOn() {
		return this.lastModifiedOn;
	}

	public void setLastModifiedOn(Timestamp lastModifiedOn) {
		this.lastModifiedOn = lastModifiedOn;
	}

	public String getProductline() {
		return this.productline;
	}

	public void setProductline(String productline) {
		this.productline = productline;
	}

	public String getProjectCode() {
		return this.projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getReasonOfChange() {
		return this.reasonOfChange;
	}

	public void setReasonOfChange(String reasonOfChange) {
		this.reasonOfChange = reasonOfChange;
	}

	public String getRoleNameList() {
		return this.roleNameList;
	}

	public void setRoleNameList(String roleNameList) {
		this.roleNameList = roleNameList;
	}

	public String getSpecialUrgentProcess() {
		return this.specialUrgentProcess;
	}

	public void setSpecialUrgentProcess(String specialUrgentProcess) {
		this.specialUrgentProcess = specialUrgentProcess;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getUtsrId() {
		return this.utsrId;
	}

	public void setUtsrId(String utsrId) {
		this.utsrId = utsrId;
	}

}