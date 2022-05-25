package day059;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        //change
        List<String> animals=new ArrayList<>();
        animals.add("Kuş");
        animals.add("Fil");
        animals.add("Aslan");

        System.out.println(animals);
        animals.set(1,"Kaplan");
        System.out.println(animals);


/*              int index = -1;
        Iterator<String> iterator = animals.iterator();
        while (iterator.hasNext()){
            String item=iterator.next();
            if(item.equalsIgnoreCase("kApLaN")){
                index= animals.indexOf(item);
                break;
            }
        }*/

        for(var item:animals){
            if(item.equalsIgnoreCase("asLan")){
                animals.set(animals.indexOf(item),"Zürafa");
                break;
            }
        }

/*        System.out.println("Bulunan index : "+index);
        if (index!=-1) {
            animals.set(index, "Zürafa");
        }*/
        System.out.println(animals);
    }
}
