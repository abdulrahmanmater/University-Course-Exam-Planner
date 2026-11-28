package eg.edu.benha.ele331.services;

/**
 * One service per feature: holds in-memory state and orders algorithm calls.
 */
public class ExamConflictService {

    public boolean hasRoomClash(String slotId, String roomId) {
        throw new UnsupportedOperationException("TODO: implement");
    }

    public boolean hasStudentClash(String examId, String slotId) {
        throw new UnsupportedOperationException("TODO: implement");
    }

    public String rejectReason(String examId, String slotId, String roomId) {
        throw new UnsupportedOperationException("TODO: implement");
    }
}
