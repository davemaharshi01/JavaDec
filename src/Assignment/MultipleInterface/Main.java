package Assignment.MultipleInterface;

public class Main {
    public static void main(String[] args) {

        System.out.println("Here are the details of some widely used internet based platforms");
        System.out.println("");
        Instagram instagram = new Instagram();
        System.out.println("Instagram");
        instagram.Message();
        instagram.socializeWithPeople();
        instagram.post();
        instagram.useAnytime();
        instagram.surf();

        System.out.println("");

        System.out.println("Gmail:");

        Gmail gmail = new Gmail();
        gmail.useAnytime();
        gmail.Message();
        gmail.publishData();
    }
}
