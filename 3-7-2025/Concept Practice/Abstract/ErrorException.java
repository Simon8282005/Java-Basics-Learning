public class ErrorException extends Exception {
    private String username;

    public ErrorException(String message, String username) {
        super(message);
        this.username = username;
    }
}
