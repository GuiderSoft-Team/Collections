package day059.task2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Personel>calisanlar=new ArrayList<>(Arrays.asList(
                new Personel("Ahmet",6000),
                new Personel("Sergen",3000),
                new Personel("Metin",4000),
                new Personel("Oktay",7000),
                new Personel("Levent",5500)

        ));

      // calisanlar.stream().sorted(Comparator.comparing(Personel::isim).reversed()).forEach(item-> System.out.println(item));

       // calisanlar.stream().filter(item -> item.maas() < 5000).sorted(Comparator.comparing(Personel::isim).reversed()).forEach(System.out::println);
        List<Personel>maas5000=new ArrayList<>();

      /*  for (int i = 0; i <calisanlar.size() ; i++) {
            if(calisanlar.get(i).maas()>5000){
                maas5000.add(calisanlar.get(i));
            }
        }


        Iterator<Personel> iterator = maas5000.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
    }
}
