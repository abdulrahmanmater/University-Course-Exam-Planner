package eg.edu.benha.ele331.ui;

import eg.edu.benha.ele331.services.CourseService;

/**
 * JavaFX screen: reads input, calls one service, renders the result.
 */
public class CoursesView {

    private final CourseService service;

    public CoursesView(CourseService service) {
        this.service = service;
        // TODO: build the JavaFX course list and input controls.
    }

    public void refresh() {
        // TODO: call CourseService and render available / unavailable courses with reasons.
    }
}
