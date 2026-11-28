package eg.edu.benha.ele331.services;

import eg.edu.benha.ele331.model.Course;

/**
 * One service per feature: holds in-memory state and orders algorithm calls.
 */
public class CourseService {

    public Course[] allCourses() {
        throw new UnsupportedOperationException("TODO: implement");
    }

    public String[] availableCourses(String studentId) {
        throw new UnsupportedOperationException("TODO: implement");
    }

    public void addCourse(String studentId, String courseId) {
        // TODO: check dependencies, add the course and recompute availability.
    }

    public void removeCourse(String studentId, String courseId) {
        // TODO: remove the course and recompute availability.
    }
}
