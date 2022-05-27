package day059.yazarkasaprogrami;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Stok extends ArrayList<Urun> {

    public void listele(List<Urun>urunler){

        System.out.println("-".repeat(5)+"Ürün Listesi"+"-".repeat(5));
        urunler.stream().forEach(item-> System.out.println(item));
    }

    public void isimSiraliListele(List<Urun>urunler){
        System.out.println("-".repeat(5)+"İsim Sıralı Liste"+"-".repeat(5));
      urunler.stream().sorted(Comparator.comparing(Urun::adi)).forEach(System.out::println);
    }
    public void fiyataGoreListele(List<Urun>urunler){
        System.out.println("-".repeat(5)+"Fiyat Sıralı Liste"+"-".repeat(5));
        urunler.stream().sorted(Comparator.comparing(Urun::fiyat)).forEach(item-> System.out.println(item));
    }

    public void fiyataGoreTersSiraliListele(List<Urun>urunler){
        System.out.println("-".repeat(5)+"Fiyata Göre Ters Sıralı Liste"+"-".repeat(5));
        urunler.stream().sorted(Comparator.comparing(Urun::fiyat).reversed()).forEach(System.out::println);

    }

    public void fiyataGoreTersveMiktaraGoreTersSiraliListele(List<Urun>urunler){
        System.out.println("-".repeat(5)+"Fiyata Gore Ters ve Miktara Gore Ters Sirali Liste"+"-".repeat(5));
        urunler.stream().sorted(Comparator.comparing(Urun::fiyat).thenComparing(Urun::miktar).reversed())
                .forEach(System.out::println);
    }
}
