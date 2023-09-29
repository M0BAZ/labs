package Lab2_7;

import java.util.Arrays;
import java.util.Comparator;

public class BookShelf {
    private Book[] books;
    private int bookCount;

    public BookShelf(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Книжная полка полна. Невозможно добавить больше книг.");
        }
    }

    public Book getEarliestBook() {
        if (bookCount == 0) {
            return null;
        }

        Book earliestBook = books[0];

        for (int i = 1; i < bookCount; i++) {
            if (books[i].getPublicationYear() < earliestBook.getPublicationYear()) {
                earliestBook = books[i];
            }
        }

        return earliestBook;
    }

    public Book getLatestBook() {
        if (bookCount == 0) {
            return null;
        }

        Book latestBook = books[0];

        for (int i = 1; i < bookCount; i++) {
            if (books[i].getPublicationYear() > latestBook.getPublicationYear()) {
                latestBook = books[i];
            }
        }

        return latestBook;
    }

    public void sortBooksByPublicationYear() {
        Arrays.sort(books, 0, bookCount, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return Integer.compare(book1.getPublicationYear(), book2.getPublicationYear());
            }
        });
    }

    public void displayBooks() {
        System.out.println("Книги на книжной полке:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println(books[i]);
        }
    }
}
