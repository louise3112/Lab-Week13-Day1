import java.util.ArrayList;

public class Wallet {

    private ArrayList<ICharge> paymentOptions;
    private ICharge selectedPaymentOption;

    public Wallet(){
        paymentOptions = new ArrayList<>();
    }

    public ICharge getSelectedPaymentOption(){
        return this.selectedPaymentOption;
    }

    public void setSelectedPaymentOption(ICharge option){
        selectedPaymentOption = option;
    }

    public ArrayList<ICharge> getPaymentOptions(){
        return this.paymentOptions;
    }

    public void addPaymentOption(ICharge option){
        this.paymentOptions.add(option);
    }

    public void pay(ICharge option, double chargeValue){
        option.charge(chargeValue);
    }

}
