package com.example.lld1_apr_2026.class_basics.lab_book;

public class LibraryDemo {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Clean Code";
        book.author = "Robert C. Martin";
        book.isbn = "978-6482682648246";
        book.price = 599.0;
        book.numberOfPages = 464;
        book.isAvailable = true;

        Book book1 = new Book();
        book1.title = "The Pragmatic Programmer";
        book1.author = "Davud Thomas";
        book1.isbn = "978-6482684342648246";
        book1.price = 800.0;
        book1.numberOfPages = 350;
        book1.isAvailable = true;

        book.displayInfo();
        book.borrow();
        book.returnBook();
        book.borrow();
        book.borrow();

        // If I have to create 100 books -> 700 lines of code

    }
}
