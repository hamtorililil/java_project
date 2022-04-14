package pizza;

public class pizaaTest {
    public static  void main(String[] args){
        Pizza pz = new Pizza( "A");
        Pizza pz1 = new Pizza("B");
        Pizza pz2 = new Pizza( "C");

        int count = Pizza.count;
        System.out.println(count);
    }

}
