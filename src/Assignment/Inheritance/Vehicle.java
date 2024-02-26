package Assignment.Inheritance;

public class Vehicle {

    String make;
    String model;
    int year;


    Vehicle (String make, String model, int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void start(){
        System.out.println("car is starting");
    }

    public void stop(){
        System.out.println("car is stopping");
    }

    public void displayInfo(){
        System.out.println("Info is displaying");
    }
}
