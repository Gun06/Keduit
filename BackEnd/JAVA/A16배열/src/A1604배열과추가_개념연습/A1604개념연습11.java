package A1604배열과추가_개념연습;

import java.util.Random;

/*
[문제]
랜덤으로 10부터 100 사이의 숫자를 저장합니다.
그 수의 약수를 전부 aList에 추가하시오.
*/
/*
[출력예시]
68
1 2 4 17 34 68
*/
public class A1604개념연습11 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r = ran.nextInt(91) + 10;
		System.out.println(r);
		    int[] aList = new int[1000];
		    int index = 0;
		    for(int i = 1; i < r + 1; i++){
		        if(r % i == 0){
		            aList[index] = i;
		            index += 1;
		        }
		    }
		    
		    for(int i = 0; i < index; i++) {
		    	System.out.print(aList[i] + " ");
		    }
	}
}
