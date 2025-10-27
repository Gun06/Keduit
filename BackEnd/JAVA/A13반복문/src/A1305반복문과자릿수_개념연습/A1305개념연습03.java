package A1305반복문과자릿수_개념연습;
/*
[문제]
반복문을 사용하여 10부터 99까지의 숫자 중,
일의 자리가 십의 자리의 두 배인 수만 출력하시오.
*/
/*
[출력예시]
12 24 36 48 
*/

public class A1305개념연습03 {
public static void main(String[] args) {
		for(int i = 10; i < 100; i++){
	        int a = i / 10;
	        int b = i % 10;
	        if(b == a * 2){
	        	System.out.print(i + " ");
	        }
	    }
	}
}
