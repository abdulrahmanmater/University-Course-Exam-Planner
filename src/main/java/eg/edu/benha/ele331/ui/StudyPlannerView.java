package eg.edu.benha.ele331.ui;

import eg.edu.benha.ele331.services.StudyPlannerService;

/**
 * JavaFX screen: reads input, calls one service, renders the result.
 */
public class StudyPlannerView {

    private final StudyPlannerService service;

    public StudyPlannerView(StudyPlannerService service) {
        this.service = service;
        // TODO: build the student picker and study-plan controls.
    }

    public void refresh() {
        // TODO: call StudyPlannerService and render the current study plan.
    }
}
