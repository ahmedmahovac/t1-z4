package ba.unsa.etf.rpr;

public class Supermarket {
   private  Artikl[] artikli;

    public Supermarket() {

        artikli = new Artikl[1000]; // inic na null

    }


    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod) {
        Artikl tmp = null;
        for(int i=0; i<artikli.length; i++) if(artikli[i] != null && artikli[i].getKod().equals(kod)) {
            tmp = artikli[i];
            artikli[i] = null;
        }
        return tmp;
    }

    public void dodajArtikl(Artikl x) {
        for(int i=0; i<artikli.length; i++) {
            if(artikli[i] == null)  {
                artikli[i] = x;
               return;
            }
        }
    }

}
