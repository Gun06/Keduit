package A1701배열과누적개수;
/*
[리스트에서 특정값찾기]
4부터 9 사이의 랜덤 숫자1개를 저장한후, 
numberList 에  그값이 있으면 "o"  없으면 "x"를 출력하시오.
*/
/*
[출력예시]
8
x

[출력예시]
9
o
*/
public class A1701개념04_특정값찾기 {
	public static void main(String[] args) {
		 	int[] numberList = {5, 7, 9, 4, 7};
		    int r = 8;
		    System.out.println(r);
		    int count = 0;
		    for(int i = 0; i < numberList.length; i++){
		        if(numberList[i]  == r){
		            count += 1;
		        }
		    }
		    
		    if(count >= 1){
		        System.out.println("o");
		    }else{
		    	System.out.println("x");
		    }
	}
}
