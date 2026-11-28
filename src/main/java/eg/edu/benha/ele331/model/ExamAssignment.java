package eg.edu.benha.ele331.model;

/**
 * Plain field holder mapped 1:1 to the JSON schema; no logic beyond constructor and getters.
 */
public class ExamAssignment {
    private final String examId;
    private final String slotId;
    private final String roomId;

    public ExamAssignment(String examId, String slotId, String roomId) {
        this.examId = examId;
        this.slotId = slotId;
        this.roomId = roomId;
    }

    public String examId() {
        return examId;
    }

    public String slotId() {
        return slotId;
    }

    public String roomId() {
        return roomId;
    }
}
