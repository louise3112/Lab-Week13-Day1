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
        creditCard = new CreditCard(71449408, 2027, 143, 100.00);
        debitCard = new DebitCard(71449392, 2024, 134, 49382746, 503023);
        giftCard = new GiftCard(10.00);
        wallet = new Wallet();
    }

    @Test
    public void startsWithNoPaymentOptions() {
        assertEquals(0, wallet.getPaymentOptions().size());
    }

    @Test
    public void canAddPaymentOptions() {
        wallet.addPaymentOption(creditCard);
        wallet.addPaymentOption(debitCard);
        wallet.addPaymentOption(giftCard);
        assertEquals(3, wallet.getPaymentOptions().size());
    }

    @Test
    public void startsWithNoSelectedPaymentOption() {
        assertEquals(null, wallet.getSelectedPaymentOption());
    }

    @Test
    public void canSetSelectedPaymentOption() {
        wallet.addPaymentOption(creditCard);
        wallet.addPaymentOption(debitCard);
        wallet.setSelectedPaymentOption(creditCard);
        assertEquals(creditCard, wallet.getSelectedPaymentOption());
    }

    @Test
    public void canPay() {
        wallet.addPaymentOption(debitCard);
        wallet.pay(debitCard, 20.00);
        assertEquals(1, debitCard.getTransactionLog().size());
    }

}
