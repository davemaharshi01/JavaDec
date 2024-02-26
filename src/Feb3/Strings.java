package Feb3;

public class Strings {
    public static void main(String[] args) {


        String s1 = "phone";
        s1 = "test";
        String s2 = "phone";
        String s3 = "phone";

        String s4 = new String("phone");


        System.out.println(s1 == s3);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s2.equals(s4));
        System.out.println(s1.equals(s4));
    }

}
