public class Movie extends Film{
    private String time;

    public Movie(){}

    public Movie(String time) {
        this.time = time;
    }

    public Movie(int id, String title, String category, String director, String date, String time) {
        super(id, title, category, director, date);
        this.time = time;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void display() {
        super.display();
        System.out.println("Thời lượng: " + time);
    }
}
