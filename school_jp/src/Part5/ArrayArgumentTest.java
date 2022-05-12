package Part5;

public class ArrayArgumentTest {

    public static double minArray(double[] list){
        double min = list[0];

        for(int i = 1; i < list.length; i++){//순번대로 정리 될때까지 반복
            if (list[i] < min)
                min = list[i];
        }
        return (min);
    }
    public static void main(String args[]){
        double[] a = {1.1, 2.2, 3.3, 4.4, 0.1, 0.2};
        double[] b = {-2.0, 3.0, -9.0, 2.9, 1.5};

        double min;

        min = minArray(a);// a값 넣기;
        System.out.println("첫 번째 배열의 최소값 = "+ min);// 출력
        min = minArray(b);// b값 넣기
        System.out.println("두 번째 배열의 최소값 = "+ min);// 출력
    }
}
