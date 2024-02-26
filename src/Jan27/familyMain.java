package Jan27;

public class familyMain {
    public static void main(String[] args) {

        family person1 = new family("kartik", 22);
        family person2 = new family("Maharshi", 25);
        family person3 = new family("Father", 55);
        family person4 = new family("Mother", 48);

        person1.printFamily();
        person2.printFamily();
        person3.printFamily();
        person4.printFamily();
    }
}
