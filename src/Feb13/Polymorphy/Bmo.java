package Feb13.Polymorphy;

public class Bmo extends CanadaBank {

    double BmoInterestRate;

    public Bmo(double interestRate, double bmoInterestRate) {
        super(interestRate);
        BmoInterestRate = bmoInterestRate;
    }

    @Override
    public double getRateOfInterest() {
        return BmoInterestRate + CanadaBank.CbinterestRate;
    }
}
