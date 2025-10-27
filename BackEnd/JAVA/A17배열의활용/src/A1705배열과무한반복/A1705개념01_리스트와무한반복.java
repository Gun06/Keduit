package A1705배열과무한반복;

import java.util.Random;

/*
[리스트와 무한반복]
1부터 100 사이의 랜덤 숫자 5개를 numberList에 추가합니다.
단, 홀수만 저장해 보겠습니다.
*/ 
/* 
[출력예시]
11  69  95  45  23  
*/
public class A1705개념01_리스트와무한반복 {
	public static void main(String[] args) {
		Random ran = new Random();
		int arr[] = new int[1000];
		
		int index = 0;
		
		while(true) {
			int r = ran.nextInt(100) + 1;
			if(r % 2 == 1) {
				arr[index] = r;
				index += 1;
				if(index == 5) {
					break;
				}
			}
			
		}
		
		for(int i = 0; i < index; i++) {
			System.out.print(arr[i] + "  ");
		}
		
	}
}
