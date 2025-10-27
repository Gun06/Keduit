package A1704배열과규칙찾기;

import java.util.Arrays;

/*
[리스트와 일이삼일이삼]
10번 박복하면서 1 2 3 1 2 3 1 2 3 1 을 반복해서 저장하시오.
여기서 반복 숫자는 "1 2 3"을 계속 반복하는 것을 의미합니다.
*/
/*
[출력예시]
[1, 2, 3, 1, 2, 3, 1, 2, 3, 1]
*/
public class A1704개념04_리스트와일이삼일이삼 {
	public static void main(String[] args) {
		int[] numberList = new int[10];
	    int num = 1;
	    int index = 0;
	    for(int i = 0; i < 10; i++){
	        numberList[index] = num;
	        index += 1;
	        num += 1;
	        if(num == 4){
	            num = 1;
	        }
	    }
	    System.out.println(Arrays.toString(numberList));
	}
}
