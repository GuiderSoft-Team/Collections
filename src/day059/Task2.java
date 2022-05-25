package day059;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Personel> calisanlar=List.of(
                new Personel("Hakan Şükür",7000),
                new Personel("Hasan Şaş",3000),
                new Personel("İlhan Mansız",5000),
                new Personel("Ahmet Dursun",4000),
                new Personel("Seba Gitsin",8000)
        );

        List<Personel> maas5000=new ArrayList<>();

        for (int i = 0; i < calisanlar.size(); i++) {
            Personel personel=calisanlar.get(i);
            if(personel.maas()>=5000){
                maas5000.add(personel);
            }
        }

        Iterator<Personel> iterator = maas5000.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}

record Personel(String isim, double maas){}

