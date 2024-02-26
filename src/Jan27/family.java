package Jan27;

public class family {

    String firstName;
    static String lastName = "Dave";
    int age;
    static String houseAdd = "Toronto";

    public family(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }

    public void printFamily(){
        System.out.println("Family detail: " + firstName  + " " + lastName + " " + age + " " + houseAdd);
    }
}
