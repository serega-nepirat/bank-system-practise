public class Client {
    public String id;
    public String full_name;
    public String contact_info;
    public String tax_id;
    public String account_status;
    public Client() {
        id = "CL00000";
        full_name = "Максим Максимов";
        contact_info = "krutoichelek@gmail.com";
        tax_id = "0000000000";
        account_status = "NEW";
    }
    public Client(String id, String full_name, String contact_info, String tax_id, String account_status) {
        this.id = id;
        this.full_name = full_name;
        this.contact_info = contact_info;
        this.tax_id = tax_id;
        this.account_status = account_status;
    }

    public void authorize() {}
    public void manageFinances() {}
    public void initiateTransfer(String targetAccountId, double amount) {}
    public void printInfo() {
        System.out.printf("ID: %s, Full Name: %s, Contacts: %s, Tax ID: %s, Status: %s%n",
                id, full_name, contact_info, tax_id, account_status);
    }

    public String toString() {
        return String.format("Client [ID: %s, Name: %s, Contacts: %s, Tax ID: %s, Status: %s]",
                id, full_name, contact_info, tax_id, account_status);
    }
}