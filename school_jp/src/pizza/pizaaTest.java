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
/* 주인공을 움직여서 몬스터를 피하고 황금을 차지하는 게임이다. 화면에는 3가지
 * 의 스프라이트가 나타난다/ '@'은 주인공 캐릭터이고 'M'은 몬스터, 'G'는 황금을 나타낸다.
 * 주인공 캐릭터는 키보드의 H, J, K, L 키를 이용하여 상하좌우로 움직인다. 몬스터는 난수만큼 이동한다. 황금은 움직이지 않는다. */
