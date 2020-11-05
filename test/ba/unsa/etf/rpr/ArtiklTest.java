package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {


    @Test
    void getNaziv() {
        Artikl a1 = new Artikl("brasno", 20, "1");
        assertEquals("brasno", a1.getNaziv());
    }

    @Test
    void getKod() {
        Artikl a1 = new Artikl("brasno", 20, "1");
        assertEquals("1", a1.getKod());
    }

    @Test
    void getCijena() {
        Artikl a1 = new Artikl("brasno", 20, "1");
        assertEquals(20, a1.getCijena());
    }

}