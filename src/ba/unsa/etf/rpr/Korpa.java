package ba.unsa.etf.rpr;

public class Korpa {
    private final Artikl[] artikli;

    public Korpa() {
        artikli = new Artikl[50]; // inic na null
    }
    public boolean dodajArtikl(Artikl a) {
        for(int i=0; i<artikli.length; i++) if(artikli[i] == null) {
            artikli[i] = a;
        return true;
        }
        return false;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl tmp = null;
        for(int i=0; i<artikli.length; i++) if(artikli[i].getKod().equals(kod)) {
            tmp = artikli[i];
            artikli[i] =  null;
        }
        return tmp;
    }

    public int dajUkupnuCijenuArtikala() {
        int rez = 0;
        for(int i=0; i<artikli.length; i++) {
            if(artikli[i] != null) rez+=artikli[i].getCijena();
        }
        return rez;
    }
}
