package A1302반복문while과검색;

/*
	[반복문 while과 조건문]
	반복문 while과 조건문을 함께 사용하면 반복 도중에 특정 조건을 확인하고,
	조건에 따라 다른 행동을 수행할 수 있습니다.
	
	while문과 조건식을 활용하여 1부터 10까지 10회 반복하는 코드를 작성해보겠습니다.
	이때, 숫자가 4보다 크고 8보다 작은 경우에는 "x"를 출력하고,
	그 외의 경우에는 숫자를 그대로 출력합니다.
	단, if문을 사용할 때 else는 사용하지 않습니다.
 */

/*
	[출력 예시]
	1 2 3 4 x x x 8 9 10 
 */

public class A1302개념01_반복문while과조건문 {
	public static void main(String[] args) {
		
		int i = 1;
		
		while(i <= 10) {
			if(4 < i && i < 8) {
				System.out.print("x ");
			}
			if(8 <= i || i <= 4) {
				System.out.print(i + " ");
			}
			i += 1;
		}
	}
}
