package Fab6;

public class phone {

    String type;

    public phone (String Model){
        this.type = Model;
    }

    public void MakeCall(){
        System.out.println(this.type);
    }
}
