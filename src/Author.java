import java.util.Objects;

public class Author {
    private String authorName;
    private String authorSename;

    public Author(String authorName, String authorSename) {
        this.authorName = authorName;
        this.authorSename = authorSename;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorSename() {
        return authorSename;
    }

    public void setAuthorSename(String authorSename) {
        this.authorSename = authorSename;
    }

    @Override
    public String toString() {
        return authorName + " " + authorSename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorName.equals(author.authorName) && authorSename.equals(author.authorSename);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorSename);
    }
}
