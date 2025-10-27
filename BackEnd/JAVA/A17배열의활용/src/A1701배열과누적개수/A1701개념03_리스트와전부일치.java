package A1701배열과누적개수;

import java.util.Arrays;

/*
[리스트와 전부 일치]
0부터 9 사이의 랜덤 숫자 3개를 numberList에 저장한 후, 
모두 짝수이면 "1등", 모두 홀수이면 "2등", 그 이외에는 "꽝"을 출력해 보겠습니다. 
단, 0은 짝수로 간주합니다.
*/
/*
[출력예시]
[1, 9, 1]
2등

[출력예시]
[2, 2, 2]
1등

[출력예시]
[1, 2, 3]
꽝

*/
public class A1701개념03_리스트와전부일치 {
	public static void main(String[] args) {
		 	int[] numberList = {1, 9, 1};
		    

		    int count = 0;
		    for(int i = 0; i < numberList.length; i++){
		        if(numberList[i] % 2 == 0){
		            count += 1;
		        }
		    }
		    System.out.println(Arrays.toString(numberList));
		    if(count == numberList.length){
		        System.out.println("1등");
		    }else if(count == 0){
		    	System.out.println("2등");
		    }else{
		    	System.out.println("꽝");
		    }
	}
}
