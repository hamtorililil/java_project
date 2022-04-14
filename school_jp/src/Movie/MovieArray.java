package Movie;

public class MovieArray {
    public static void main(String[] args){
        Movie[] list = new Movie[10];
        list[0] = new Movie("아이언맨", "john" );
        list[1] = new Movie("테스트영화", "테스트감독" );

        for (int i = 0; i<Movie.cnt;i++){
            System.out.println(list[i].title);
            System.out.println(list[i].dir);

        }
    }

}
