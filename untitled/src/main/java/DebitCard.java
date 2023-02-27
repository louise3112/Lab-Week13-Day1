public class DebitCard extends Card{

    private int accountNum;
    private int sortCode;

    public DebitCard(int cardNumber, int expiryDate, int securityNumber, int accountNum, int sortCode){
        super(cardNumber, expiryDate, securityNumber);
        this.accountNum = accountNum;
        this.sortCode = sortCode;
    }

    public int getAccountNum(){
        return accountNum;
    }

    public int getSortCode(){
        return sortCode;
    }

}
