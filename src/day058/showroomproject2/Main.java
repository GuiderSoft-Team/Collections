package day058.showroomproject2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> showroom=new Showroom();
        showroom.add(new Car(1,"Car 1"));
        showroom.add(new Car(2,"Car 2"));
        showroom.add(new Car(3,"Car 3"));
        showroom.add(new Car(4,"Car 4"));

        showroom.add(1,new Car(5,"Car 5"));


        for(var item:showroom){
            System.out.println(item);
        }
        System.out.println();
        System.out.println(showroom.get(1));
    }
}
