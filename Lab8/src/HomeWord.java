
public class HomeWord {
    public static void main(String[] args) {
        int n = 6;
        Film [] films = new Film[n];
        Movie movie = new Movie(1,"ABC", "Hoạt hình", "A", "Ngày 11/06/2024","120 phút");
        Movie movie1 = new Movie(2,"AAA", "Lãnh mạng", "Y", "Ngày 11/06/2024","120 phút");
        Movie movie2 = new Movie(3,"ABC", "Kinh dị", "X", "Ngày 11/06/2024","120 phút");
        Serial serial = new Serial(4,"BBB", "Trinh Thám", "B", "Ngày 11/06/2024",20,"20 phút");
        Serial serial1 = new Serial(5,"CCC", "Lãnh mạng", "C", "Ngày 11/06/2024",20,"20 phút");
        Serial serial2 = new Serial(6,"DDD", "Hành động", "D", "Ngày 11/06/2024",20,"20 phút");
        films[0]= movie;
        films[1]= movie1;
        films[2]= movie2;
        films[3]= serial;
        films[4]= serial1;
        films[5]= serial2;

        for (Film film : films) {
            film.display();
            System.out.println();
        }
        searchTitle(films,"ABC");
    }
    public static void searchTitle(Film [] films, String search){
        System.out.println("Tìm phim theo tiêu đề \"" + search + "\":");
        boolean found = false;
        for (Film film : films) {
            if (film.getTitle().equalsIgnoreCase(search)){
                film.display();
                System.out.println();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy phim có tiêu đề \"" + search + "\"");
        }
    }
}
