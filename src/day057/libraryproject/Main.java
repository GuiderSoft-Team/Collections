package day057.libraryproject;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Library library=new Library(6);
        //library.books[0]=new Book(1,"Kitap 1");
        //library.books[1]=new Book(2,"Kitap 2");

        library.add(new Book(1,"Kitap 1"));
        library.add(new Book(2,"Kitap 2"));
        library.add(new Book(2,"Kitap 2"));
        library.add(new Book(2,"Kitap 2"));
        library.add(new Book(2,"Kitap 2"));
        library.add(new Book(2,"Kitap 2"));



        System.out.println("Size : "+library.size());
        System.out.println("Capacity : "+library.capacity());


        Iterator<Book> iterator = library.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


/*        for(var item:library){
            System.out.println(item);
        }*/
    }
}
