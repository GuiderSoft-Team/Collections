package day61.maps;

import java.util.Map;
import java.util.TreeMap;

public class Main2 {
    public static void main(String[] args) {
        Map<String,String> personel=new TreeMap<>();
        personel.put("Ahmet","Pazarlama");
        personel.put("Osman","Pazarlama");
        System.out.println(personel);
    }
}
