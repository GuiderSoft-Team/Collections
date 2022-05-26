package day060.kafeterya;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stok extends ArrayList<Urun> {
    private static final Collator DIL_TR=Collator.getInstance(new Locale("tr","TR"));
    public void listele(){
        //imperative
/*        for (int i = 0; i < size(); i++) {
            System.out.println(get(i));
        }*/

        stream().forEach(System.out::println);
        System.out.println();
    }

    public void isimSiraliListele(){
        //Stream döndüren ara metotlara intermediate operators
        //long, List, Type döndüren metotlara ise terminate operators
        stream()
                .sorted(Comparator.comparing(Urun::adi,DIL_TR))
                .forEach(System.out::println);
        System.out.println();
    }


    public void fiyataGoreListele(){
        Stream<Urun> stream = this.stream();
        stream.sorted(Comparator.comparing(Urun::fiyat))
                .forEach(System.out::println);
        System.out.println();
    }

    public void fiyataGoreTersSiraliListele(){
        stream()
                .sorted(Comparator.comparing(Urun::fiyat).reversed())
                .forEach(System.out::println);
        System.out.println();

    }

    public void fiyataGoreTersveMiktaraGoreTersSiraliListele(){
        stream()
                .sorted(
                        Comparator
                                .comparing(Urun::fiyat)
                                .reversed()
                                .thenComparing(
                                        Comparator
                                                .comparing(Urun::miktar)
                                                .reversed()
                                )
                )
                .forEach(System.out::println);
        System.out.println();
    }

    public List<Urun> head(int quantity){
        return stream()
                .limit(quantity)
                .collect(Collectors.toList());
    }

    public List<Urun> head(){
        return head(5);
    }

    public List<Urun> tail(int quantity){
        quantity=quantity<size()?quantity:size();
        return stream()
                .skip(size()-quantity).collect(Collectors.toList());
    }

    public List<Urun> tail(){
        return tail(5);
    }
}
