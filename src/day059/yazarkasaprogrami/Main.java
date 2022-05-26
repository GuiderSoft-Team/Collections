package day059.yazarkasaprogrami;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Stok stok=new Stok();


        List<Urun>urunler= Urun.stokHazirla();

        stok.listele(urunler);// normal listeleme
        System.out.println();

        stok.fiyataGoreListele(urunler);//fiyata göre listeleme
        System.out.println();

        stok.isimSiraliListele(urunler);//isim sıralı listeleme
        System.out.println();

        stok.fiyataGoreTersSiraliListele(urunler);//fiyata göre ters sıralı
        System.out.println();

        stok.fiyataGoreTersveMiktaraGoreTersSiraliListele(urunler);//fiyataGoreTersveMiktaraGoreTersSiraliListele


    }
}
