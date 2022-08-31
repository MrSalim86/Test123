import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KontoTest {

    Konto konto = new Konto("Mohamed");
    Konto konto1 = new Konto("Palle",100);





    @Test
    void deposit() {

        assertEquals(100,konto.deposit(100));
        assertEquals(200,konto.deposit(100));
        assertEquals(200,konto.deposit(-100));


    }

    @Test
    void withdraw() {
        assertEquals(0,konto1.withdraw(100));
    }
}