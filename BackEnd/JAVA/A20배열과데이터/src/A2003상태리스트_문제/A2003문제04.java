package A2003상태리스트_문제;

import java.util.Arrays;

/*
[문제]
현재 택시는 5, 5 위치에 있다.
배열의 speedList은 속도를 뜻한다.
배열의 dirList 방향을 뜻하고 (북, 동, 남, 서)를 뜻한다. 
속도와 방향은 택시가 매번 이동한 내용을 기록한 것이다. 
예) 속도는 4이고 방향이 북쪽이면 아래와같이 된다. 
y가 4증가해  x : 5 , y : 9 가 된다.  
6번 모두 이동한 후 택시의 위치를 출력하시오. 
*/ 
/*
[출력예시]
[5, 7, 7, 2, -2, -1]
[9, 9, 8, 8, 8, 8]

*/
public class A2003문제04 {
	public static void main(String[] args) {
		int[] speedList = {   4,    2,    1,    5,    4,    1};
		String[] dirList   = {"북", "동", "남", "서", "서", "동"};
		int[] xList = new int[speedList.length];
		int[] yList = new int[speedList.length];
		int x = 5;
		int y = 5;
		
		
	}
}
