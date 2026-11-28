package eg.edu.benha.ele331.model;

/**
 * Plain field holder mapped 1:1 to the JSON schema; no logic beyond constructor and getters.
 */
public class Building {
    private final String buildingId;
    private final String name;

    public Building(String buildingId, String name) {
        this.buildingId = buildingId;
        this.name = name;
    }

    public String buildingId() {
        return buildingId;
    }

    public String name() {
        return name;
    }
}
