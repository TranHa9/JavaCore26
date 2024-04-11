import java.time.LocalDate;
import java.util.Arrays;

public class Book {
//    Tạo class Book gồm các thông tin sau:
//
//    Mã sách id
//    Tên sách title
//    Tác giả author
//    Thể loại category
//    Nhà xuất bản publisher
//    Năm xuất bản year
//    Viết chương trình quản lý sách thực hiện các công việc sau:
//
//    Tạo mảng để quản lý sách
//    Tìm sách theo tên
//    Tìm sách theo thể loại
//    Liệt kê các sách xuất bản trong năm nay
    int id;
    String title;
    String author;
    String category;
    String publisher;
    int year;
    public  Book(){}
    public Book(int id, String title, String author, String category, String publisher, int year){
        this.id = id;
        this.title = title;
        this.author = author;
        this.category = category;
        this.publisher = publisher;
        this.year = year;
    }
    public static Book [] books = new Book[100];
    public static int count = 0;
    public void addBook(Book book){
        if (count < books.length) {
            books[count] = book;
            count++;
            System.out.println("Đã thêm sách mới");
        } else {
            System.out.println("Mảng sách đã đầy, không thể thêm sách mới.");
        }
    }
    public static void insertBooks() {
        System.out.println("Danh sách các sách:");
        for (int i = 0; i < count; i++) {
            fomat(books[i]);
        }
    }
    public static void fomat(Book book){
        System.out.println("Sách: " + book.id);
        System.out.println("Mã: " + book.id);
        System.out.println("Tên sách: " + book.title);
        System.out.println("Tác giả: " + book.author);
        System.out.println("Thể loại: " + book.category);
        System.out.println("Nhà xuất bản: " + book.publisher);
        System.out.println("Năm: " + book.year);
        System.out.println();
    }

    public static void findNameBook(String name){
        boolean isCheck = false;
        for(int i= 0; i < count ;i++){
            if(books[i].title.equalsIgnoreCase(name)){
                System.out.println("Sách tìm được là: ");
                fomat(books[i]);
                isCheck = true;
            }
        }
        if(!isCheck){
            System.out.println("Không tìm thấy sách phù hợp");
        }
    }
    public static void findCategoryBook(String category){
        boolean isCheck = false;
        for(int i= 0; i < count ;i++){
            if(books[i].category.equalsIgnoreCase(category)){
                System.out.println("Sách tìm được là: ");
                fomat(books[i]);
                isCheck = true;
            }
        }
        if(!isCheck){
            System.out.println("Không tìm thấy sách phù hợp");
        }
    }

    public static void NXBThisYear(){
        int currentYear = LocalDate.now().getYear();
        boolean isCheck = false;
        System.out.println("Những sách xuất bản trong năm nay là: ");
        for(int i= 0; i < count ;i++){
            if(books[i].year == currentYear){
                fomat(books[i]);
                isCheck = true;
            }
        }
        if(!isCheck){
            System.out.println("Không tìm thấy sách phù hợp");
        }
    }
}
