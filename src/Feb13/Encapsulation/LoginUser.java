package Feb13.Encapsulation;

public class LoginUser {
    private String id;
    private String userName;

    public LoginUser(String id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public String getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }


    public void loginuser(){
        if (id.equalsIgnoreCase(this.id) && userName.equalsIgnoreCase(this.userName)){
            System.out.println("Credentials are authenticated");
        }
        else {
            System.out.println("Invalid Please try again");
        }
    }
}
