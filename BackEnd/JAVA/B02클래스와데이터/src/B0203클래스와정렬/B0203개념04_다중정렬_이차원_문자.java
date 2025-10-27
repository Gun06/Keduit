package B0203클래스와정렬;

import java.util.Arrays;


class Member220304{
	int number;
	String name;
	String grade;
}

public class B0203개념04_다중정렬_이차원_문자 {
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
		
		for(int i = 0; i  < arr.length; i++) {
			Member220303 mem =new Member220303();
			mem.number = Integer.parseInt(arr[i][0]);
			mem.name = arr[i][1];
			mem.grade = arr[i][2];
			memberList[i] = mem;
		}
		
		
		
		Arrays.sort(memberList , (a , b)->{
			if(a.name.compareTo(b.name) < 0) {
				return -1;
			}
			else if(a.name.compareTo(b.name) > 0) {
				return 1;
			}else {
				if(a.number < b.number) {
					return 1;
				}
				else if(a.number < b.number ) {
					return -1;
				}else {
					return 0;
				}
			}
		});
		for(int i=0; i<memberList.length; i++) {
			System.out.print(memberList[i].number + " ");
			System.out.print(memberList[i].name + " ");
			System.out.print(memberList[i].grade + " ");
			System.out.println();
			
	}
	}
}
