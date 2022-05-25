package day059;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        Collections.addAll(numbers,1,2,3,4,5,6,7,8,9,10);

        //imperative and declarative


        //imperativ

        List<Integer> oddNumbers=new ArrayList<>();
        List<Integer> evenNumbers=new ArrayList<>();

        for(var item:numbers){
            boolean b = item % 2 == 0 ? evenNumbers.add(item) : oddNumbers.add(item);
        }

        for(var item:numbers){
            System.out.print(item+" ");
        }

        System.out.println();

        Iterator<Integer> iterator = oddNumbers.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }

        System.out.println();

        System.out.println(evenNumbers);

    }
}
