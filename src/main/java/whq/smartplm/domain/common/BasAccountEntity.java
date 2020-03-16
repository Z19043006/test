package whq.smartplm.domain.common;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "bas_account", schema = "public", catalog = "smartplm")
public class BasAccountEntity {
    private int seqNo;
    private String employeeNo;
    private Boolean isEnable;
    private String englishName;
    private String chineseName;
    private String displayName;
    private String dept;
    private String mail;
    private String phoneNo;
    private String workingSite;
    private String boss;
    private String companyNo;
    private Date terminationDt;
    private String createdBy;
    private String updatedBy;
    private Timestamp createdDt;
    private Timestamp updatedDt;

    @Id
    @Column(name = "seq_no")
    public int getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(int seqNo) {
        this.seqNo = seqNo;
    }

    @Basic
    @Column(name = "employee_no")
    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    @Basic
    @Column(name = "is_enable")
    public Boolean getEnable() {
        return isEnable;
    }

    public void setEnable(Boolean enable) {
        isEnable = enable;
    }

    @Basic
    @Column(name = "english_name")
    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    @Basic
    @Column(name = "chinese_name")
    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    @Basic
    @Column(name = "display_name")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Basic
    @Column(name = "dept")
    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Basic
    @Column(name = "mail")
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Basic
    @Column(name = "phone_no")
    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Basic
    @Column(name = "working_site")
    public String getWorkingSite() {
        return workingSite;
    }

    public void setWorkingSite(String workingSite) {
        this.workingSite = workingSite;
    }

    @Basic
    @Column(name = "boss")
    public String getBoss() {
        return boss;
    }

    public void setBoss(String boss) {
        this.boss = boss;
    }

    @Basic
    @Column(name = "company_no")
    public String getCompanyNo() {
        return companyNo;
    }

    public void setCompanyNo(String companyNo) {
        this.companyNo = companyNo;
    }

    @Basic
    @Column(name = "termination_dt")
    public Date getTerminationDt() {
        return terminationDt;
    }

    public void setTerminationDt(Date terminationDt) {
        this.terminationDt = terminationDt;
    }

    @Basic
    @Column(name = "created_by")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "updated_by")
    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Basic
    @Column(name = "created_dt")
    public Timestamp getCreatedDt() {
        return createdDt;
    }

    public void setCreatedDt(Timestamp createdDt) {
        this.createdDt = createdDt;
    }

    @Basic
    @Column(name = "updated_dt")
    public Timestamp getUpdatedDt() {
        return updatedDt;
    }

    public void setUpdatedDt(Timestamp updatedDt) {
        this.updatedDt = updatedDt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasAccountEntity that = (BasAccountEntity) o;
        return seqNo == that.seqNo &&
                Objects.equals(employeeNo, that.employeeNo) &&
                Objects.equals(isEnable, that.isEnable) &&
                Objects.equals(englishName, that.englishName) &&
                Objects.equals(chineseName, that.chineseName) &&
                Objects.equals(displayName, that.displayName) &&
                Objects.equals(dept, that.dept) &&
                Objects.equals(mail, that.mail) &&
                Objects.equals(phoneNo, that.phoneNo) &&
                Objects.equals(workingSite, that.workingSite) &&
                Objects.equals(boss, that.boss) &&
                Objects.equals(companyNo, that.companyNo) &&
                Objects.equals(terminationDt, that.terminationDt) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(updatedBy, that.updatedBy) &&
                Objects.equals(createdDt, that.createdDt) &&
                Objects.equals(updatedDt, that.updatedDt);
    }

    @Override
    public int hashCode() {

        return Objects.hash(seqNo, employeeNo, isEnable, englishName, chineseName, displayName, dept, mail, phoneNo, workingSite, boss, companyNo, terminationDt, createdBy, updatedBy, createdDt, updatedDt);
    }
}