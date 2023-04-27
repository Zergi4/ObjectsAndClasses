import java.util.Objects;

public class Book {
    // создали новый класс Book (Книга)
    private String title; // обьявили свойоство название книги
    private Author author; // обьявили свойство Автора книги
    private int yearPublication; // обьявили свойство года публикации книги

    public Book(String title, Author author, int yearPublication) {
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearPublication);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + "'" +
                ", author=" + author.getName() + " " + author.getSurname() +
                ", yearPublication=" + yearPublication +
                '}';
    }
}
