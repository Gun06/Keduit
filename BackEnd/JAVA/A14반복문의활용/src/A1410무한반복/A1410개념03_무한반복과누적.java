package A1410무한반복;

/*
	[무한 반복과 누적]
	loop = true를 활용하여 무한 반복을 만들 수 있습니다.
	특정 조건이 만족되면 loop = false로 설정하여 반복문을 종료시킬 수 있습니다.
	
	배수는 약수와는 달리 개수가 무한대입니다.
	무한 반복을 이용하여 7의 배수 중에서 작은 수부터 3개만 출력해보겠습니다.
 */

/*
	[출력예시]
	7 14 21
 */

public class A1410개념03_무한반복과누적 {
	public static void main(String[] args) {
		
		int count = 0;
		
		int i = 7;		// 7의 배수이므로 7부터 시작합니다.
		
		boolean loop = true;
		while(loop) {
			System.out.print(i + " ");
			count += 1;
			if(count == 3) {
				loop = false;
			}
			i += 7;		// 배수이므로 7씩 더합니다.
		}
		
	}
}
