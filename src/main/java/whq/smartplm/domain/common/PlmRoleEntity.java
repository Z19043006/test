package whq.smartplm.domain.common;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the plm_roles database table.
 * 
 */
@Entity
@Table(name = "plm_roles", schema = "public", catalog = "smartplm")
public class PlmRoleEntity implements Serializable {

	@Id
	@Column(name="role_id")
	private String roleId;

	private Boolean enabled;

	private Integer order;

	@Column(name="role_name")
	private String roleName;

	@Column(name="short_description")
	private String shortDescription;

	public PlmRoleEntity() {
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Integer getOrder() {
		return this.order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getShortDescription() {
		return this.shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

}