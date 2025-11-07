package A1308반복문거꾸로_문제;
/*
[문제]
반복문을 사용하여 15부터 1까지 숫자를 출력하되,
5보다 크고 10보다 작으면서 3의 배수일 때에는 숫자를 출력하고, 그 외에는 "x"를 출력하시오.
단, if문을 사용할 때 else는 사용하지 않습니다.
*/
/*
[출력예시]
x x x x x x 9 x x 6 x x x x x
*/
public class A1308문제12 {
public static void main(String[] args) {
		int num = 15;
	    for(int i = 1; i  < 16; i++){
	        boolean check = num <= 5 || num >= 10 || num % 3 != 0;
	        if(check){
	        	System.out.print("x ");
	        }
	        if(!check){
	        	System.out.print(num + " ");
	        }
	        num -= 1;
	    }
    
	}
}
