package A1301반복문while_개념연습;
/*
[문제]
반복문을 사용하여 5부터 12까지 숫자를 옆으로 출력하시오.
*/
/*
[출력예시]
5 6 7 8 9 10 11 12
*/
public class A1301개념연습01 {
	public static void main(String[] args) {
		 int i = 5;
		    while(i <= 12){
		    	System.out.print(i + " ");
		        i += 1;
		    }
	}
}
