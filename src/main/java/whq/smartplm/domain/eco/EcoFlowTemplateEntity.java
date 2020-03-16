package whq.smartplm.domain.eco;

import javax.persistence.*;

/**
 * The persistent class for the eco_role_name_list database table.
 *
 */
@Entity
@Table(name="eco_flow_template",schema = "ccm", catalog = "smartplm")
public class EcoFlowTemplateEntity {
    @Id
    @Column(name="seq_no")
    private Long seqNo;

    @Column(name="plant")
    private String plant;

    @Column(name="role")
    private String role;

    @Column(name="sequence")
    private String sequence;

    @Column(name="name")
    private String name;

    public EcoFlowTemplateEntity() {
    }

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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
