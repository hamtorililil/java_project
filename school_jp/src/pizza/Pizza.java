package pizza;

public class Pizza {
    private String topping;
    private int rad;
    static final double PI = 3.14;
    static int count=0;

    public Pizza(String topping){
        this.topping = topping;
        count++;
    }
}
