package A1407개별누적_개념연습;
/*
[문제]
반복문을 사용하여 10부터 90까지의 숫자 중,
십의 자리가 3의 배수이고, 일의 자리가 4의 배수인 숫자만 출력하시오.
단, 0은 모든 수의 배수로 간주하므로, 각 자리에 0이 포함된 숫자는 제외합니다.
위 조건을 만족하는 숫자들의 각 자리 숫자의 합을 구한 후,
그 합이 홀수이면 "o", 짝수이면 "x"를 출력하시오.
*/
/*
[출력예시]
34 o
38 o
64 x
68 x
*/
public class A1407개념연습02 {
	public static void main(String[] args) {
		  for(int i = 10; i < 91; i++){
		        int a = i / 10;
		        int b = i % 10;
		        boolean check1 = a % 3 == 0 && b % 4 == 0;
		        boolean check2 = a != 0 && b != 0;
		        int total = a + b;
		        boolean check3 = total % 2 == 0;
		        if(check1 && check2 && !check3){
		        	System.out.println(i + " o");
		        }
		        if(check1 && check2 && check3){
		        	System.out.println(i + " x");
		        }
		    }
	}
}
