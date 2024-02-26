package Assignment.OOPS.Inheritance;

public class Vehicle {
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public int start(){
        return 0;
    }
    public String intial(){
        return "Vehicle is starting";
    }
    public String stop(){
        return "Vehicle is stopping";
    }
    public String displayInfo(){
        return "Info is displaying";
    }


}
