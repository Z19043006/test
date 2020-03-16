package whq.smartplm.constant;

public enum EcoCosignStatus {
    Open(0),
    Approved(1),
    Rejected(2),
    Commented(3),
    MissAssignment(4);

    private int value;
    private EcoCosignStatus(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }

}


