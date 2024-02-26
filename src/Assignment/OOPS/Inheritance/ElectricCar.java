package Assignment.OOPS.Inheritance;

public class ElectricCar extends Car{

    int batteryCapacity;

    public ElectricCar(String make, String model, int year, String typeOfEngine, int rpm, String gearType, int batteryCapacity) {
        super(make, model, year, typeOfEngine, rpm, gearType);
        this.batteryCapacity = batteryCapacity;
    }

    public void chargeBattery(){
        System.out.println("EV's take 35-60 kwh to achieve full charge");
    }
}
