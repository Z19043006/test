package whq.smartplm.domain.eco;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the eco_cosigner database table.
 * 
 */
@Entity
@Table(name="eco_cosigner",schema = "ccm", catalog = "smartplm")
public class EcoCosignerEntity implements Serializable {

	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE,generator = "eco_cosigner_generator")
	@SequenceGenerator(name="eco_cosigner_generator",sequenceName="ccm.eco_cosigner_seq",allocationSize = 1)
	@Column(name="seq_no")
	private Long seqNo;

	@Column(name="cosign_comment")
	private String cosignComment;

	@Column(name="cosign_name")
	private String cosignName;

	@Column(name="cosign_role")
	private String cosignRole;

	@Column(name="cosign_status")
	private String cosignStatus;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_on")
	private Timestamp createdOn;

	@Column(name="eco_no")
	private String ecoNo;

	@Column(name="last_modified_by")
	private String lastModifiedBy;

	@Column(name="last_modified_on")
	private Timestamp lastModifiedOn;

	private String step;

	@Column(name="target_date")
	private Timestamp targetDate;

	public EcoCosignerEntity() {
	}

	public Long getSeqNo() {
		return this.seqNo;
	}

	public void setSeqNo(Long seqNo) {
		this.seqNo = seqNo;
	}

	public String getCosignComment() {
		return this.cosignComment;
	}

	public void setCosignComment(String cosignComment) {
		this.cosignComment = cosignComment;
	}

	public String getCosignName() {
		return this.cosignName;
	}

	public void setCosignName(String cosignName) {
		this.cosignName = cosignName;
	}

	public String getCosignRole() {
		return this.cosignRole;
	}

	public void setCosignRole(String cosignRole) {
		this.cosignRole = cosignRole;
	}

	public String getCosignStatus() {
		return this.cosignStatus;
	}

	public void setCosignStatus(String cosignStatus) {
		this.cosignStatus = cosignStatus;
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

	public String getEcoNo() {
		return this.ecoNo;
	}

	public void setEcoNo(String ecoNo) {
		this.ecoNo = ecoNo;
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

	public String getStep() {
		return this.step;
	}

	public void setStep(String step) {
		this.step = step;
	}

	public Timestamp getTargetDate() {
		return this.targetDate;
	}

	public void setTargetDate(Timestamp targetDate) {
		this.targetDate = targetDate;
	}

}