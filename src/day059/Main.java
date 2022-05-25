package day059;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Iterable<String> list1=List.of("A","B","C","D");

        Collection<String> list2=new ArrayList<>();
        list2.add("A");
        list2.add("B");


        List<String> list3=new ArrayList<>();
        list3.addAll(list2);

        list3.add(1,"C");

        ArrayList<String> list4=new ArrayList<>(list3);

        for(var item:list4){
            System.out.print(item+" ");
        }
    }
}
