package A1405반복문과상태변수_개념연습;

import java.util.Random;

/*
[문제]
x = 5
y = 5

철수는 현재 게임을 하고 있으며, 캐릭터는 동서남북 네 방향으로 이동할 수 있습니다.
철수는 현재 위치가 x = 5, y = 5에 있습니다.
x는 좌우(동서)를, y는 상하(남북)를 뜻합니다.

1부터 4까지의 랜덤 숫자를 저장해
1이면 동쪽으로, 2면 서쪽으로, 3이면 남쪽으로, 4면 북쪽으로 1칸씩 이동합니다.
총 5번 이동한 후, 철수의 현재 위치를 출력하시오.
*/
/*
[출력예시]
5 5
4 5 2
4 4 3
3 4 2
3 5 4
4 5 1
*/
public class A1405개념연습03 {
	public static void main(String[] args) {
		 int x = 5;
		    int y = 5;
		    System.out.println(x + " " + y);
		    Random ran = new Random();
		    for(int i = 0; i < 5; i++){
		    	int r = ran.nextInt(4) + 1;
		        if(r == 1){
		            x = x + 1;
		        }else if(r == 2){
		            x = x - 1;
		        }else if(r == 3){
		            y = y - 1;
		        }else if(r == 4){
		            y = y + 1;
		        }
		        System.out.println(x + " " + y + " " + r);
		    }
	}
}
