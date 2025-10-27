package B0203클래스와정렬_문제;

import java.util.Arrays;


class Member220304{
	int number;
	String name;
	String grade;
}

public class B0203문제04 {
	public static void main(String[] args) {
		/*
		    member 배열은 회원목록 리스트이다. 
		    데이터는 순서대로 번호, 이름, 등급 이다.
		
		*/
		
		String[][] arr = {
		{"1001", "김철수", "A"},         
		{"1002", "이만수", "B"},         
		{"1003", "오수정", "C"},        
		{"1004", "박만삼", "A"},         
		{"1005", "이영희", "B"},
		{"1006", "송민아", "B"},         
		{"1007", "이영희", "A"},        
		{"1008", "이만수", "A"},             
		};
		
		/*
			[문제]
				학생들을 이름순으로 오름차순 정렬하시오.
				단, 이름이 같으면 번호으로 내림차순하시오.
			[정답]
				1001 김철수 A 
				1004 박만삼 A 
				1006 송민아 B 
				1003 오수정 C 
				1002 이만수 B 
				1008 이만수 A 
				1005 이영희 B 
				1007 이영희 A 


		
		
		*/
	Member220303[] memberList = new Member220303[arr.length];
		
	
	}
}
