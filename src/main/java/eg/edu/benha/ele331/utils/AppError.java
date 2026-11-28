package eg.edu.benha.ele331.utils;

/**
 * Application error type shared by services and the app shell.
 */
public class AppError extends RuntimeException {
    public AppError(String message) {
        super(message);
    }
}
