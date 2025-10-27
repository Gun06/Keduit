package B0402클래스와메서드리턴_개념연습;

import java.util.Arrays;

/*
	[문제]
		main() 메서드 안에 data배열은 학생 점수를 문자열로 타입으로 저장한 것이다.
		점수는 0~100점 사이이고, 60점 이상이면 합격생이다.
		오로지 합격생의 점수만 result배열에 담아서 리턴하는 
		run메서드를 구현하시오.
 */
class Return1{
	
	int[] run(String[] data) {
		
		int[] result = null;	
		
		int count = 0;
		for(int i=0; i<data.length; i++) {
			int score = Integer.parseInt(data[i]);
			if(score >= 60) {
				count += 1;
			}
		}
		
		result = new int[count];
		
		int index = 0;
		for(int i=0; i<data.length; i++) {
			int score = Integer.parseInt(data[i]);
			if(score >= 60) {
				result[index] = score;
				index += 1;
			}
		}
		
		return result;
	}
}

public class B0402개념연습01 {
	public static void main(String[] args) {
		
		Return1 re = new Return1();
		
		String[] data = {"34" , "43" ,"76" ,"12" , "54"};
		
		int result[] = re.run(data);
		System.out.println(Arrays.toString(result));
		
	}
}
