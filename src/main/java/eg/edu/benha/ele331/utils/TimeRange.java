package eg.edu.benha.ele331.utils;

/**
 * A start/end interval used by exam slot validation.
 */
public class TimeRange {
    private final String start;
    private final String end;

    public TimeRange(String start, String end) {
        this.start = start;
        this.end = end;
    }

    public String start() { return start; }
    public String end() { return end; }
}
