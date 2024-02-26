package Assignment.OOPS.Polymorphism;

public class PartTimeEmployee extends Employee {

    int totalWorkingHours;

    public PartTimeEmployee(int employeeId, String employeeName, int hourlyRate, int totalWorkingHours) {
        super(employeeId, employeeName, hourlyRate);
        this.totalWorkingHours = totalWorkingHours;
    }

    @Override
    public int calculatePay() {
        return totalWorkingHours * hourlyRate;
    }
}
