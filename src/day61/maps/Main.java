package day61.maps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> aylar=new HashMap<>();
        aylar.put(1,"Ocak");
        aylar.put(2,"Şubat");
        aylar.put(3,"Mart");
        aylar.put(1,"Nisan");

        System.out.println(aylar);



    }
}
