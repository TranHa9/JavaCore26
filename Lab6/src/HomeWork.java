public class HomeWork {
    public static void main(String[] args) {
        Book book = new Book(1,"Sách A","A","Trinh thám","A",1999);
        Book book3 = new Book(4,"Sách D","D","Hành động","D",2024);
        Book book1 = new Book(2,"Sách B","B","Tình cảm","B",1999);
        Book book2 = new Book(3,"Sách C","C","Hài","C",2024);
        book.addBook(book);
        book3.addBook(book3);
        book1.addBook(book1);
        book2.addBook(book2);
        Book.insertBooks();
        Book.findNameBook("Sách A");
        Book.findCategoryBook("Trinh thám");
        Book.NXBThisYear();
    }
}
