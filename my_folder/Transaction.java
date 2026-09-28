public class Transaction {
    public String transaction_id;
    public String sender_account;
    public String receiver_account;
    public double amount;
    public String purpose;
    public String status;

    public Transaction() {
        transaction_id = "TX000000";
        sender_account = "UNKNOWN";
        receiver_account = "UNKNOWN";
        amount = 0.0;
        purpose = "Test Transaction";
        status = "PENDING";
    }

    public Transaction(String transaction_id, String sender_account, String receiver_account, double amount, String purpose, String status) {
        this.transaction_id = transaction_id;
        this.sender_account = sender_account;
        this.receiver_account = receiver_account;
        this.amount = amount;
        this.purpose = purpose;
        this.status = status;
    }

    public void validateDetails() {}
    public void executeTransfer() {}
    public void printInfo() {
        System.out.printf("TX ID: %s, From: %s, To: %s, Amount: %.2f, Purpose: %s, Status: %s%n",
                transaction_id, sender_account, receiver_account, amount, purpose, status);
    }

    public String toString() {
        return String.format("Transaction [ID: %s, From: %s, To: %s, Amount: %.2f, Purpose: %s, Status: %s]",
                transaction_id, sender_account, receiver_account, amount, purpose, status);
    }
}