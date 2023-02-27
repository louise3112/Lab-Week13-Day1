import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WalletTest {

    Wallet wallet;
    CreditCard creditCard;
    DebitCard debitCard;
    GiftCard giftCard;

    @Before
    public void before(){
        wallet = new Wallet();
        creditCard = new CreditCard(7144940, 2027, 143, 100);
        debitCard = new DebitCard(7144939, 2024, 134, 49382746, 503023);
        giftCard = new GiftCard(10);
        wallet.addPaymentOption(creditCard);
        wallet.addPaymentOption(giftCard);
        wallet.addPaymentOption(debitCard);
    }

    @Test
    public void walletHasPaymentOptions(){
        assertEquals(3, wallet.getPaymentOptions().size());
    }

    @Test
    public void canChargeCreditCard(){
        wallet.pay(creditCard, 35);
        assertEquals(64.3, creditCard.getCredit(), 0.0);
    }

    @Test
    public void canChargeDebitCard(){
        wallet.pay(debitCard, 35);
        assertEquals(1, debitCard.getTransaction().size());
    }

    @Test
    public void canChargeGiftCard(){
        wallet.pay(giftCard, 10);
        assertEquals(0, giftCard.getBalance(), 0.0);
    }

    @Test
    public void canSelectChargeCard(){
        wallet.setPaymentChoice(debitCard);
        assertEquals(debitCard, wallet.getPaymentChoice());
    }

}
