package atm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {

    @Test
    public void testInvalidInputAtm(){
        ATM atm = new ATM();
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            //Code under test
            atm.process(131);
        });

        Assertions.assertEquals(null,thrown.getMessage());
    }

    @Test
    public void testValidInputAtm(){
        ATM atm = new ATM();
        atm.process(135);
    }
}