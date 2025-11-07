package A1407개별누적_문법;
/*
[문제]
반복문을 사용하여 100부터 900까지의 숫자 중,
백의 자리가 3의 배수이고, 십의 자리가 4의 배수이며, 일의 자리가 5의 배수인 숫자만 출력하시오.
단, 각 자리에 0이 포함된 숫자는 제외합니다.
위 조건을 만족하는 숫자들의 각 자리 숫자의 합도 함께 출력하시오.
*/
/*
[출력예시]
345 12
385 16
645 15
685 19
*/
public class A1407문제01 {
	public static void main(String[] args) {
for(int i = 100; i < 901; i++){
		        int a = i / 100;
		        int b = i % 100 / 10;
		        int c = i % 10;
		        boolean check1 = a % 3 == 0 && b % 4 == 0 && c % 5 == 0;
		        boolean check2 = a != 0 && b != 0 && c != 0;
		        int total = a + b + c;
		        if(check1 && check2){
		        	System.out.println(i + " " + total);
		        }
		    }
	}
}
