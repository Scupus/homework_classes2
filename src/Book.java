import javax.xml.namespace.QName;
import java.util.Objects;

public class Book {
    private String bookName;
    private final Author author;
    private int bookYear;

    public Book(String bookName, Author author, int bookYear) {
        this.bookName = bookName;
        this.author = author;
        this.bookYear = bookYear;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getBookYear() {
        return bookYear;
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    @Override
    public String toString() {
        return "Название книги: " + bookName + ", автор: " + author + ", год издания: "+ bookYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookYear == book.bookYear && bookName.equals(book.bookName) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, bookYear);
    }
}
