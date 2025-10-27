package A1701배열과누적개수_개념연습;

import java.util.Arrays;
import java.util.Random;

/*
[문제]
0부터 9 사이의 랜덤 숫자 4개를 numberList에 저장 후,
모두 짝수이면 "1등", 모두 홀수이면 "2등", 그 이외에는 "꽝"을 출력하시오.
단, 0은 짝수로 간주합니다.
*/ 
/*
[출력예시1]
[0, 8, 0, 8]
1등
[출력예시2]
[3, 3, 3, 9]
2등
[출력예시3]
[8, 1, 0, 3]
꽝
*/
public class A1701개념연습05 {
	public static void main(String[] args) {
		 int[] numberList = new int[4];
		 Random ran = new Random();   
		 for(int i = 0; i < 4; i++){
		     int r = ran.nextInt(10);   
		     numberList[i] = r;
		 }
		 System.out.println(Arrays.toString(numberList));
		    int count = 0;
		    for(int i = 0; i < numberList.length; i++){
		        if(numberList[i] % 2 == 0){
		            count += 1;
		        }
		    }
		    if(count == numberList.length){
		    	System.out.println("1등");
		    }else if(count == 0){
		    	System.out.println("2등");
		    }else{
		    	System.out.println("꽝");
		    }
	}
}
