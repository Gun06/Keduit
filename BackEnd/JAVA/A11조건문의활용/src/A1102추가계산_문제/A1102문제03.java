package A1102추가계산_문제;
/*
[문제]
마트에서 오이를 3개씩 묶어 1500원에 판매합니다.
오이는 묶음 단위로만 판매하므로, 부족한 오이는 다음 묶음으로 구매해야 합니다.
철수는 오이가 14개 필요합니다. 
철수가 지불해야될 금액을 계산하여 출력하시오.    
*/

/*
[출력예시]
7500    
*/
public class A1102문제03 {
	public static void main(String[] args) {
		int a = 1500;
		int b = 14;
		
		int c = b / 3;
		int d = b % 3;
		
		if(d > 0) {
	        c = c + 1;
	    }

	    int e = a * c;
	    System.out.println(e);
	}
}
