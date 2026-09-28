public class BankCard {
    public String card_number;
    public String expiration_date;
    public String cvv;
    public String pin;
    public double payment_limit;
    public BankCard() {
        card_number = "0000 0000 0000 0000";
        expiration_date = "12/99";
        cvv = "000";
        pin = "0000";
        payment_limit = 1000.0;
    }

    public BankCard(String card_number, String expiration_date, String cvv, String pin, double payment_limit) {
        this.card_number = card_number;
        this.expiration_date = expiration_date;
        this.cvv = cvv;
        this.pin = pin;
        this.payment_limit = payment_limit;
    }

    public void processPayment(double amount) {}
    public void setPaymentLimit(double newLimit) {}
    public void printInfo() {
        System.out.printf("Card: %s, Exp: %s, CVV: %s, PIN: %s, Limit: %.2f%n",
                card_number, expiration_date, cvv, pin, payment_limit);
    }

    public String toString() {
        return String.format("BankCard [Number: %s, Exp: %s, CVV: %s, PIN: %s, Limit: %.2f]",
                card_number, expiration_date, cvv, pin, payment_limit);
    }
}