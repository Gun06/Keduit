package A1305반복문과자릿수_개념연습;
/*
[문제]
반복문을 사용하여 50부터 99까지의 숫자 중,
십의 자리가 짝수이고 일의 자리가 홀수인 수만 출력하시오.
*/
/*
[출력예시]
61 63 65 67 69 81 83 85 87 89
*/
public class A1305개념연습02 {
public static void main(String[] args) {
	 	for(int i = 50; i < 100; i++){
	        int a = i / 10;
	        int b = i % 10;
	        if(a % 2 == 0 && b % 2 == 1){
	            System.out.print(i + " ");
	        }
	    }
	}
}
