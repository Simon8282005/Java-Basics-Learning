public class Testing extends PayentMethod {
    public Testing(String username, String paymentType) {
        super(username, paymentType);
    }

    public void makePayment(double amount) throws ErrorException {
        if (amount > 90.0) {
            throw new ErrorException("Error Occur", getUsername());
        }
    }
}
