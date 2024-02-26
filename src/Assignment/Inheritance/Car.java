package Assignment.Inheritance;

public class Car extends Vehicle {
int numofDoors;
Car(String make, String model, int year, int numofDoors, int seats){
    super(make, model, year);
    this.numofDoors = numofDoors;
}

}
