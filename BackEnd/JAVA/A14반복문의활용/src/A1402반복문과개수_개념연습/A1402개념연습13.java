package A1402반복문과개수_개념연습;

import java.util.Random;

/*
[문제]
10에서 100 사이의 랜덤 숫자를 저장한 후,
그 숫자의 약수 개수가 4이면 "당첨", 그렇지 않으면 "꽝"을 출력하시오.
*/
/*
[출력예시]
15
1 3 5 15
당첨

[출력예시]
20
1 2 4 5 10 20
꽝
*/
public class A1402개념연습13 {
	public static void main(String[] args) {
		Random ran = new Random();
		int r = ran.nextInt(91) + 10;
		System.out.println(r);
	    int count = 0;
	    for(int i = 1; i < r + 1; i++){
	        if(r % i == 0){
	        	System.out.print(i + " ");
	            count += 1;
	        }
	    }
	    System.out.println();
	    System.out.println(count);
	}
}
