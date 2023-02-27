public class CreditCard extends Card{

    private double availableCredit;

    public CreditCard(long cardNumber, int expiryDate, int securityNumber, double availableCredit) {
        super(cardNumber, expiryDate, securityNumber);
        this.availableCredit = availableCredit;
    }

    public double getCredit(){
        return availableCredit;
    }

    @Override
    public void charge(double chargeValue){
        double transactionCost = chargeValue * 1.02;
        availableCredit -= transactionCost;
        addTransaction(transactionCost);
    }

}
