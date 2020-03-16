package whq.smartplm.domain.kafka;

import javax.persistence.*;

@Entity
@Table(name = "plm_allmfrparts", schema = "kafka", catalog = "smartplm")
public class PlmAllMfrPartsEntity {
    private int syncId;
    private String partNumber;
    private String manufacturer;
    private String manufacturerPN;
    private String amplStatus;
    private String greenFactor;
    private String vendorCode;

    @Id
    @Column(name = "sync_id")
    public int getSyncId() {
        return syncId;
    }

    public void setSyncId(int syncId) {
        this.syncId = syncId;
    }

    @Basic
    @Column(name = "partnumber")
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    @Basic
    @Column(name = "manufacturer")
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Basic
    @Column(name = "manufacturerpn")
    public String getManufacturerPN() {
        return manufacturerPN;
    }

    public void setManufacturerPN(String manufacturerPN) {
        this.manufacturerPN = manufacturerPN;
    }

    @Basic
    @Column(name = "amplstatus")
    public String getAmplStatus() {
        return amplStatus;
    }

    public void setAmplStatus(String amplStatus) {
        this.amplStatus = amplStatus;
    }

    @Basic
    @Column(name = "greenfactor")
    public String getGreenFactor() {
        return greenFactor;
    }

    public void setGreenFactor(String greenFactor) {
        this.greenFactor = greenFactor;
    }

    @Basic
    @Column(name = "vendorcode")
    public String getVendorCode() {
        return vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }
}
