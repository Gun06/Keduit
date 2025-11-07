package A1306반복문과배수_문제;
/*
[문제]
반복문을 사용하여 1부터 15까지 숫자를 출력하되,
5보다 작거나, 10보다 크거나, 3의 배수인 경우에는 숫자를 출력하고, 
그 외에는 "x"를 출력하시오.
단, if문을 사용할 때 else는 사용하지 않습니다.
 */
 /*
[출력예시]
1 2 3 4 x 6 x x 9 11 12 13 14 15 
 */
public class A1306문제03 {
public static void main(String[] args) {
	 for(int i = 1; i < 16; i++){
	        boolean check = i < 5 || i > 10 || i % 3 == 0;
	        if(check){
	        	System.out.print(i + " ");
	        }
	        if(!check){
	        	System.out.print("x ");
	        }
	    }
	}
}
