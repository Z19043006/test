package whq.smartplm.domain.eco;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the eco_role_name_list database table.
 * 
 */
@Entity
@Table(name="eco_role_name_list",schema = "ccm", catalog = "smartplm")
public class EcoRoleNameListEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.SEQUENCE,generator = "eco_role_name_list_generator")
	@SequenceGenerator(name="eco_role_name_list_generator",sequenceName="ccm.eco_role_name_list_seq",allocationSize = 1)
	@Column(name="seq_no")
	private Long seqNo;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_on")
	private Timestamp createdOn;

	private String customer;

	@Column(name="role")
	private String role;

	@Column(name="employee_no")
	private String employeeNo;

	@Column(name="last_modified_by")
	private String lastModifiedBy;

	@Column(name="last_modified_on")
	private Timestamp lastModifiedOn;

	private String plant;

	public EcoRoleNameListEntity() {
	}

	public Long getSeqNo() {
		return this.seqNo;
	}

	public void setSeqNo(Long seqNo) {
		this.seqNo = seqNo;
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

	public String getEcoRole() {
		return this.role;
	}

	public void setEcoRole(String role) {
		this.role = role;
	}

	public String getEmployeeNo() {
		return this.employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
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

	public String getPlant() {
		return this.plant;
	}

	public void setPlant(String plant) {
		this.plant = plant;
	}

}