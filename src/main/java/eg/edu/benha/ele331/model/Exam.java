package eg.edu.benha.ele331.model;

/**
 * Plain field holder mapped 1:1 to the JSON schema; no logic beyond constructor and getters.
 */
public class Exam {
    private final String examId;
    private final String courseId;
    private final int durationMinutes;

    public Exam(String examId, String courseId, int durationMinutes) {
        this.examId = examId;
        this.courseId = courseId;
        this.durationMinutes = durationMinutes;
    }

    public String examId() {
        return examId;
    }

    public String courseId() {
        return courseId;
    }

    public int durationMinutes() {
        return durationMinutes;
    }
}
