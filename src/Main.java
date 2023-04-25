// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Fedor", "Dostoevskiy");
        Author author2 = new Author("Alber", "Kamu");
        Book bookIdiot = new Book("Idiot", author1, 1868);
        Book bookChuma = new Book("Chuma", author2, 1947);

        bookIdiot.setYearPublication(2000);
        System.out.println("bookIdiot.getYearPublication() = " + bookIdiot.getYearPublication());
    }

}
