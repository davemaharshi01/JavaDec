package Feb13.Polymorphy;

public class Main {

    public static void main(String[] args) {

        Rbc r = new Rbc(3.0, 6.33);
        ScoatiBank sc = new ScoatiBank(3.0,4.25);
        Bmo b = new Bmo(3.0, 7.99);

        System.out.println("Current Interest rate for saving Account in RBC is: "+ r.getRateOfInterest());
        System.out.println("Current Interest rate for saving Account in ScotiaBank is: "+ sc.getRateOfInterest());
        System.out.println("Current Interest rate for saving Account in BMO is: "+ b.getRateOfInterest());
    }
}
