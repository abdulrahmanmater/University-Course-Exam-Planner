package eg.edu.benha.ele331.ui;

import eg.edu.benha.ele331.services.PrerequisiteService;

/**
 * JavaFX screen: reads input, calls one service, renders the result.
 */
public class PrerequisiteAnalyzerView {

    private final PrerequisiteService service;

    public PrerequisiteAnalyzerView(PrerequisiteService service) {
        this.service = service;
        // TODO: build the course picker and graph drawing area.
    }

    public void showAnalysis(String courseId) {
        // TODO: show direct / indirect prerequisites, dependents, cycle and study order.
    }
}
