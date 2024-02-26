package Assignment.OOPS.Polymorphism;

public class Employee {
    int employeeId;
    String employeeName;
    int hourlyRate;

    public Employee(int employeeId, String employeeName, int hourlyRate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.hourlyRate = hourlyRate;
    }

    public int calculatePay(){
        return 0;
    }

}
