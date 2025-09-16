abstract class PayentMethod {
    private String username;
    private String paymentType;

    public PayentMethod(String username, String paymentType) {
        setUsername(username);
        setPaymentType(paymentType);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getUsername() {
        return username;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public abstract void makePayment(double amount) throws ErrorException;
}