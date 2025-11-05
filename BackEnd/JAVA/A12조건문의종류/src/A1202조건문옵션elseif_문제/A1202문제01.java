package A1202조건문옵션elseif_문제;

import java.util.Random;

/*
[문제]
x = 5
y = 5

철수는 지금 게임을 하고 있습니다.
게임의 캐릭터는 동서남북 네 방향으로 이동할 수 있습니다.
현재 철수는 x = 5, y = 5 위치에 있으며, x는 좌우를, y는 상하를 뜻합니다.
랜덤 숫자(1~4)를 저장하고, 1이면 동쪽, 2면 서쪽, 3이면 남쪽, 4면 북쪽으로 한 칸 이동합니다.
이동한 후 게임 캐릭터의 위치를 출력하시오.
단, elif와 else를 사용하시오.
*/
/*
[출력예시]
1
6 5
*/
public class A1202문제01 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r = ran.nextInt(4) + 1;
	    int x = 5;
	    int y = 5;
	    
	    if(r == 1){
	        x = x + 1;
	    }else if(r == 2){
	        x = x - 1;
	    }else if(r == 3){
	        y = y - 1;
	    }else if(r == 4){
	        y = y + 1;
	    }
	    System.out.println(x + " " + y);
	}
}
