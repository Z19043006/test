package whq.smartplm.domain.kafka;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

/**
 * 2 * @Author: Daji Chen
 * 3 * @Date: 2020/3/2 15:43
 * 4
 */

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "plm_ecr_approvallog", schema = "kafka", catalog = "smartplm")
public class PlmEcrApprovalLogEntity {

    @Id
    @Column(name = "seq_no")
    long seqNo;

    @Column(name = "sync_id")
    long syncId;

    @Column(name = "stage")
    String stage;

    @Column(name = "received_time")
    String receivedTime;

    @Column(name = "ecr_no")
    String ecrNo;

    @Column(name = "cosignyn")
    String cosignyn;

    @Column(name = "cosign_user")
    String cosignUser;

    @Column(name = "cosign_type")
    String cosignType;

    @Column(name = "cosign_date")
    String cosignDate;

    public long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(long seqNo) {
        this.seqNo = seqNo;
    }

    public void setSyncId(long syncId) {
        this.syncId = syncId;
    }

    public long getSyncId() {
        return syncId;
    }

    public void setSyncId(int syncId) {
        this.syncId = syncId;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(String receivedTime) {
        this.receivedTime = receivedTime;
    }

    public String getEcrNo() {
        return ecrNo;
    }

    public void setEcrNo(String ecrNo) {
        this.ecrNo = ecrNo;
    }

    public String getCosignyn() {
        return cosignyn;
    }

    public void setCosignyn(String cosignyn) {
        this.cosignyn = cosignyn;
    }

    public String getCosignUser() {
        return cosignUser;
    }

    public void setCosignUser(String cosignUser) {
        this.cosignUser = cosignUser;
    }

    public String getCosignType() {
        return cosignType;
    }

    public void setCosignType(String cosignType) {
        this.cosignType = cosignType;
    }

    public String getCosignDate() {
        return cosignDate;
    }

    public void setCosignDate(String cosignDate) {
        this.cosignDate = cosignDate;
    }

    @Override
    public String toString() {
        return "ECRApprovalLogEntity{" +
                "seqNo=" + seqNo +
                ", syncId=" + syncId +
                ", stage='" + stage + '\'' +
                ", receivedTime='" + receivedTime + '\'' +
                ", ecrNo='" + ecrNo + '\'' +
                ", cosignyn='" + cosignyn + '\'' +
                ", cosignUser='" + cosignUser + '\'' +
                ", cosignType='" + cosignType + '\'' +
                ", cosignDate='" + cosignDate + '\'' +
                '}';
    }
}
