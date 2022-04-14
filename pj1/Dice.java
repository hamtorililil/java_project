public class Dice {
    private int value;

    public Dice(){
        value=0;

    }

    public void Roll(){
        value = (int)(math.random()*6)+1;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Dice dite1, dite2;
        int rollcount;

        dite1 = new Dice();
        dite2 = new Dice();

        do{
            dice1.roll();
            dice2.roll();
            System.out.println

        }


    }

}
