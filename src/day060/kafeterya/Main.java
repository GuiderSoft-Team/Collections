package day060.kafeterya;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Stok myStok=new Stok();
        Collections.addAll(myStok,Urun.stokHazirla().toArray(new Urun[0]));
        myStok.listele();
        myStok.isimSiraliListele();
        myStok.fiyataGoreListele();
        myStok.fiyataGoreTersSiraliListele();
        myStok.fiyataGoreTersveMiktaraGoreTersSiraliListele();
    }
}
