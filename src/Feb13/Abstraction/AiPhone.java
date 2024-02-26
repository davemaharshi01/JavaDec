package Feb13.Abstraction;

public class AiPhone extends SmartPhone {

    public void generateImages(){
        System.out.println("Generating Images");
    }

    @Override
    public void internetFeature() {
        System.out.println("It has internet feature too..");
    }

    @Override
    public void cordlessFeature() {
        System.out.println("It can connect to any phone without any cords");
    }

    @Override
    public void call() {
        System.out.println("It has call feature");
    }
}
