package eg.edu.benha.ele331.ui;

import eg.edu.benha.ele331.services.CampusNavigationService;

/**
 * JavaFX screen: reads input, calls one service, renders the result.
 */
public class CampusNavigationView {

    private final CampusNavigationService service;

    public CampusNavigationView(CampusNavigationService service) {
        this.service = service;
        // TODO: build the campus map, start / destination pickers and result panel.
    }

    public void showRoute(String startBuildingId, String destinationBuildingId) {
        // TODO: show shortest path, total distance, BFS / DFS components and MST.
    }
}
