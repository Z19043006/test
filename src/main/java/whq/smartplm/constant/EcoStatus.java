package whq.smartplm.constant;

public enum EcoStatus {
    Preparation(0),
    Implementation(1),
    FinalApproval(2),
    Closed(3),
    Rework(4),
    Canceled(5);

    private int value;
    private EcoStatus(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}
