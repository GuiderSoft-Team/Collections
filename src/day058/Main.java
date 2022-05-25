package day058;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //ArrayList
        //Arraylis Creation
        ArrayList list=new ArrayList();
        list.add("Osman");
        String isim = (String) list.get(0);
        System.out.println(isim);


        /* Generic kullanım
            ArrayList<Type> list=new ArrayList<>();
         */

        ArrayList<String> kisiler=new ArrayList<>();
        kisiler.add("Ayşe");
        kisiler.add("Fatih");

        String kisi = kisiler.get(1);
        System.out.println(kisi);

/*        İlkel tiplerin kullanımı
        Integer
        Double
        Float
        Long
        Short
        Byte
        Boolean
        Character*/

        ArrayList<Integer> sayilar=new ArrayList<>();
        sayilar.add(5);
        sayilar.add(7);



    }
}
