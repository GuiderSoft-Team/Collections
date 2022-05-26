package day060.kafeterya;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Stok myStok=new Stok();
        Collections.addAll(myStok,Urun.stokHazirla().toArray(new Urun[0]));
        myStok.listele();
        myStok.isimSiraliListele();
        myStok.fiyataGoreListele();
        myStok.fiyataGoreTersSiraliListele();
        myStok.fiyataGoreTersveMiktaraGoreTersSiraliListele();

        List<Urun> head = myStok.head();
        head.forEach(System.out::println);
        System.out.println();

        List<Urun> head1 = myStok.head(2);
        head1.forEach(System.out::println);
        System.out.println();

        List<Urun> tail = myStok.tail();
        tail.forEach(System.out::println);
    }
}
