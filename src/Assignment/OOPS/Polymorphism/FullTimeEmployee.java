package Assignment.OOPS.Polymorphism;

public class FullTimeEmployee extends Employee {

    int totalWorkingHours;

    public FullTimeEmployee(int employeeId, String employeeName, int hourlyRate, int totalWorkingHours) {
        super(employeeId, employeeName, hourlyRate);
        this.totalWorkingHours = totalWorkingHours;
    }

    @Override
    public int calculatePay() {
        return totalWorkingHours * hourlyRate;
    }
}
