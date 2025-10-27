package A1306반복문과배수_개념연습;
/*
[문제]
반복문을 사용하여 100부터 900까지의 숫자 중,
백의 자리가 3의 배수, 십의 자리가 4의 배수, 그리고 일의 자리가 5의 배수인 수만 출력하시오.
단, 각 자리수에 0이 포함되면 안 된다.
*/
/*
[출력예시]
345 385 645 685
*/
public class A1306개념연습05 {
public static void main(String[] args) {
		for(int i = 100; i < 901; i++){
	        int a = i / 100;
	        int b = i % 100 / 10;
	        int c = i % 10;
	        boolean check1 = a != 0 && b != 0 && c != 0;
	        boolean check2 = a % 3 == 0 && b % 4 == 0 && c % 5 == 0;
	        if(check1 && check2){
	        	System.out.print(i + " ");
	        }
	    }
	}
}
