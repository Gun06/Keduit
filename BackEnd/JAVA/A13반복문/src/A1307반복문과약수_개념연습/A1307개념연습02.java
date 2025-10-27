package A1307반복문과약수_개념연습;
/*
[문제]
반복문을 사용하여 1부터 15까지 숫자를 출력하되,
30의 약수이거나 20의 약수인 경우에는 숫자를 출력하고, 그 외에는 "x"를 출력하시오.
단, if문을 사용할 때 else는 사용하지 않습니다.
*/
/*
[출력예시]
1 2 3 4 5 6 x x x 10 x x x x 15
*/
public class A1307개념연습02 {
public static void main(String[] args) {
		for(int i = 1; i < 16; i++){
	        boolean check = 30 % i == 0 || 20 % i == 0;
	        if(check){
	        	System.out.print(i + " ");
	        }
	        if(!check){
	        	System.out.print("x ");
	        }
	    }
	}
}
