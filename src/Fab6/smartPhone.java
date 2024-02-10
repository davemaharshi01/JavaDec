package Fab6;

public class smartPhone extends phone {

    int Model;
    String color;

    public smartPhone(String type, int Model, String color){
        super(type);
        this.Model = Model;
        this.color = color;
    }

    public void surfInternet(){
        System.out.println(this.Model);
        System.out.println(this.color);
    }
}
