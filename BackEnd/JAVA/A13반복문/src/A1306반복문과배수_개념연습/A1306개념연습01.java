package A1306반복문과배수_개념연습;
/*
[문제]
반복문을 사용하여 1부터 10까지 숫자를 출력하되,
홀수가 아닐 때에는 숫자 대신 "x"를 출력하시오.
단, if문을 사용할 때 else는 사용하지 않습니다.
*/
/*
[출력예시]
1 x 3 x 5 x 7 x 9 x
*/
public class A1306개념연습01 {
public static void main(String[] args) {
		for(int i = 1; i < 11; i++){
	        boolean check1 = i % 2 == 1;
	        boolean check2 = i % 2 != 1;
	        if(check1){
	        	System.out.print(i + " ");
	        }
	        if(check2){
	        	System.out.print("x ");
	        }
	    }
	}
}
