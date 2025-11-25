package ie.atu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccTest {

    BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount("ACC12345", "Anna", 100);
    }

    @Test
    void constructorInitialisation() {
        account = new BankAccount("ACC12345", "Anna", 150);
        assertEquals("ACC12345", account.getAccNo());
        assertEquals("Anna", account.getName());
        assertEquals(150, account.getBalance());
    }

    @Test
    void constructorNegativeInitialisation() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new BankAccount("ACC12345", "Anna", -150));

        assertEquals("Balance must be greater than 0.", ex.getMessage());
    }

    @Test
    public void testDepositSuccess() {  //increase balance by 50
        account.deposit(50);
        assertEquals(150, account.getBalance());
    }

    @Test
    public void testDepositInvalidAmount() {        //can't deposit 0
        assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(0);
        });
    }
    @Test
    public void testWithdrawalSuccess() {   //decrease balance by 10
        account.withdrawal(10);

        assertEquals(90, account.getBalance());
    }
    @Test
    public void testWithdrawalNegative() {  //fail if withdrawal negative

        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            account.withdrawal(-5);
        });

        assertEquals("Negative Withdrawal is not allowed.", ex.getMessage());
    }


}

