package fieldInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Library {

    // Field Injection
    @Autowired
    private Book book;

    // Getters and Setters for Book
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Library{" +
                "book=" + book +
                '}';
    }
}
