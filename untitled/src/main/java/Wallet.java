import java.util.ArrayList;

public class Wallet {

    private ArrayList<ICharge> paymentOptions;
    private ICharge paymentChoice;

    public Wallet(){
        paymentOptions = new ArrayList<>();
    }

    public void setPaymentChoice(ICharge choice){
        paymentChoice = choice;
    }

    public ICharge getPaymentChoice(){
        return paymentChoice;
    }

    public ArrayList<ICharge> getPaymentOptions(){
        return paymentOptions;
    }

    public void addPaymentOption(ICharge card){
        paymentOptions.add(card);
    }

    public void pay(ICharge payment, double cost){
        payment.charge(cost);
    }


}
