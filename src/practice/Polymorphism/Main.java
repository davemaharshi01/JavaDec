package practice.Polymorphism;

public class Main {
    public static void main(String[] args) {

        Animal d = new Dog();

        String dogSound = d.make_sound();
        System.out.println(dogSound);
    }
}
