package whq.smartplm.domain.common;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "bas_email", schema = "public", catalog = "smartplm")
public class EmailBaseDataEntity {

    @Id
    private String id;
    private String objectnumber;
    private String objecttype;
    private String taskname;
    private String mailfrom;
    private String tousers;
    private String ccusers;
    private String bccusers;
    private String subject;
    private String mailcontent;
    private String fileflag;
    private Timestamp createdate;
    private String state;
    private String errormsg;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObjectnumber() {
        return objectnumber;
    }

    public void setObjectnumber(String objectnumber) {
        this.objectnumber = objectnumber;
    }

    public String getObjecttype() {
        return objecttype;
    }

    public void setObjecttype(String objecttype) {
        this.objecttype = objecttype;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public String getMailfrom() {
        return mailfrom;
    }

    public void setMailfrom(String mailfrom) {
        this.mailfrom = mailfrom;
    }

    public String getTousers() {
        return tousers;
    }

    public void setTousers(String tousers) {
        this.tousers = tousers;
    }

    public String getCcusers() {
        return ccusers;
    }

    public void setCcusers(String ccusers) {
        this.ccusers = ccusers;
    }

    public String getBccusers() {
        return bccusers;
    }

    public void setBccusers(String bccusers) {
        this.bccusers = bccusers;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMailcontent() {
        return mailcontent;
    }

    public void setMailcontent(String mailcontent) {
        this.mailcontent = mailcontent;
    }

    public String getFileflag() {
        return fileflag;
    }

    public void setFileflag(String fileflag) {
        this.fileflag = fileflag;
    }

    public Timestamp getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Timestamp createdate) {
        this.createdate = createdate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getErrormsg() {
        return errormsg;
    }

    public void setErrormsg(String errormsg) {
        this.errormsg = errormsg;
    }

    @Repository
    public static interface BasAccountRpository extends JpaRepository<BasAccountEntity, Long> {
        List<BasAccountEntity> findByEmployeeNo(String employeeNo);
        List<BasAccountEntity> findByEmployeeNoIn(List<String> employeeNoList);
        BasAccountEntity findOneByEmployeeNo(String employeeNo);
        BasAccountEntity findOneByEnglishName(String englishName);
    }

    @Repository
    public static interface EmailBaseDataRepository extends JpaRepository<EmailBaseDataEntity, String> {

    }
}