package A1102추가계산_문제;

/*
    [문제]
    철수는 김밥을 만들기 위해 재료를 사러 마트에 왔습니다.
    철수가 필요한 재료는 오이 14개와 당근 12개입니다.
    오이는 한 번에 4개씩 묶어서 1500원에 판매되고,
    당근은 한 번에 5개씩 묶어서 1600원에 판매됩니다.
    철수가 재료를 구입하는 데 필요한 총 금액을 구하여 출력하시오.    
*/

/*
    [출력예시]
    10800    
*/
public class A1102문제04 {
	public static void main(String[] args) {
		int a = 14;
	    int b = 12;

	    int c = 1500;
	    int d = 1600;

	    int e =  a / 4;
	    int f = a % 4;
	    if(f > 0) {
	        e = e + 1;
	    }

	    int g = b / 5;
	    int h = b % 5;
	    if(h > 0) {
	        g = g + 1;
	    }

	    int i = e * c + g * d;
	    System.out.println(i);
	}
}
