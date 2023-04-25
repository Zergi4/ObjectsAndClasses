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
}
