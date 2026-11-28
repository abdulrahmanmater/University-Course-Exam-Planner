package eg.edu.benha.ele331.model;

/**
 * Plain field holder mapped 1:1 to the JSON schema; no logic beyond constructor and getters.
 */
public class Room {
    private final String roomId;
    private final String name;
    private final int capacity;
    private final String buildingId;

    public Room(String roomId, String name, int capacity, String buildingId) {
        this.roomId = roomId;
        this.name = name;
        this.capacity = capacity;
        this.buildingId = buildingId;
    }

    public String roomId() {
        return roomId;
    }

    public String name() {
        return name;
    }

    public int capacity() {
        return capacity;
    }

    public String buildingId() {
        return buildingId;
    }
}
