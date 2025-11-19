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
}
