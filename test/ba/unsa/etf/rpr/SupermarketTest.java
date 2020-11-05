package ba.unsa.etf.rpr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {



    @Test
    void izbaciArtiklSaKodomKadaNemaArtikla() {

     assertSame(null, s1.izbaciArtiklSaKodom("1"));
    }

    @Test
    void izbaciArtiklSaKodomKadaIzbacujemoArtiklSaKodomKojegNema() {
        Supermarket s1 = new Supermarket();
        Artikl a1 = new Artikl("brasno", 20, "1");
        assertSame(null, s1.izbaciArtiklSaKodom("2"));
    }

    @Test
    void izbaciArtiklSaKodomKadaUKorpiPostojeArtikli() {
        Supermarket s1 = new Supermarket();
        Artikl a1 = new Artikl("brasno", 20, "1");
        assertSame(s1, s1.izbaciArtiklSaKodom("1"));
    }


    @Test
    void testGetArtikliProizvoljno() {
      Artikl a1 = new Artikl("brasno", 5, "1");
      Supermarket s1 = new Supermarket();
      s1.dodajArtikl(a1);
      Artikl[] artikli1 = s1.getArtikli();
      Artikl[] artikli2 = new Artikl[1000];
      artikli2[0] = a1;
   assertArrayEquals(artikli1, artikli2);
    }

    @Test
    void testGetArtikliKadaJeSupermarketPrazan() {
        Supermarket s1 = new Supermarket();
     //   Artikl[] s2 = ;
        assertArrayEquals(new Artikl[1000], s1.getArtikli());
    }



}