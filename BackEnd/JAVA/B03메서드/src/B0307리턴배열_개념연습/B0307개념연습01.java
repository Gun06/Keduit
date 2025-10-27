package B0307리턴배열_개념연습;

import java.util.Arrays;

public class B0307개념연습01 {

	public static String[] solution(int[] number, String[] name, int[] score) {
		int size = number.length;
		String [] data =new String[size * 3];
		int index = 0;
		for(int i = 0; i < number.length; i++) {
			data[index] = number[i] + "";
			index += 1;
			data[index] = name[i] + "";
			index += 1;
			data[index] = score[i] + "";
			index += 1;
		}
		
		return data;
	}
	
	public static void main(String[] args) {
		/*
         	[문제]
			아래배열 3개는 학생 점수 데이터이다 
			이를 한 줄로 저장해주는 함수를 만드시오.
		[예시]
			data = [1001,"김철수",32,1002,"이만수",54,1003,"조영민",12];
	    */
		
		int[] number = {1001, 1002, 1003};
		String[] name = {"김철수", "이만수", "조영민"};
		int[] score = {32, 54, 12};
		String[] data = solution(number, name, score);
		System.out.println(Arrays.toString(data));
	}
}
