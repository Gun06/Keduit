package A1604배열과추가_개념연습;

import java.util.Random;
/*
[문제]
1부터 5 사이의 랜덤 숫자를 한 개 저장한 후, 해당 숫자만큼 반복문을 실행하여 
리스트에 랜덤 숫자를 그 횟수만큼 저장한 후, 리스트 전체를 출력하시오.
*/
/*
[출력예시]
3
[3, 3, 3]
*/
public class A1604개념연습01 {
	public static void main(String[] args) {
		Random ran = new Random();
		int[] arr = new int[1000];		
		int index = 0;
		
		int r = ran.nextInt(5) + 1;
		System.out.println(r);
		
		for(int i = 0; i < r; i++) {
			arr[index] = r;
			index += 1;
		}
		
		for(int i = 0; i < index; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
