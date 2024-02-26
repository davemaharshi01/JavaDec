package Feb13.Polymorphy;

public class Rbc extends CanadaBank {

    double RbcInterestRate;

    public Rbc(double interestRate, double rbcInterestRate) {
        super(interestRate);
        RbcInterestRate = rbcInterestRate;
    }

    @Override
    public double getRateOfInterest() {
        return RbcInterestRate + CanadaBank.CbinterestRate;
    }
}
