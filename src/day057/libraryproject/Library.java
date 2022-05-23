package day057.libraryproject;

import java.util.Iterator;


public class Library implements Iterable<Book> {
    private Book[] books;
    private int count;

    public Library(int capacity) {
        books=new Book[capacity];
    }



    public Library() {
        this(10);
    }

    public int capacity(){
        return books.length;
    }

    public int size(){
        return count;
    }

    public void add(Book book){
        books[count++]=book;
        if(count== capacity()/2){
            doubleSize();
        }
    }

    private void doubleSize() {
        Book[] tmp=new Book[size()];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i]=books[i];
        }
        books=new Book[capacity()*2];
        for (int i = 0; i < tmp.length; i++) {
            books[i]=tmp[i];
        }
    }

    public Book get(int index){
        return books[index];
    }


    @Override
    public Iterator<Book> iterator() {
        return new BookIterator(this);
    }

    private class BookIterator implements Iterator<Book> {
        private Library library;
        private int index;

        public BookIterator(Library library) {
            this.library = library;
        }


        @Override
        public boolean hasNext() {
            return (index<library.count);
        }

        @Override
        public Book next() {
            return library.books[index++];
        }
    }
}
