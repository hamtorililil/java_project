package 도서관;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

class book{
    String title;
    int score;

    public book(String title){
        this.title = title;
    }

    public String setTitle(String title){
        return title;
        
    }
    
    public String getTitle(){
        return title;
    }
    public  int getScore(){
        return score;
    }
    public void setScore(int score){
        this.score = score;
    }
    static int count;
    @Override
    
    public String toString(){
        return "book"+"title"+"score";
    }
    public book(String title, int score){
        this.title=title;
        this.score=score;
        count++;
    }
    
}
    


public class bookTest {
    public static void main(String[] args){
        ArrayList<book> list= new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====================");
        System.out.println("1. 책 등록");
        System.out.println("2. 책 검색");
        System.out.println("3. 모든 책 출력");
        System.out.println("4. 종료");
        System.out.println("=====================");
        System.out.println("메뉴를 선택하세요:");
        int scar = scanner.nextInt();
        scanner.nextLine();
        
        switch (scar){
            case 1:
                String title = scanner.nextLine();
                int score = scanner.nextInt();
                list.add(new book(title, score));
            case 2:
                String title2 = scanner.nextLine();
                for(book e ; list){
                    if(e.getTitle().equals(title2)){
                        System.out.println(e);
                    }
                }
            case 3:
                
            case 4:    
                
        }
    }
}
