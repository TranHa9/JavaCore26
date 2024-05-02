public class Serial extends Film{
    private int numberOfEpisodes;
    private String averageDuration;

    public Serial(){}

    public Serial(int numberOfEpisodes, String averageDuration) {
        this.numberOfEpisodes = numberOfEpisodes;
        this.averageDuration = averageDuration;
    }

    public Serial(int id, String title, String category, String director, String date, int numberOfEpisodes, String averageDuration) {
        super(id, title, category, director, date);
        this.numberOfEpisodes = numberOfEpisodes;
        this.averageDuration = averageDuration;
    }

    public int getNumberOfEpisodes() {
        return numberOfEpisodes;
    }

    public void setNumberOfEpisodes(int numberOfEpisodes) {
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public String getAverageDuration() {
        return averageDuration;
    }

    public void setAverageDuration(String averageDuration) {
        this.averageDuration = averageDuration;
    }
    public void display() {
       super.display();
        System.out.println("Số tập: " + numberOfEpisodes);
        System.out.println("Thời lượng trung bình: " + averageDuration );
    }
}
