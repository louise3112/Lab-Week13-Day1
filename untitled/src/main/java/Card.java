import java.util.ArrayList;

public abstract class Card implements ICharge{
    private int cardNumber;
    private int expiryDate;
    private int securityNumber;
    private ArrayList<Double> transactions;

    public Card(int cardNumber, int expiryDate, int securityNumber){
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
        this.transactions = new ArrayList<>();
    }

    public int getCardNumber(){
        return cardNumber;
    }

    public int getExpiryDate() {
        return expiryDate;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }

    public ArrayList<Double> getTransaction(){
        return transactions;
    }

    public void addTransaction(double transaction){
        transactions.add(transaction);
    }

    public void charge(double purchaseAmount){
        addTransaction(purchaseAmount);
    }




}
