package A1405반복문과상태변수_문제;

import java.util.Random;

/*
[문제]
a = 10

철수는 집 앞에 100개의 계단이 있는 산이 있습니다.
현재 철수는 10번째 계단에 있습니다.

a는 현재 철수의 위치를 나타냅니다.
b에는 1부터 10 사이의 랜덤 숫자를 저장하고,
c에는 1부터 2 사이의 랜덤 숫자를 저장합니다.

c가 1이면, 철수는 b만큼 계단 위로 이동합니다.
c가 2이면, 철수는 b만큼 계단 아래로 이동합니다.
단, 철수는 계단 0 이하로 내려갈 수 없습니다.
이 동작을 5번 반복한 후 철수의 최종 위치를 출력하시오.
*/
/*
[출력예시]
10
3 7 2
0 5 2
4 4 1
10 6 1
16 6 1
*/
public class A1405문제02 {
	public static void main(String[] args) {
int a = 10;
		  System.out.println(a);
		  Random ran = new Random();
		    for(int i = 0; i < 5; i++){
		    	int b = ran.nextInt(10) + 1;
		    	int c = ran.nextInt(2) + 1;
		        
		        if(c == 1){
		            a = a + b;
		        }else if(c == 2){
		            a = a - b;
		        }
		        if(a < 0){
		            a = 0;
		        }
		        System.out.println(a + " " + b + " " + c );
		    }
	}
}
