package day61.maps;

import java.text.Collator;
import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Map<String,Integer> aylar=new TreeMap<>(Collator.getInstance());
        aylar.put("Ocak",31);
        aylar.put("Şubat",28);
        aylar.put("Mart",31);
        aylar.put("Nisan",30);
        aylar.put("Mayıs",31);
        aylar.put("Haziran",30);
        aylar.put("Temmuz",31);
        aylar.put("Ağustos",31);
        aylar.put("Eylül",30);
        aylar.put("Ekim",31);
        aylar.put("Kasım",30);
        aylar.put("Aralık",31);

        Set<String> ayIsimleri = aylar.keySet();
        ayIsimleri.forEach(System.out::println);
        System.out.println();
        Collection<Integer> values = aylar.values();
        values.forEach(System.out::println);

        System.out.println();
        Set<Map.Entry<String, Integer>> entries = aylar.entrySet();
        entries.forEach(System.out::println);

        System.out.println();
        entries.forEach(item-> System.out.println(item.getKey()));

    }
}
