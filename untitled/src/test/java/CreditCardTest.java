import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    CreditCard creditCard;

    @Before
    public void before(){
        creditCard = new CreditCard(7144940, 2027, 143, 100);
    }

    @Test
    public void getAccountNUmber(){
        assertEquals(7144940, creditCard.getCardNumber());
    }

    @Test
    public void canGetCredit(){
        assertEquals(100, creditCard.getCredit(), 0.0);
    }

    @Test
    public void canGetExpiryDate(){
        assertEquals(2027, creditCard.getExpiryDate());
    }
    @Test
    public void canGetSecurityNumber(){
        assertEquals(143, creditCard.getSecurityNumber());
    }



}
