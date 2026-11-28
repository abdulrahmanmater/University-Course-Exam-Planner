package eg.edu.benha.ele331.ui;

import eg.edu.benha.ele331.services.PerformanceAnalysisService;

/**
 * JavaFX screen: reads input, calls one service, renders the result.
 */
public class PerformanceAnalysisView {

    private final PerformanceAnalysisService service;

    public PerformanceAnalysisView(PerformanceAnalysisService service) {
        this.service = service;
        // TODO: build the N / 2N / 4N / 8N controls and the chart area.
    }

    public void runBenchmark(int n) {
        // TODO: call PerformanceAnalysisService and draw the chart + complexity notes.
    }
}
