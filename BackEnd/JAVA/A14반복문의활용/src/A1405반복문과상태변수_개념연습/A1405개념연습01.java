package A1405반복문과상태변수_개념연습;

import java.util.Random;

/*
[문제]
x = 0
y = 0

철수의 시작 위치는 x = 0, y = 0입니다.
x는 동쪽과 서쪽을, y는 북쪽과 남쪽을 나타냅니다.
1부터 4까지의 랜덤 숫자를 5번 뽑습니다.
랜덤 숫자는 각 방향을 의미하며,
1은 북쪽, 2는 동쪽, 3은 남쪽, 4는 서쪽을 뜻합니다.
각 랜덤 숫자에 따라 철수는 해당 방향으로 1씩 이동합니다.
5번 이동한 후 철수의 최종 위치를 출력하시오.
*/
/*
[출력예시]
x=0 y=0
x=1 y=0 r=2
x=1 y=-1 r=3
x=1 y=-2 r=3
x=2 y=-2 r=2
x=2 y=-3 r=3

*/
public class A1405개념연습01 {
	public static void main(String[] args) {
		 int x = 0;
		    int y = 0;
		    System.out.println("x=" + x + " y=" + y );
		    Random ran = new Random(); 
		    		
		    for(int i = 0; i < 5; i++){
		        int r = ran.nextInt(4) + 1;
		        if(r == 1){
		            y += 1;
		        }else if(r == 2){
		            x += 1;
		        }else if(r == 3){
		            y -= 1;
		        }else if(r == 4){
		            x -= 1;
		        }
		        System.out.println("x=" + x + " y=" + y + " r=" + r  );
		    }
	}
}
