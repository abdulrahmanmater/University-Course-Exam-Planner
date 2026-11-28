package eg.edu.benha.ele331.model;

/**
 * Plain field holder mapped 1:1 to the JSON schema; no logic beyond constructor and getters.
 */
public class Enrollment {
    private final String studentId;
    private final String courseId;
    private final String semester;

    public Enrollment(String studentId, String courseId, String semester) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.semester = semester;
    }

    public String studentId() {
        return studentId;
    }

    public String courseId() {
        return courseId;
    }

    public String semester() {
        return semester;
    }
}
