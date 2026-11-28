package eg.edu.benha.ele331.model;

/**
 * Plain field holder mapped 1:1 to the JSON schema; no logic beyond constructor and getters.
 */
public class Student {
    private final String studentId;
    private final String name;
    private final String[] completedCourseIds;

    public Student(String studentId, String name, String[] completedCourseIds) {
        this.studentId = studentId;
        this.name = name;
        this.completedCourseIds = completedCourseIds;
    }

    public String studentId() {
        return studentId;
    }

    public String name() {
        return name;
    }

    public String[] completedCourseIds() {
        return completedCourseIds;
    }
}
