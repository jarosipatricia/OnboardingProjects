package AnimalExample;

import java.util.Objects;

public class Book {
    public String title;

    public Book (String title) {
        this.title = title;
    }

    @Override
    public int hashCode() {
        return title != null ? title.hashCode() : 0;
    }

    @Override
    public boolean equals(Object obj) {
        // Check if the object is compared with itself
        if (this == obj) {
            return true;
        }

        // Check if the object is null or of a different class
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Cast the object to a AnimalExample.Book and compare titles
        Book otherBook = (Book) obj;
        return Objects.equals(title, otherBook.title);
    }
}
