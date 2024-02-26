package Feb13.Encapsulation;

public class Main {
    public static void main(String[] args) {

        LoginUserW lsw = new LoginUserW(102,"dave");

        LoginUser ls = new LoginUser("101","maharshi");

       /* String uname = ls.getUserName();
        System.out.println("This is your username:"+ uname);*/
        /*String id = ls.getId();
        System.out.println("This is your id:"+id);*/
        System.out.println("Please type in the new ID");
        lsw.setId(104);
        System.out.println("Please type in your new username:");
        lsw.setUserName("abcd");

        int ID = lsw.id;
        System.out.println("");

    }
}
