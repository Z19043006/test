package whq.smartplm.domain.common;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the plm_sitetab database table.
 * 
 */
@Entity
@Table(name = "plm_sitetab", schema = "public", catalog = "smartplm")
public class PlmSitetabEntity implements Serializable {

	@Id
	private String uccsitename;

	private String acceptanybom;

	private String bomdisporder;

	@Column(name="class")
	private String class_;

	private String creationdate;

	private String curdbname;

	private String ecositecode;

	private String iscsdplant;

	private String issapplant;

	private String istritonplant;

	private String itemdisporder;

	private String lastmodifier;

	private String lastupdate;

	private String locatedsite;

	private String nonvalueplant;

	private String obid;

	private String plantcode;

	private String plantinutf8env;

	private BigDecimal pricepriority;

	private String recycled;

	private String seindexlanguagelist;

	private BigDecimal uccsitemapnum;

	private String uccsitenamedisp;

	private String windowemail;

	private String windowemail2;

	private String zblob;

	public PlmSitetabEntity() {
	}

	public String getAcceptanybom() {
		return this.acceptanybom;
	}

	public void setAcceptanybom(String acceptanybom) {
		this.acceptanybom = acceptanybom;
	}

	public String getBomdisporder() {
		return this.bomdisporder;
	}

	public void setBomdisporder(String bomdisporder) {
		this.bomdisporder = bomdisporder;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public String getCreationdate() {
		return this.creationdate;
	}

	public void setCreationdate(String creationdate) {
		this.creationdate = creationdate;
	}

	public String getCurdbname() {
		return this.curdbname;
	}

	public void setCurdbname(String curdbname) {
		this.curdbname = curdbname;
	}

	public String getEcositecode() {
		return this.ecositecode;
	}

	public void setEcositecode(String ecositecode) {
		this.ecositecode = ecositecode;
	}

	public String getIscsdplant() {
		return this.iscsdplant;
	}

	public void setIscsdplant(String iscsdplant) {
		this.iscsdplant = iscsdplant;
	}

	public String getIssapplant() {
		return this.issapplant;
	}

	public void setIssapplant(String issapplant) {
		this.issapplant = issapplant;
	}

	public String getIstritonplant() {
		return this.istritonplant;
	}

	public void setIstritonplant(String istritonplant) {
		this.istritonplant = istritonplant;
	}

	public String getItemdisporder() {
		return this.itemdisporder;
	}

	public void setItemdisporder(String itemdisporder) {
		this.itemdisporder = itemdisporder;
	}

	public String getLastmodifier() {
		return this.lastmodifier;
	}

	public void setLastmodifier(String lastmodifier) {
		this.lastmodifier = lastmodifier;
	}

	public String getLastupdate() {
		return this.lastupdate;
	}

	public void setLastupdate(String lastupdate) {
		this.lastupdate = lastupdate;
	}

	public String getLocatedsite() {
		return this.locatedsite;
	}

	public void setLocatedsite(String locatedsite) {
		this.locatedsite = locatedsite;
	}

	public String getNonvalueplant() {
		return this.nonvalueplant;
	}

	public void setNonvalueplant(String nonvalueplant) {
		this.nonvalueplant = nonvalueplant;
	}

	public String getObid() {
		return this.obid;
	}

	public void setObid(String obid) {
		this.obid = obid;
	}

	public String getPlantcode() {
		return this.plantcode;
	}

	public void setPlantcode(String plantcode) {
		this.plantcode = plantcode;
	}

	public String getPlantinutf8env() {
		return this.plantinutf8env;
	}

	public void setPlantinutf8env(String plantinutf8env) {
		this.plantinutf8env = plantinutf8env;
	}

	public BigDecimal getPricepriority() {
		return this.pricepriority;
	}

	public void setPricepriority(BigDecimal pricepriority) {
		this.pricepriority = pricepriority;
	}

	public String getRecycled() {
		return this.recycled;
	}

	public void setRecycled(String recycled) {
		this.recycled = recycled;
	}

	public String getSeindexlanguagelist() {
		return this.seindexlanguagelist;
	}

	public void setSeindexlanguagelist(String seindexlanguagelist) {
		this.seindexlanguagelist = seindexlanguagelist;
	}

	public BigDecimal getUccsitemapnum() {
		return this.uccsitemapnum;
	}

	public void setUccsitemapnum(BigDecimal uccsitemapnum) {
		this.uccsitemapnum = uccsitemapnum;
	}

	public String getUccsitename() {
		return this.uccsitename;
	}

	public void setUccsitename(String uccsitename) {
		this.uccsitename = uccsitename;
	}

	public String getUccsitenamedisp() {
		return this.uccsitenamedisp;
	}

	public void setUccsitenamedisp(String uccsitenamedisp) {
		this.uccsitenamedisp = uccsitenamedisp;
	}

	public String getWindowemail() {
		return this.windowemail;
	}

	public void setWindowemail(String windowemail) {
		this.windowemail = windowemail;
	}

	public String getWindowemail2() {
		return this.windowemail2;
	}

	public void setWindowemail2(String windowemail2) {
		this.windowemail2 = windowemail2;
	}

	public String getZblob() {
		return this.zblob;
	}

	public void setZblob(String zblob) {
		this.zblob = zblob;
	}

}