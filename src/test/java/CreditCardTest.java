import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    CreditCard creditCard;

    @Before
    public void before(){
        creditCard = new CreditCard(71449408, 2027, 143, 100.00);
    }

    @Test
    public void getAccountNUmber(){
        assertEquals(71449408, creditCard.getCardNumber());
    }

    @Test
    public void canGetExpiryDate(){
        assertEquals(2027, creditCard.getExpiryDate());
    }
    @Test
    public void canGetSecurityNumber(){
        assertEquals(143, creditCard.getSecurityNumber());
    }

    @Test
    public void canGetCredit(){
        assertEquals(100.00, creditCard.getCredit(), 0.0);
    }

    @Test
    public void transactionLogStartsEmpty() {
        assertEquals(0, creditCard.getTransactionLog().size());
    }

    @Test
    public void canCharge() {
        creditCard.charge(40.00);
        assertEquals(1, creditCard.getTransactionLog().size());
        assertEquals(59.2, creditCard.getCredit(), 0.0);
    }

}
