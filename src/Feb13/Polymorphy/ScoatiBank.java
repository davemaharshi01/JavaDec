package Feb13.Polymorphy;

public class ScoatiBank extends CanadaBank {

    double ScInterestRate;

    public ScoatiBank(double interestRate, double scInterestRate) {
        super(interestRate);
        ScInterestRate = scInterestRate;
    }

    @Override
    public double getRateOfInterest() {
        return ScInterestRate + CanadaBank.CbinterestRate;
    }
}
