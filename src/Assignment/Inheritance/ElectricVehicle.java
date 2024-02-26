package Assignment.Inheritance;

import Assignment.Inheritance.Car;

public class ElectricVehicle extends Motorcycle {

    int batteryCapacity;
    public ElectricVehicle (String model, String make, int year, int numofDoors, int seats, int horsepower, int batterycapacity){
        super(model,make,year,numofDoors,seats,horsepower);
        this.batteryCapacity = batterycapacity;
    }
    public void chargeBattery(){
        System.out.println("Battery is charging");
    }
}
