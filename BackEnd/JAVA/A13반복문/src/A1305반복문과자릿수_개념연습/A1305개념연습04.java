package A1305반복문과자릿수_개념연습;
/*
[문제]
반복문을 사용하여 130부터 170까지의 숫자 중,
각 자리수 중에 숫자 5가 들어간 수만 출력하시오.
*/
/*
[출력예시]
135 145 150 151 152 153 154 155 156 157 158 159 165 
*/
public class A1305개념연습04 {
public static void main(String[] args) {
	 	for(int i = 130; i < 171; i++){
	        int a = i / 100;
	        int b = i % 100 / 10;
	        int c = i % 10;
	        if(a == 5 || b == 5 || c == 5){
	            System.out.print(i + " ");
	        }
	    }
	}
}
