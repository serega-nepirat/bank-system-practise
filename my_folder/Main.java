public class Main {
    public static void main(String[] args) {

        Client defaultClient = new Client();
        defaultClient.printInfo();
        BankAccount defaultAccount = new BankAccount();
        defaultAccount.printInfo();
        System.out.println();
        Client client = new Client("CL12345", "Іванов Іван", "0501234567", "1234567890", "ACTIVE");
        BankAccount account = new BankAccount("UA893052990000026001234567890", "CL12345", "UAH", 15000.50, "DEBIT");
        BankCard card = new BankCard("4149 1234 5678 9012", "12/28", "123", "0000", 5000.00);
        Transaction transaction = new Transaction("TX987654", "UA89...111", "UA89...222", 2500.00, "Оплата", "COMPLETED");
        BankEmployee employee = new BankEmployee("EMP001", "Петров Петро", "Адміністратор", "HIGH_LEVEL");

        System.out.println(client.toString());
        System.out.println(account.toString());
        System.out.println(card.toString());
        System.out.println(transaction.toString());
        System.out.println(employee.toString());
    }
}