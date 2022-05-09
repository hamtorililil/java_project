package 제4장클래스와객체1;

class SafeArray {
    private int a[];
    public int length;

    public SafeArray(int size){
        a=new int[size];
        length = size;
    }
    public  int get(int index){
        if(index >= 0 && index < length){
            return a[index];
        }
        return -1;
    }

    public void put(int index, int value){//설정자에서 잘못된 인덱스 번호를 차단할 수 있음
        if (index >= 0 && index < length){
            a[index] = value;
        }else
            System.out.println("잘못된 인덱스 " + index);//출력
    }
}
public class SafeArrayTest {
    public static void main(String[] args) {
        SafeArray array = new SafeArray(3);

        for (int i=0; i<( array.length +1); i++){
            array.put(i,i *10);
        }
    }
}
