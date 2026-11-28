package eg.edu.benha.ele331.structures;

/**
 * Data structure written from scratch; no java.util collections here.
 */
public class Edge {

    private final int from;
    private final int to;
    private final int weight;

    public Edge(int from, int to, int weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }

    public int from() { return from; }
    public int to() { return to; }
    public int weight() { return weight; }
}
