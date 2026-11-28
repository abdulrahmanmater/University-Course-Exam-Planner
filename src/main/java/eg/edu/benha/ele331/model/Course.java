package eg.edu.benha.ele331.model;

/**
 * Plain field holder mapped 1:1 to the JSON schema; no logic beyond constructor and getters.
 */
public class Course {
    private final String courseId;
    private final String code;
    private final String name;
    private final String[] prerequisiteCourseIds;

    public Course(String courseId, String code, String name, String[] prerequisiteCourseIds) {
        this.courseId = courseId;
        this.code = code;
        this.name = name;
        this.prerequisiteCourseIds = prerequisiteCourseIds;
    }

    public String courseId() {
        return courseId;
    }

    public String code() {
        return code;
    }

    public String name() {
        return name;
    }

    public String[] prerequisiteCourseIds() {
        return prerequisiteCourseIds;
    }
}
