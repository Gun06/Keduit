package A1308반복문거꾸로_개념연습;
/*
[문제]
반복문을 사용하여 15부터 1까지 숫자를 출력하되,
짝수이면서 20의 약수인 경우에는 숫자를 출력하고, 그 외에는 "x"를 출력하시오.
단, if문을 사용할 때 else는 사용하지 않습니다.
*/
/*
[출력예시]
x x x x x 10 x x x x x 4 x 2 x
*/
public class A1308개념연습13 {
public static void main(String[] args) {
		int num = 15;
	    for(int i = 1; i < 16; i++){
	        boolean check = num % 2 == 0 && 20 % num == 0;
	        if(check){
	        	System.out.print(num + " ");
	        }
	        if(!check){
	        	System.out.print("x ");
	        }
	        num -= 1;
	    }
	}
}
