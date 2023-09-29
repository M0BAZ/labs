package Lab2_7;

public class BookTest {
    public static void main(String[] args) {
        BookShelf bookshelf = new BookShelf(5);

        Book book1 = new Book("Название 1", "Автор 1", 2000);
        Book book2 = new Book("Название 2", "Автор 2", 1995);
        Book book3 = new Book("Название 3", "Автор 3", 2010);

        bookshelf.addBook(book1);
        bookshelf.addBook(book2);
        bookshelf.addBook(book3);

        bookshelf.displayBooks();

        Book earliestBook = bookshelf.getEarliestBook();
        if (earliestBook != null) {
            System.out.println("\nСамая ранняя книга: " + earliestBook);
        } else {
            System.out.println("\nКнижная полка пуста.");
        }

        Book latestBook = bookshelf.getLatestBook();
        if (latestBook != null) {
            System.out.println("Самая поздняя книга: " + latestBook);
        } else {
            System.out.println("Книжная полка пуста.");
        }

        bookshelf.sortBooksByPublicationYear();
        System.out.println("\nКниги на книжной полке после сортировки по году выпуска:");
        bookshelf.displayBooks();
    }

}
