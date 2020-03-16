package whq.smartplm.domain.eco;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="eco_comment",schema = "ccm", catalog = "smartplm")
public class EcoCommentEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator = "eco_comment_generator")
    @SequenceGenerator(name="eco_comment_generator",sequenceName="ccm.eco_comment_seq",allocationSize = 1)
    @Column(name="seq_no")
    private Long seqNo;

    @Column(name="comment")
    private String comment;

    @Column(name="employee_no")
    private String employeeNo;

    @NotBlank(message = "ecrNo can't be blank")
    @Column(name="ecr_no")
    private String ecrNo;

    public Long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Long seqNo) {
        this.seqNo = seqNo;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo;
    }

    public String getEcrNo() {
        return ecrNo;
    }

    public void setEcrNo(String ecrNo) {
        this.ecrNo = ecrNo;
    }

    @Override
    public String toString() {
        return "EcoComment{" +
                "seqNo=" + seqNo +
                ", comment='" + comment + '\'' +
                ", employeeNo='" + employeeNo + '\'' +
                ", ecrNo='" + ecrNo + '\'' +
                '}';
    }
}
