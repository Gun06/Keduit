package A1601배열_문제;

import java.util.Random;
/*
[문제]
numberList 리스트 범위 안에서 랜덤으로 인덱스를 선택하고, 
해당 인덱스와 그에 해당하는 값을 출력하시오.
*/
/*
[출력예시]
2 30
*/
public class A1601문제03 {
	public static void main(String[] args) {
int[] numberList = {10, 20, 30, 40};
		 Random ran = new Random();
		 int r = ran.nextInt(4);
		 System.out.println(r + " " + numberList[r]);
	}
}
