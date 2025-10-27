package A1307반복문과약수;

/*
	[반복문과 약수 연습]
	반복문을 사용하여 1부터 10까지 숫자를 출력하되,
	210의 약수가 아니면 숫자 대신 "x" 출력하는 코드를 작성해 보겠습니다.
	단, if문을 사용할 때 else는 사용하지 않습니다.
 */

/*
	[출력예시]
	1 2 3 x 5 6 7 x x 10 
 */

public class A1307개념01_반복문과약수연습 {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			boolean check = 210 % i == 0;
			if(check) {
				System.out.print(i + " ");
			}
			if(!check) {
				System.out.print("x ");
			}
		}
		
	}
}
