package A1202조건문옵션elseif;

/*
	[조건문 옵션 else if]
	if의 두 번째 옵션으로 else if가 있습니다.
	else는 경우의 수가 두 개일 때만 사용할 수 있는 반면, else if는 경우의 수가 세 개 이상일 때 사용할 수 있습니다.
	else if는 항상 if와 함께 사용하며, 단독으로 사용할 수 없습니다.
	
	else if를 여러 개 사용할 때는, 위에서부터 순차적으로 비교하며,
	중간에 else if 조건이 참(true)인 경우, 아래에 있는 else if는 모두 무시됩니다.
	
	[문법]
	if(조건식1) {
	    조건식1이 참(true)일 때, 실행할 문장;
	} else if(조건식2) {
	    조건식1이 거짓(False)이고, 조건식2가 참(true)일 때 실행할 문장; 
	} else if(조건식3) {
	    조건식1,2가 거짓(False)이고, 조건식3이 참(true)일 때 실행할 문장;
	}
 */

public class A1202개념01_조건문옵션elseif {
	public static void main(String[] args) {
		
		int a = 10;
		
		if(a == 10) {
			// 전부 하나의 식으로 연결되어 있어 if(1)만 출력됩니다.
			System.out.println("if(1)");
		} else if(a == 10) {
			System.out.println("if(2)");
		} else if(a == 10) {
			System.out.println("if(3)");
		}
		
	}
}
