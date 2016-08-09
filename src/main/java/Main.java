import com.thoughtworks.bhamani.biblioteca.Biblioteca;
import com.thoughtworks.bhamani.biblioteca.Book;

import java.io.PrintStream;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> initialLibrary = new ArrayList<>();
        PrintStream printStream = System.out;
        initialLibrary.add(new Book("Harry Potter 1", "JK Rowling", "1997", printStream));
        initialLibrary.add(new Book("Harry Potter And The Really Really Really Long Title", "JK Rowling", "1997", printStream));
        Biblioteca biblioteca = new Biblioteca(printStream, initialLibrary);
        biblioteca.start();
    }

}
