public class Main {
    public static void main(String[] args) {
        Author firstAuthor = new Author("Jerome David", "Sellinger");
        Author secondAuthor = new Author("Kurt Jr. ", "Vonnegut");
        Book firstBook = new Book("The Catcher in the Rye", firstAuthor ,1968);
        Book  secondBook = new Book("Galapagos", secondAuthor, 1985);
        System.out.println(firstBook);
        System.out.println(secondBook);

    }
}
//Домашка полностью идентична предыдущей, в видеоразборе они были объединены. Поэтому, не зная условий текущего задания,
//текущего задания, были сделаны совместно.