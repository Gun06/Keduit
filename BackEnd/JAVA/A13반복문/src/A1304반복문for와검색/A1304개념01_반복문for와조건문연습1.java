package A1304반복문for와검색;

/*
	[반복문 for와 조건문 연습]
	for문과 조건식을 활용하여 1부터 10까지 10회 반복하는 코드를 작성해보겠습니다.
	이때, 숫자가 4보다 크고 8보다 작은 경우에는 "x"를 출력하고,
	그 외의 경우에는 숫자를 그대로 출력합니다.
	단, if문을 사용할 때 else는 사용하지 않습니다.
 */

/*
	[출력예시]
	1 2 3 4 x x x 8 9 10 
 */

public class A1304개념01_반복문for와조건문연습1 {
	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			boolean check = 4 < i && i < 8;
			if(check) {
				System.out.print("x ");
			}
			if(!check) {
				System.out.print(i + " ");
			}
		}
		
	}
}
