public class CreditCard extends Card{

    private double availableCredit;

    public CreditCard(int cardNumber, int expiryDate, int securityNumber, double availableCredit) {
        super(cardNumber, expiryDate, securityNumber);
        this.availableCredit = availableCredit;
    }

    public double getCredit(){
        return availableCredit;
    }

    public void charge(double cost){
        double transactionCost = cost * 1.02;
        availableCredit -= transactionCost;
        addTransaction(transactionCost);
    }

}
