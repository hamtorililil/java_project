package 제5장클래스와객체2;

import java.util.Scanner;

class Movie{
    String title, director;
    static int count;
    public Movie(String title, String director){
        this.title=title;//this
        this.director=director;
        count++;
    }
}

public class MovieArrayTest {
    public static void main(String[] args) {
        Scanner SCANNER = new Scanner(System.in);

        Movie [] list=new Movie[10];
        list[0] = new Movie("벡투더퓨쳐","로버트 저메키스");//리스트에 영화,감독 넣기
        list[1] = new Movie("티파니에서 아침을", "에드워드 블레이크");

        for (int i=0; i< Movie.count; i++){//추울력
            System.out.println("===================");
            System.out.println("제목: "+list[i].title);
            System.out.println("감독: "+list[i].director);
            System.out.println("===================");
        }
    }
}
