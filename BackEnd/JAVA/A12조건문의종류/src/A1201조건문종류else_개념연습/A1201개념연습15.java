package A1201조건문종류else_개념연습;
/*
[문제] 
철수는 암호 숫자를 만들었습니다. 
암호 숫자의 규칙은 모든 자리의 숫자가 짝수이고, 모든 자리의 숫자가 5 이상이면 통과입니다. 
100부터 999 사이의 랜덤 숫자를 저장한 후, 해당 숫자가 암호 규칙을 통과하는지 확인하여 
"통과" 또는 "실패"를 출력하시오.
단, else를 사용하시오.
*/
/*
[출력예시]
668
통과

[출력예시]
236
실패
*/
public class A1201개념연습15 {
public static void main(String[] args) {
	 	int a = 868;
	 	System.out.println(a);
	    int b = a / 100;
	    int c = a % 100 / 10;
	    int d = a % 10;

	    boolean check = b % 2 == 0 && b >= 5 && c % 2 == 0 && c >= 5 && d % 2 == 0 && d >= 5;
	    if(check){
	    	System.out.println("통과");
	    }else{
	    	System.out.println("실패");
	    }
	}
}
