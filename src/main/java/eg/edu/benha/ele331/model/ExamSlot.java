package eg.edu.benha.ele331.model;

/**
 * Plain field holder mapped 1:1 to the JSON schema; no logic beyond constructor and getters.
 */
public class ExamSlot {
    private final String slotId;
    private final String start;
    private final String end;

    public ExamSlot(String slotId, String start, String end) {
        this.slotId = slotId;
        this.start = start;
        this.end = end;
    }

    public String slotId() {
        return slotId;
    }

    public String start() {
        return start;
    }

    public String end() {
        return end;
    }
}
