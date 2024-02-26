package Assignment.OOPS.Inheritance;

public class Main {
    public static void main(String[] args) {

        Vehicle v = new Vehicle("BMW", "M4", 2024);
        Car c = new Car("BMW","M5",2024,"4stroke",1000,"Manual 8 speed");

        System.out.println("Vehicle Make is: " + v.make + " and model: " + v.model + " from year: " + v.year );
        System.out.println("Here are some functions of the Vehicle: " + v.intial());
        System.out.println("Here are some functions of the Vehicle: " + v.stop());
        System.out.println("Here are some functions of the Vehicle: " + v.displayInfo());

        System.out.println(c.make + " " + c.model + " runs at " + c.rpm + " rpm and transmission is: " + c.gearType);

    }
}
