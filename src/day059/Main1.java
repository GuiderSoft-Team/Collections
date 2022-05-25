package day059;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        //ArrayList<Boolean> logic=new ArrayList<>();
        //ArrayList<Integer> numbers=new ArrayList<>(20);
        List<Integer> teksayilar=new ArrayList<>();
        teksayilar.add(1);
        teksayilar.add(3);

        List<Integer> numbers=new ArrayList<>();
        Collections.addAll(numbers,1,2,3,4,5,6,7,8,9,10);
        numbers.add(11);
        numbers.add(1,22);
        numbers.addAll(teksayilar);

        System.out.println(numbers);
    }
}
