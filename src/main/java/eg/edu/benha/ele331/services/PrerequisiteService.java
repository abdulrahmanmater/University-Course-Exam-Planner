package eg.edu.benha.ele331.services;

/**
 * One service per feature: holds in-memory state and orders algorithm calls.
 */
public class PrerequisiteService {

    public String[] directPrerequisites(String courseId) {
        throw new UnsupportedOperationException("TODO: implement");
    }

    public String[] indirectPrerequisites(String courseId) {
        throw new UnsupportedOperationException("TODO: implement");
    }

    public String[] dependents(String courseId) {
        throw new UnsupportedOperationException("TODO: implement");
    }

    public boolean hasCycle() {
        throw new UnsupportedOperationException("TODO: implement");
    }

    public int[] studyOrder() {
        throw new UnsupportedOperationException("TODO: implement");
    }
}
