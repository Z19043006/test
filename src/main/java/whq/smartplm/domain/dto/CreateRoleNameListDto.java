package whq.smartplm.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@ApiModel(description = "for create role name list")
public class CreateRoleNameListDto {

    @NotNull(message = "seqNo can't be empty.")
    @ApiModelProperty(example = "0000000123",required = true)
    private Long seqNo;

    @ApiModelProperty(required = true)
    @NotBlank(message = "updatedBy can't be empty.")
    private String plant;

    @ApiModelProperty(required = true)
    @NotBlank(message = "customer can't be empty.")
    private String customer;

    @ApiModelProperty(required = true)
    @NotBlank(message = "ecoRole can't be empty.")
    private String ecoRole;

    @ApiModelProperty(required = true)
    @NotBlank(message = "employeeNo can't be empty.")
    private String employeeNo;

    @ApiModelProperty(required = true)
    @NotBlank(message = "createdBy can't be empty.")
    private String createdBy;

    @ApiModelProperty(required = true)
    @NotBlank(message = "createdOn can't be empty.")
    private Timestamp createdOn;

    @ApiModelProperty(required = true)
    @NotBlank(message = "lastModifiedBy can't be empty.")
    private String lastModifiedBy;

    @ApiModelProperty(required = true)
    @NotBlank(message = "lastModifiedOn can't be empty.")
    private Timestamp lastModifiedOn;

    public Long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Long seqNo) {
        this.seqNo = seqNo;
    }

    public String getPlant() {
        return plant;
    }

    public void setPlant(String plant) {
        this.plant = plant;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getEcoRole() {
        return ecoRole;
    }

    public void setEcoRole(String ecoRole) {
        this.ecoRole = ecoRole;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Timestamp createdOn) {
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

    @Override
    public String toString() {
        return "CreateRoleNameListDato{" +
                "seqNo=" + seqNo +
                ", plant='" + plant + '\'' +
                ", customer='" + customer + '\'' +
                ", ecoRole='" + ecoRole + '\'' +
                ", employeeNo='" + employeeNo + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", createdOn=" + createdOn +
                ", lastModifiedBy='" + lastModifiedBy + '\'' +
                ", lastModifiedOn=" + lastModifiedOn +
                '}';
    }
}
