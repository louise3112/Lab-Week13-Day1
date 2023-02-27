import java.util.ArrayList;

public abstract class Card implements ICharge {
    private long cardNumber;
    private int expiryDate;
    private int securityNumber;
    private ArrayList<Double> transactionsLog;

    public Card(long cardNumber, int expiryDate, int securityNumber){
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
        this.transactionsLog = new ArrayList<>();
    }

    public long getCardNumber(){
        return cardNumber;
    }

    public int getExpiryDate() {
        return expiryDate;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }

    public ArrayList<Double> getTransactionLog(){
        return transactionsLog;
    }

    public void addTransaction(double chargeValue) {
        transactionsLog.add(chargeValue);
    }

    public void charge(double chargeValue){
        this.addTransaction(chargeValue);
    }

}
