package A1201조건문종류else_문제;
/*
[문제]
철수는 경품 행사에 참가했습니다. 
경품을 받기 위해 100부터 999 사이의 랜덤 숫자를 하나 뽑고, 각 자리의 숫자를 확인합니다.
각 자리의 숫자가 전부 같으면 "당첨", 아니면 "꽝"을 출력하시오.
단, else를 사용하시오.
*/
/*
[출력예시]
333
당첨

[출력예시]
803
꽝
*/
public class A1201문제18 {
	public static void main(String[] args) {
		int a = 333;
	 	System.out.println(a);
	 	int b = a / 100;
	 	int c = a % 100 / 10;
	 	int d = a % 10;

	    boolean check = b == c && c == d;
	    if(check){
	    	System.out.println("당첨");
	    }else{
	    	System.out.println("꽝");
	    }
	}
}
