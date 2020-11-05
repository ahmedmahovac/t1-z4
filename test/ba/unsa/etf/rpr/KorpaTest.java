package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {



    @Test
    void testDodajArtiklKadaJeKorpaPrazna() {
        Artikl a1 = new Artikl("brasno", 20, "1");
        Korpa s1 = new Korpa();
        assertEquals(true, s1.dodajArtikl(a1));
    }


    @Test
    void testDodajArtiklKadaJeKorpaPuna() {
        Artikl a1 = new Artikl("brasno", 20, "1");
        Korpa s1 = new Korpa();
        for(int i=0; i<50; i++)  {
            s1.dodajArtikl(a1);
        }
        assertEquals(false, s1.dodajArtikl(a1));
    }

    @Test
    void testIzbaciArtiklSaKodomKadaJeUKorpiSamoJedanArtikal() {
        Artikl a1 = new Artikl("brasno", 20, "1");
        Korpa s1 = new Korpa();
            s1.dodajArtikl(a1);
            assertEquals(a1, s1.izbaciArtiklSaKodom("1"));
    }






    @Test
    void testIzbaciArtiklKojegNemaUKorpi() {
        Artikl a1 = new Artikl("brasno", 20, "1");
        Korpa s1 = new Korpa();
        s1.dodajArtikl(a1);
        assertSame(null, s1.izbaciArtiklSaKodom("2")); // ovo drugo bi trebala bit null referenca
    }


    @Test
    void testIzbaciArtiklIzKorpeKojaJePrazna() {
        Artikl a1 = new Artikl("brasno", 20, "1");
        Korpa s1 = new Korpa();
        assertSame(null, s1.izbaciArtiklSaKodom("2")); // ovo drugo bi trebala bit null referenca
    }





    @Test
    void testDajUkupnuCijenuArtikala() {
        Artikl a1 = new Artikl("brasno", 20, "1");
        Korpa s1 = new Korpa();
        s1.dodajArtikl(a1);
        s1.dodajArtikl(a1);
        assertEquals(s1.dajUkupnuCijenuArtikala(), 40);
    }



}