package Feb17.AnnonymousDemo;

public class DellLaptop {
    public static void main(String[] args) {


        Computer computer = new Computer() {
            @Override
            public void calculate() {
                System.out.println("Calculating...");
            }

            @Override
            public void surfInternet() {
                System.out.println("Surf internet");
            }
        };
        computer.calculate();
        computer.surfInternet();
    }
}