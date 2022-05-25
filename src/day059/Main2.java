package day059;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        //get() metodu
        List<Integer> numbers=new ArrayList<>();
        Collections.addAll(numbers,1,2,3,4,5,5,6,7,8,9,10);

        Integer integer = numbers.get(5);
        System.out.println("5. index = "+integer);


        //Iterator
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println();
        //Equality
        System.out.println(numbers.get(4)==numbers.get(5));
    }
}
