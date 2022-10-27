import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author author;
    private int yearPublication;

    public Book(String bookName, Author author, int yearPublication) {
        this.bookName = bookName;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getBookName () {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setYearPublication(int yearPublication) {

        this.yearPublication = yearPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(bookName, book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, yearPublication);
    }

    @Override
    public String toString() {
        return "Автор- " + author + "  Название- " + bookName + "  Год издания- " + yearPublication;
    }
}
