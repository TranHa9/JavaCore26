public class Film {
    private int id;
    private String title;
    private String category;
    private String director;
    private String date;

    public  Film(){}

    public Film(int id, String title, String category, String director, String date) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.director = director;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void display() {
        System.out.println("Mã: " + id);
        System.out.println("Tiêu đề: " + title);
        System.out.println("Thể loại: " + category);
        System.out.println("Đạo diễn: " + director);
        System.out.println("Ngày công chiếu: " + date);
    }
}
