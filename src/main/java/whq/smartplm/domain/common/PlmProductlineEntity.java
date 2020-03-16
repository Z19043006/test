package whq.smartplm.domain.common;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the plm_productline database table.
 * 
 */
@Entity
@Table(name = "plm_productline", schema = "public", catalog = "smartplm")
public class PlmProductlineEntity implements Serializable {

	@Id
	private String productcode;

	private String ecocemcode;

	private String ecoodmcode;

	private String productdesc;

	private String sapdevid;

	public PlmProductlineEntity() {
	}

	public String getEcocemcode() {
		return this.ecocemcode;
	}

	public void setEcocemcode(String ecocemcode) {
		this.ecocemcode = ecocemcode;
	}

	public String getEcoodmcode() {
		return this.ecoodmcode;
	}

	public void setEcoodmcode(String ecoodmcode) {
		this.ecoodmcode = ecoodmcode;
	}

	public String getProductcode() {
		return this.productcode;
	}

	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}

	public String getProductdesc() {
		return this.productdesc;
	}

	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}

	public String getSapdevid() {
		return this.sapdevid;
	}

	public void setSapdevid(String sapdevid) {
		this.sapdevid = sapdevid;
	}

}