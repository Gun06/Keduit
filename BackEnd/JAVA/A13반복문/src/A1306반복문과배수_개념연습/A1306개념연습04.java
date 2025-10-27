package A1306반복문과배수_개념연습;
/*
[문제]
반복문을 사용하여 1부터 150까지 숫자 중, 다음 조건에 맞는 숫자만 출력하시오.

[조건]
(1) 50에서 100사이의 숫자 중 8의 배수만 출력합니다.
(2) 50에서 100 범위가 아닐 때는 7의 배수만 출력합니다.
(3) 위 조건에 해당하지 않는 숫자는 출력하지 않습니다.
(4) 단, if문을 사용할 때 else는 사용하지 않습니다.
*/
/*
[출력예시]
7 14 21 28 35 42 49 56 64 72 80 88 96 105 112 119 126 133 140 147 
*/

public class A1306개념연습04 {
public static void main(String[] args) {
	  	for(int i = 1; i < 151; i++){
	        boolean check1 = i >= 50 && i <= 100 && i % 8 == 0;
	        boolean check2 = i < 50 && i % 7 == 0;
	        boolean check3 = i > 100 && i % 7 == 0;
	        if(check1 || check2 || check3){
	        	System.out.print(i + " ");
	        }
	    }
	}
}
