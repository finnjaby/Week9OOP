package ie.atu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccTest {
    BankAccount account;

    @BeforeEach
    void setUp()
    {
        account = new BankAccount();
    }

    void constructorInitialisation()
    {
        account = new BankAccount("ACC12345", "Anna", 150);
        assertEquals("ACC12345", account.getAccNo());
        assertEquals("Anna", account.getName());
        assertEquals(150, account.getBalance());
    }

    @Test
    void constructorNegativeInitialisation()
    {
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new BankAccount("ACC12345", "Anna", -150));
        assertEquals("Balance must be greater than 0.", ex.getMessage());
    }
}
