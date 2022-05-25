package day058.showroomproject;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Showroom showroom=new Showroom();
        showroom.add(new Car(1,"Car 1"));
        showroom.add(new Car(2,"Car 2"));
        showroom.add(new Car(3,"Car 3"));
        System.out.println("Size : "+showroom.size());
       for(var item:showroom){
            System.out.println(item);
        }


       showroom.remove(new Car(2,"Car 2"));
        System.out.println();
        System.out.println("Size : "+showroom.size());

        for (int i = 0; i < showroom.size(); i++) {
            System.out.println(showroom.get(i));
        }


        System.out.println();
        Iterator<Car> iterator = showroom.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();

//        showroom.forEach(item-> System.out.println(item));
//        System.out.println();
        showroom.forEach(System.out::println);


    }
}
