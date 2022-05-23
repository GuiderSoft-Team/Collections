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

    public void add(Book book){
        books[count++]=book;
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
