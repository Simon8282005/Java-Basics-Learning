public class NotFoundError extends Exception {
    public NotFoundError(String message) {
      super(message);
      System.out.println(message);
    }
}
