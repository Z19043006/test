package whq.smartplm.domain.model;

import io.swagger.annotations.ApiModel;



public class RoleListDisplay {
    private String sequence;
    private String role;
    private String cosigner;

    public RoleListDisplay(){

    }
    public String getSequence() {
        return sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCosigner() {
        return cosigner;
    }

    public void setCosigner(String cosigner) {
        this.cosigner = cosigner;
    }

    @Override
    public String toString() {
        return "RoleListDisplay{" +
                "sequence='" + sequence + '\'' +
                ", role='" + role + '\'' +
                ", cosigner='" + cosigner + '\'' +
                '}';
    }
}
