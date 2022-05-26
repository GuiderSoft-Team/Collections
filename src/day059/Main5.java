package day059;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main5 {
    public static void main(String[] args) {
        List<Personel> calisanlar=List.of(
                new Personel("Hakan Şükür",7000),
                new Personel("Hasan Şaş",3000),
                new Personel("İlhan Mansız",5000),
                new Personel("Ahmet Dursun",4000),
                new Personel("Seba Gitsin",8000)
        );
/*
        List<Personel> personelList=new ArrayList<>(calisanlar);

        Personel remove = personelList.remove(2);

        for(var item:personelList){
            System.out.println(item);
        }
        System.out.println();
        System.out.println(remove);*/


        //calisanlar.forEach(p-> System.out.println(p));

/*        calisanlar.forEach(p->{
            if(p.maas()>=5000) System.out.println(p);
        });*/
/*
        List<Personel> collect = calisanlar.stream()
                .filter(item -> item.maas() >= 5000)
                .sorted(Comparator.comparing(Personel::maas).reversed())
                .collect(Collectors.toList());*/
        //.forEach(item-> System.out.println(item));

        //for(var item:collect) System.out.println(item);

        //Yukarıdaki listeyi isme göre sıralı şekilde
        // ekrana yazdıran declarative kodu yazınız.

        //Maaşı 5000'den az olan personeli isim sırasına göre tersten yazdıran
        //declarative kodu yazınız.




    }
}
