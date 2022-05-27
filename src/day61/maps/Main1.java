package day61.maps;

import java.util.Map;
import java.util.TreeMap;

public class Main1 {
    public static void main(String[] args) {
        Map<Integer,String> bolumler=new TreeMap<>();
        bolumler.put(1,"Muhasebe");
        bolumler.put(2,"Pazarlama");
        bolumler.put(3,"Bilgi İşlem");

        System.out.println(bolumler);
    }
}
