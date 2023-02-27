import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    DebitCard debitCard;

    @Before
    public void before() {
        debitCard = new DebitCard(71449392, 2024, 134, 49382746, 503023);
    }

    @Test
    public void getCardNumber() {
        assertEquals(71449392, debitCard.getCardNumber());
    }

    @Test
    public void canGetExpiryDate() {
        assertEquals(2024, debitCard.getExpiryDate());
    }

    @Test
    public void canGetSecurityNumber() {
        assertEquals(134, debitCard.getSecurityNumber());
    }

    @Test
    public void getAccountNumber() {
        assertEquals(49382746, debitCard.getAccountNum());
    }

    @Test
    public void canGetSortCode() {
        assertEquals(503023, debitCard.getSortCode());
    }

    @Test
    public void transactionLogStartsEmpty() {
        assertEquals(0, debitCard.getTransactionLog().size());
    }

    @Test
    public void canCharge() {
        debitCard.charge(20.00);
        assertEquals(1, debitCard.getTransactionLog().size());
    }

}
