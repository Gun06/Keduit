package A2002리스트와데이터_개념연습;

import java.util.Arrays;
/*
[문제]
아래 리스트는 철수와 민수의 가위바위보 데이터이다. 
aList 철수의 데이터이고 
bList 민수의 데이터이다.
민수와 철수는 계단 50번째에서 게임을 시작했으며, 
아래의 규칙을따른다.
철수의 위치를 cList 에 저장후 출력하시오.
[규칙]
이기면 계단 5증가
비기면 계단 1증가
지면 계단 3감소 	
*/ 
/* 
[출력예시]
[바위, 바위, 보, 가위, 바위, 보]
[가위, 보, 가위, 가위, 바위, 바위]
[55, 58, 61, 62, 63, 68]
*/
public class A2002개념연습04 {
	public static void main(String[] args) {
		
		String[] aList = {"바위", "바위",   "보", "가위", "바위",  "보"};
		String[] bList = {"가위",   "보", "가위", "가위", "바위", "바위"};
		
		int[] cList = new int[aList.length];
		
		int pos = 50;
		
		for(int i = 0; i < aList.length; i++) {
			if(aList[i] == bList[i]) {
				pos += 1;
			}else if(aList[i] == "가위" && bList[i] == "보") {
				pos += 5;
			}else if(aList[i] == "바위" && bList[i] == "가위") {
				pos += 5;
			}else if(aList[i] == "보" && bList[i] == "바위") {
				pos += 5;
			}else {
				pos += 3;
			}
			cList[i] = pos;
		}
		
		System.out.println(Arrays.toString(aList));
		System.out.println(Arrays.toString(bList));
		System.out.println(Arrays.toString(cList));
		
	}
}
