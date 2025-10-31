package A1103반올림_문제;
/*
[문제]
12.3을 소수점 한 자리에서 반올림하시오.    
*/

/*
[출력예시]
12.3
12.0
*/
public class A1103문제02 {
	public static void main(String[] args) {
		double a = 12.3;
	    System.out.println(a);

	    a = a * 10;                    
	    int b = (int)a;
	    int _10 = b / 10;     
	    int _1 = b % 10;                

	    if(_1 >= 5) {
	        _10 = _10 + 1;                  
	    }

	    double c = _10 * 10;
	    c = c / 10;
	    System.out.println(c);
	}
}
