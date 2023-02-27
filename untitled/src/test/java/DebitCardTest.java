import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    DebitCard debitCard;

    @Before
    public void before(){
        debitCard = new DebitCard(7144939, 2024, 134, 49382746, 503023);
    }

    @Test
    public void getAccountNUmber(){
        assertEquals(7144939, debitCard.getCardNumber());
    }

    @Test
    public void canGetSortCode(){
        assertEquals(503023, debitCard.getSortCode());
    }

    @Test
    public void canGetExpiryDate(){
        assertEquals(2024, debitCard.getExpiryDate());
    }
    @Test
    public void canGetSecurityNumber(){
        assertEquals(143, debitCard.getSecurityNumber());
    }

    @Test
    public void canGetAccountNUmber(){
        assertEquals(49382746, debitCard.getCardNumber());
    }
}
