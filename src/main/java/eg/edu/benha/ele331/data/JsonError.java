package eg.edu.benha.ele331.data;

/**
 * Readable parse error naming the file, line and column of the bad value.
 */
public class JsonError extends Exception {
    private final String file;
    private final int line;
    private final int column;

    public JsonError(String message, String file, int line, int column) {
        super(message + " (" + file + ":" + line + ":" + column + ")");
        this.file = file;
        this.line = line;
        this.column = column;
    }

    public String file() { return file; }
    public int line() { return line; }
    public int column() { return column; }
}
