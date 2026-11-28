package eg.edu.benha.ele331.model;

/**
 * Plain field holder mapped 1:1 to the JSON schema; no logic beyond constructor and getters.
 */
public class Road {
    private final String fromBuildingId;
    private final String toBuildingId;
    private final int distance;

    public Road(String fromBuildingId, String toBuildingId, int distance) {
        this.fromBuildingId = fromBuildingId;
        this.toBuildingId = toBuildingId;
        this.distance = distance;
    }

    public String fromBuildingId() {
        return fromBuildingId;
    }

    public String toBuildingId() {
        return toBuildingId;
    }

    public int distance() {
        return distance;
    }
}
