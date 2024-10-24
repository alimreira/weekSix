package fieldInjection;

import org.springframework.stereotype.Component;

@Component
public class Book {

    private String title;
    private String author;

    // Default Constructor
    public Book() {
        this.title = "Another Day";
        this.author = "Odun Ifa";
    }

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}