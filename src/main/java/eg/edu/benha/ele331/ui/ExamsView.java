package eg.edu.benha.ele331.ui;

import eg.edu.benha.ele331.services.ExamSchedulingService;
import eg.edu.benha.ele331.services.ExamConflictService;

/**
 * JavaFX screen: reads input, calls one service, renders the result.
 */
public class ExamsView {

    private final ExamSchedulingService schedulingService;
    private final ExamConflictService conflictService;

    public ExamsView(ExamSchedulingService schedulingService, ExamConflictService conflictService) {
        this.schedulingService = schedulingService;
        this.conflictService = conflictService;
        // TODO: build exam / slot / room pickers and the assignment table.
    }

    public void refresh() {
        // TODO: render assignments ordered by start time.
    }
}
