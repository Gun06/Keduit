package A2002리스트와데이터_개념연습;

import java.util.Arrays;

/*
[문제]
철수와 민수는 가위바위보 게임을 다섯 번 진행하였습니다.
aList 는 철수의 가위바위보 순서입니다.
bList 는 민수의 가위바위보 순서입니다.
cList 의 승리자의 이름을 저장합니다. 비긴경우는 x를 저장합니다.
철수가 몇 번 승리했는지 출력하시오.
*/ 
/* 
[출력예시]
[가위, 바위, 바위, 보, 가위]
[보, 가위, 바위, 가위, 보]
[철수, 철수, x, 민수, 철수]
3

*/
public class A2002개념연습03 {
	public static void main(String[] args) {
		String[] aList = {"가위", "바위", "바위",   "보", "가위"};
		String[] bList = {"보" , "가위", "바위", "가위",   "보"};
		
		String[] cList = new String[aList.length];
		
		int count = 0;
		
		for(int i = 0; i < aList.length; i++) {
			if(aList[i] == bList[i]) {
				cList[i] = "x";
			}else if(aList[i] == "가위" && bList[i] == "보") {
				cList[i] = "철수";
				count += 1;
			}else if(aList[i] == "바위" && bList[i] == "가위") {
				cList[i] = "철수";
				count += 1;
			}else if(aList[i] == "보" && bList[i] == "바위") {
				cList[i] = "철수";
				count += 1;
			}else {
				cList[i] = "민수";
			}
		}
		
		System.out.println(Arrays.toString(aList));
		System.out.println(Arrays.toString(bList));
		System.out.println(Arrays.toString(cList));
		System.out.println(count);
		
	}
}
