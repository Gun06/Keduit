package A1305반복문과자릿수_개념연습;
/*
[문제]
반복문을 사용하여 100부터 300까지의 숫자 중,
십의 자리가 3이고 일의 자리가 7인 수만 출력하시오.
*/
/*
[출력예시]
137 237
*/
public class A1305개념연습06 {
public static void main(String[] args) {
	    for(int i = 100; i < 301; i++){
	        int a = i % 100 / 10;
	        int b = i % 10;
	        boolean check = a == 3 && b == 7;
	        if(check){
	        	System.out.print(i + " ");
	        }
	    }
	}
}
