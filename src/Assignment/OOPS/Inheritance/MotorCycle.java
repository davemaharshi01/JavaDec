package Assignment.OOPS.Inheritance;

public class MotorCycle extends Vehicle{

    String typeOfEngine;
    int rpm;
    int gears;

    String gearType;

    public MotorCycle(String make, String model, int year, String typeOfEngine, int rpm, int gears, String gearType) {
        super(make, model, year);
        this.typeOfEngine = typeOfEngine;
        this.rpm = rpm;
        this.gears = gears;
        this.gearType = gearType;
    }

    @Override
    public int start() {
        return rpm;
    }

    @Override
    public String displayInfo() {
        return gearType;
    }
}
