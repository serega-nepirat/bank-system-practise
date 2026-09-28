public class BankEmployee {
    public String employee_id;
    public String full_name;
    public String position;
    public String access_level;
    public BankEmployee() {
        employee_id = "EMP000";
        full_name = "Невідомий Співробітник";
        position = "Стажер";
        access_level = "LOW";
    }

    public BankEmployee(String employee_id, String full_name, String position, String access_level) {
        this.employee_id = employee_id;
        this.full_name = full_name;
        this.position = position;
        this.access_level = access_level;
    }

    public void administerSystem() {}
    public void approveRequest(String requestId) {}

    public void printInfo() {
        System.out.printf("EMP ID: %s, Name: %s, Position: %s, Access: %s%n",
                employee_id, full_name, position, access_level);
    }

    public String toString() {
        return String.format("BankEmployee [ID: %s, Name: %s, Position: %s, Access: %s]",
                employee_id, full_name, position, access_level);
    }
}