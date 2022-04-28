package 제4장클래스와객체1;

public class mymath {
    // 매개 변수만 다르면 메소드 이름은 같아도 된다. 이것을 메소드 중복정의 라고함
    int add(int x, int y)                {   return x+y; }  // x와 y값을 더하여 리턴한다.
    int add(int x, int y, int z)         {   return x+y+z;} // x,y,z값을 더하여 리턴한다.
    int add(int x, int y, int z, int w)  {   return x+y+z+w;} // x,y,z,w값을 더하여 리턴한다.

    public static void main(String[] args) {
        mymath obj;
        obj = new mymath();
        System.out.print(obj.add(10,20)+" ");//출력
        System.out.print(obj.add(10,20, 30)+" ");//출력
        System.out.print(obj.add(10,20, 30, 40)+" ");//출력
    }

}
