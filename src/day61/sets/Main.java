package day61.sets;

import java.text.Collator;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> kume=new HashSet<>();
        kume.add("Hatice");
        kume.add("Cengiz");
        kume.add("Sabit");
        kume.add("Hasan");
        kume.add("Ali Cengiz");
        kume.add("Çağrı");
        kume.add("Ömer");
        kume.add("Şakir");

       System.out.println("HS : "+kume);
       /*
        Iterator<String> iterator = kume.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/

        for(var item:kume){
            System.out.println(item);
        }



        Set<String> isimler=new TreeSet<>(
                Collator.getInstance(new Locale("tr","TR"))
        );
        isimler.addAll(kume);
        System.out.println("TS: "+isimler);
    }
}
