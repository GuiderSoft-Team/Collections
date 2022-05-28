package day61.lists;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main2 {
    public static void main(String[] args) {
        List<String> ulkeler= Arrays.asList("Türkiye","Çin","Amerika","İngiltere");
        System.out.println("Orijinal : "+ulkeler);
        ulkeler.sort(Collator.getInstance(new Locale("tr","TR")));
        System.out.println("Sıralı : "+ulkeler);
    }
}
