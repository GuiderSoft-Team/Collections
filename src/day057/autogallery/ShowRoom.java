package day057.autogallery;


import day057.libraryproject.Book;

import java.util.Iterator;

public class ShowRoom implements Iterable<Car>{
    private Car[]cars;
    private int count;

    public ShowRoom(int capacity){
        cars=new Car[capacity];
    }
    public ShowRoom(){
        this(10);
    }


    public int capacity(){
        return cars.length;
    }

    public int size(){
        return count;
    }

    public void add(Car car){
        cars[count++]=car;
        if(count== capacity()/2){
            doubleSize();
        }
    }

    private void doubleSize() {
        Car[] tmp=new Car[size()];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i]=cars[i];
        }
        cars=new Car[capacity()*2];
        for (int i = 0; i < tmp.length; i++) {
            cars[i]=tmp[i];
        }
    }

    public Car get(int index){
        return cars[index];
    }

    private class CarIterator implements Iterator<Car>{

        private ShowRoom showRoom;
        private int index;


        public CarIterator(ShowRoom showRoom){
            this.showRoom=showRoom;
        }

        @Override
        public boolean hasNext() {
            return (index<showRoom.count);
        }

        @Override
        public Car next() {
            return showRoom.cars[index++];
        }
    }


    @Override
    public Iterator<Car> iterator() {
        return new CarIterator(this);
    }
}
