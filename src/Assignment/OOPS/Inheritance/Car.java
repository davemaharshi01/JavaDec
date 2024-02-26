package Assignment.OOPS.Inheritance;

public class Car extends Vehicle {

    String typeOfEngine;
    int rpm;

    String gearType;

    public Car(String make, String model, int year, String typeOfEngine, int rpm, String gearType) {
        super(make, model, year);
        this.typeOfEngine = typeOfEngine;
        this.rpm = rpm;
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
