package A2002리스트와데이터_개념연습;
/*
[문제]
철수네 반은 봄 소풍에 필요한 햄치즈 샌드위치를 만들려고 합니다.
a, b, c 리스트는 각각 햄치즈 샌드위치 재료입니다.
식빵, 치즈, 햄 순서대로 만든 요소만 삭제하고 리스트 전체를 출력하시오.
*/ 
/* 
햄 햄 햄 
햄 치즈 치즈 
햄 식빵 치즈 
*/
public class A2002개념연습12 {
	public static void main(String[] args) {
		String[] aList = {"식빵", "햄",   "햄", "식빵",   "햄"};
		String[] bList = {"치즈", "햄", "치즈", "치즈", "치즈"};
		String[] cList = {  "햄", "햄", "식빵",   "햄", "치즈"};

		int index = 0;
		for(int i = 0; i < aList.length; i++) {
			 boolean a = aList[i] == "식빵" && bList[i] == "치즈" && cList[i] == "햄";
			 if(!a) {
				 aList[index] = aList[i];
				 bList[index] = bList[i];
				 cList[index] = cList[i];
				 index += 1;
			 }
	    }
	    
	    for(int i = 0; i < index; i++) {
	    	System.out.print(aList[i] + " ");
	    }
	    System.out.println();
	    for(int i = 0; i < index; i++) {
	    	System.out.print(bList[i] + " ");
	    }
	    System.out.println();
	    for(int i = 0; i < index; i++) {
	    	System.out.print(cList[i] + " ");
	    }
	    System.out.println();
		
		   
	}
}
