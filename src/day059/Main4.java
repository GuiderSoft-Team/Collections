package day059;

import java.util.ArrayList;
import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        //remove
        Book book5=new Book("Python","Anonim",200);
        List<Book> books=new ArrayList<>();
        books.add(new Book("Java 5","Herbert Schildt",500));
        books.add(book5);
        books.add(new Book("Kaşağı","Ömer Seyfettin",300));
        books.add(new Book("Sefiller","Victor Hugo",700));

        for(var item:books) System.out.println(item);

        books.remove(2);
        System.out.println();
        for(var item:books) System.out.println(item);

        System.out.println();

        books.remove(book5);

        for(var item:books) System.out.println(item);


        System.out.println();

        books.remove(new Book("Sefiller","Victor Hugo",700));

        for(var item:books) System.out.println(item);

    }
}

record Book(String name, String author, int page){}


