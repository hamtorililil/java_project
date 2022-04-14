public class Array_max_min {

    public static double minArray(double[] list){
        double min = list[0];

        for(int i = 1; i< list.length; i++) {
            if (list[i] < min)
                min = list[i];
        }return (min);
    }
    public static double maxArray(double[] list){
        double max = list[0];

        for(int i = 1; i < list.length; i++) {
            if (list[i] > max)
                max = list[i];
        }return (max);
    }


    public static void main(String[] args){
        double[] a = {0.1, 0.5, 1.0, 3.0, 1.1};
        double[] b = {0.8, 0.48, 0.99, 3.1, 1.5};

        double min;
        double max;

        min= minArray(a);
        System.out.println(min);
        min=minArray(b);
        System.out.println(min);

        max= maxArray(a);
        System.out.println(max);
        max= maxArray(b);
        System.out.println(max);
    }
}

