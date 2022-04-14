package Movie;

public class Movie {
    String title, dir ;
    static int cnt;

    public Movie(String title, String dir) {
        this.title = title;
        this.dir = dir;
        cnt++;
    }
}

