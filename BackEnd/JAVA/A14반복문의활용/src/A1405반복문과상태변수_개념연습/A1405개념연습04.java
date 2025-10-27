package A1405반복문과상태변수_개념연습;

import java.util.Random;

/*
[문제]
x = 5
y = 5

철수는 현재 게임을 하고 있으며, 캐릭터는 동서남북 네 방향으로 이동할 수 있습니다.
철수는 현재 위치가 x = 5, y = 5에 있습니다.
x는 좌우(동서)를, y는 상하(남북)를 뜻합니다.

1부터 4까지의 랜덤 숫자를 dir에 저장하고,
1부터 10까지의 랜덤 숫자를 speed에 저장합니다.
dir이 1이면 동쪽으로, 2면 서쪽으로, 3이면 남쪽으로, 4면 북쪽으로 speed만큼 이동합니다.
총 5번 이동한 후, 철수의 현재 위치를 출력하시오.
출력순서는 x, y, dir, speed 로 출력한다. 
 */
 /*
[출력예시]
5 5
5 9 4 4
5 0 3 9
5 -1 3 1
5 -10 3 9
5 -18 3 8
 */
public class A1405개념연습04 {
	public static void main(String[] args) {
		 int x = 5;
		   int y = 5;
		   System.out.println(x + " " + y);
		   Random ran = new Random();
		   for(int i = 0; i < 5; i++){
			   int dir = ran.nextInt(4) + 1;
			   int speed = ran.nextInt(10) + 1;
		        
		        if(dir == 1){
		            x = x + speed;
		        }else if(dir == 2){
		            x = x - speed;
		        }else if(dir == 3){
		            y = y - speed;
		        }else if(dir == 4){
		            y = y + speed;
		        }
		        System.out.println(x + " " + y + " " + dir + " " + speed);
		     
		    }
	}
}
