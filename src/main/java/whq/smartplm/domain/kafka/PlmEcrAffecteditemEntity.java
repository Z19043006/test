package whq.smartplm.domain.kafka;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 2 * @Author: Daji Chen
 * 3 * @Date: 2020/3/12 15:55
 * 4
 */
@Entity
@Table(name = "plm_ecr_affecteditem", schema = "kafka", catalog = "smartplm")
public class PlmEcrAffecteditemEntity {
    @Id
    @Column(name = "seq_no")
    long seqNo;
    @Column(name = "sync_id")
    long syncId;
    @Column(name = "ecno")
    String ecno;
    @Column(name = "batchno")
    String batchno;
    @Column(name = "action")
    String action;
    @Column(name = "parentnumber")
    String parentnumber;
    @Column(name = "parentname")
    String parentname;
    @Column(name = "origpartnumber")
    String origpartnumber;
    @Column(name = "origpartname")
    String origpartname;
    @Column(name = "newpartnumber")
    String newpartnumber;
    @Column(name = "newpartname")
    String newpartname;
    @Column(name = "origqty")
    String origqty;
    @Column(name = "newqty")
    String newqty;
    @Column(name = "origlocation")
    String origlocation;
    @Column(name = "newlocation")
    String newlocation;
    @Column(name = "addsubs")
    String addsubs;
    @Column(name = "addsubsname")
    String addsubsname;
    @Column(name = "deletesubs")
    String deletesubs;
    @Column(name = "deletesubsname")
    String deletesubsname;
    @Column(name = "status")
    String status;
    @Column(name = "revision")
    String revision;
    @Column(name = "bom_unit")
    String bomUnit;
    @Column(name = "part_kind")
    String partKind;
    @Column(name = "last_updated")
    String lastUpdated;

    public long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(long seqNo) {
        this.seqNo = seqNo;
    }

    public long getSyncId() {
        return syncId;
    }

    public void setSyncId(long syncId) {
        this.syncId = syncId;
    }

    public String getEcno() {
        return ecno;
    }

    public void setEcno(String ecno) {
        this.ecno = ecno;
    }

    public String getBatchno() {
        return batchno;
    }

    public void setBatchno(String batchno) {
        this.batchno = batchno;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getParentnumber() {
        return parentnumber;
    }

    public void setParentnumber(String parentnumber) {
        this.parentnumber = parentnumber;
    }

    public String getParentname() {
        return parentname;
    }

    public void setParentname(String parentname) {
        this.parentname = parentname;
    }

    public String getOrigpartnumber() {
        return origpartnumber;
    }

    public void setOrigpartnumber(String origpartnumber) {
        this.origpartnumber = origpartnumber;
    }

    public String getOrigpartname() {
        return origpartname;
    }

    public void setOrigpartname(String origpartname) {
        this.origpartname = origpartname;
    }

    public String getNewpartnumber() {
        return newpartnumber;
    }

    public void setNewpartnumber(String newpartnumber) {
        this.newpartnumber = newpartnumber;
    }

    public String getNewpartname() {
        return newpartname;
    }

    public void setNewpartname(String newpartname) {
        this.newpartname = newpartname;
    }

    public String getOrigqty() {
        return origqty;
    }

    public void setOrigqty(String origqty) {
        this.origqty = origqty;
    }

    public String getNewqty() {
        return newqty;
    }

    public void setNewqty(String newqty) {
        this.newqty = newqty;
    }

    public String getOriglocation() {
        return origlocation;
    }

    public void setOriglocation(String origlocation) {
        this.origlocation = origlocation;
    }

    public String getNewlocation() {
        return newlocation;
    }

    public void setNewlocation(String newlocation) {
        this.newlocation = newlocation;
    }

    public String getAddsubs() {
        return addsubs;
    }

    public void setAddsubs(String addsubs) {
        this.addsubs = addsubs;
    }

    public String getAddsubsname() {
        return addsubsname;
    }

    public void setAddsubsname(String addsubsname) {
        this.addsubsname = addsubsname;
    }

    public String getDeletesubs() {
        return deletesubs;
    }

    public void setDeletesubs(String deletesubs) {
        this.deletesubs = deletesubs;
    }

    public String getDeletesubsname() {
        return deletesubsname;
    }

    public void setDeletesubsname(String deletesubsname) {
        this.deletesubsname = deletesubsname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public String getBomUnit() {
        return bomUnit;
    }

    public void setBomUnit(String bomUnit) {
        this.bomUnit = bomUnit;
    }

    public String getPartKind() {
        return partKind;
    }

    public void setPartKind(String partKind) {
        this.partKind = partKind;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

}
