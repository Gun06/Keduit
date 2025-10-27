package A1305반복문과자릿수_개념연습;
/*
[문제]
반복문을 사용하여 10부터 99까지의 숫자 중,
일의 자리가 5보다 크고 십의 자리가 8보다 큰 수만 출력하시오.
*/
/*
[출력예시]
96 97 98 99 
*/
public class A1305개념연습01 {
public static void main(String[] args) {
	   for(int i = 10; i < 100; i++){
	        int a = i / 10;
	        int b = i % 10;
	        if(a > 8 && b > 5){
	           System.out.print(i + " ");
	        }
	    }
	}
}
