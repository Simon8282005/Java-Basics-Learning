public class OverdraftException extends Exception {  // can directly extends
    private double deficit;

    public OverdraftException(String message, double deficit) {
        super(message);
        System.out.println("Deficit: " + deficit);
    }

    public void setDeficit(double deficit) {
        this.deficit = deficit;
    }

    public double getDeficit() {
        return deficit;
    }
}
