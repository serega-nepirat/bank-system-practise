public class BankAccount {
    public String iban;
    public String owner_id;
    public String currency;
    public double balance;
    public String account_type;
    public BankAccount() {
        iban = "UA000000000000000000000000000";
        owner_id = "CL00000";
        currency = "UAH";
        balance = 0.0;
        account_type = "DEBIT";
    }

    public BankAccount(String iban, String owner_id, String currency, double balance, String account_type) {
        this.iban = iban;
        this.owner_id = owner_id;
        this.currency = currency;
        this.balance = balance;
        this.account_type = account_type;
    }

    public void deposit(double amount) {}
    public void withdraw(double amount) {}
    public void printInfo() {
        System.out.printf("IBAN: %s, Owner ID: %s, Currency: %s, Balance: %.2f, Type: %s%n",
                iban, owner_id, currency, balance, account_type);
    }

    public String toString() {
        return String.format("BankAccount [IBAN: %s, Owner ID: %s, Currency: %s, Balance: %.2f, Type: %s]",
                iban, owner_id, currency, balance, account_type);
    }
}