package whq.smartplm.domain.eco;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * 2 * @Author: Daji Chen
 * 3 * @Date: 2020/3/11 15:26
 * 4
 */
@Entity
@Table(name = "eco_task_assigner", schema = "ccm", catalog = "smartplm")
public class EcoTaskAssignerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "eco_task_assigner_generator")
    @SequenceGenerator(name = "eco_task_assigner_generator", sequenceName = "ccm.eco_task_assigner_seq", allocationSize = 1)
    @Column(name = "seq_no")
    long seqNo;

    @Column(name = "employee_no")
    String employeeNo;

    @Column(name = "plant")
    String plant;

    @Column(name = "role")
    String role;

    @Column(name = "created_by")
    String createdBy;

    @Column(name = "created_on")
    String createdOn;

    @Column(name = "last_modified_by")
    String lastModifiedBy;

    @Column(name = "last_modified_on")
    Timestamp lastModifiedOn;
    /* data from bas_account */
    @Transient
    String chineseName;
    @Transient
    String EnglishName;
    @Transient
    String phoneNo;

    public long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(long seqNo) {
        this.seqNo = seqNo;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Timestamp getLastModifiedOn() {
        return lastModifiedOn;
    }

    public void setLastModifiedOn(Timestamp lastModifiedOn) {
        this.lastModifiedOn = lastModifiedOn;
    }

    public String getChineseName() {
        return chineseName;
    }

    public void setChineseName(String chineseName) {
        this.chineseName = chineseName;
    }

    public String getEnglishName() {
        return EnglishName;
    }

    public void setEnglishName(String englishName) {
        EnglishName = englishName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "EcoTaskAssignerEntity{" +
                "seqNo=" + seqNo +
                ", employeeNo='" + employeeNo + '\'' +
                ", plant='" + plant + '\'' +
                ", role='" + role + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdOn='" + createdOn + '\'' +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", lastModifiedOn=" + lastModifiedOn +
                ", chineseName='" + chineseName + '\'' +
                ", EnglishName='" + EnglishName + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }
}
