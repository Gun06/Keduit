package A0401변수;
/*
[변수의 저장 원리]
변수는 오로지 값을 한 개만 저장할 수 있습니다.
즉, 새로운 값이 저장되면 이전의 값은 사라집니다.

아래 식에서 a는 10이 저장되었다가, a는 새로운 값 20이 저장되어 처음 값인 10은 사라집니다.
그래서 결국 a는 20이 출력됩니다.
 */
public class A0401개념06_변수의저장원리 {
	public static void main(String[] args) {
		int a = 10;
		a = 20;
		System.out.println(a);
	}
}
