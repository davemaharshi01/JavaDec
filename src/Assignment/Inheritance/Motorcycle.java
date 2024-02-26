package Assignment.Inheritance;

public class Motorcycle extends Car {
    int horsepower;

    Motorcycle(String model, String make, int year, int numofDoors, int seats, int horsepower){
        super(make,model,year,numofDoors,seats);
        this.horsepower = horsepower;
    }
    public void typeofMotorcycle(){
        System.out.println("It is a cruiser.");
    }
}
