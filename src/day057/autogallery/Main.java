package day057.autogallery;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        ShowRoom showRoom=new ShowRoom(12);



        showRoom.add(new Car(1,"Volkswagen Passat "));
        showRoom.add(new Car(2,"Mercedes AMG"));
        showRoom.add(new Car(3,"Audi A8"));
        showRoom.add(new Car(4,"Volkswagen Golf "));
        showRoom.add(new Car(5,"Mercedes s340"));
        showRoom.add(new Car(6,"Audi A7"));


        System.out.println("Size : "+showRoom.size());   //size sorunsuz calısıyor
        System.out.println("Capacity : "+showRoom.capacity());//capacity sorunsuz calısıyor


        Iterator<Car> iterator = showRoom.iterator(); //ıterator sorunsuz calısıyor

       // hasnext ve  next sorunsuz calısıyor
       /* while (iterator.hasNext()){

            System.out.println(iterator.next());
        }*/

      //  System.out.println(showRoom.get(2)); //get metodu da sorunsuz calısıyor

        /*for (var item:showRoom){    //foreach sorunsuz calısıyor
            System.out.println(item);
        }*/


    }
}
