package day058.showroomproject;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Showroom implements Iterable<Car> {
    private static final int DEFAULT_CAPACITY=10;
    private Car[] cars;
    private int count;

    public Showroom(int capacity) {
        cars=new Car[capacity];
    }

    public Showroom() {
        this(DEFAULT_CAPACITY);
    }

    public int capacity(){
        return cars.length;
    }

    public int size(){
        return count;
    }

    public void add(Car car){
        cars[count++]=car;
        if(size()==capacity()/2+1){
            Car[] tmp=new Car[size()];
            for (int i = 0; i < tmp.length; i++) {
                tmp[i]=cars[i];
            }
            cars=new Car[capacity()*2];
            for (int i = 0; i < tmp.length; i++) {
                cars[i]=tmp[i];
            }
        }
    }



    public void clear(){
        cars=new Car[DEFAULT_CAPACITY];
        count=0;
    }

    public boolean remove(Car car){
        int index=-1;
        for (int i = 0; i < size(); i++) {
            if (car.equals(cars[i])){
                index=i;
                break;
            }
        }
        return remove(index);
    }

    public boolean remove(int index){
        boolean result= false;
        //cars[index]=null;
        if(index>=0&&index<size()) {
            for (int i = index + 1; i < size(); i++) {
                cars[i - 1] = cars[i];
            }
            cars[--count] = null;
            result=true;
        }
        return result;
    }

    public Car get(int index){
        Objects.checkIndex(index, count);
        return cars[index];
    }


    @Override
    public Iterator<Car> iterator() {
        return new CarIterator();
    }

    private class CarIterator implements Iterator<Car>{
        private int index;

        @Override
        public boolean hasNext() {
            return (index<count);
        }

        //   0      1      2      3
        //[Car 1, Car 2, Car 3]
        //                       ^
        @Override
        public Car next() {
            return cars[index++];
        }


    }
}
