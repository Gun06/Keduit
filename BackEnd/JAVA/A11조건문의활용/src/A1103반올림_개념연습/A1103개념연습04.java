package A1103반올림_개념연습;
/*
[문제]
10.79를 소수점 두 자리에서 반올림하시오.    
*/

/*
[출력예시]
10.79
10.8    
*/
public class A1103개념연습04 {
	public static void main(String[] args) {
		double a = 10.79;
		System.out.println(a);

	    a = a * 100;                    
	    int b = (int)a;
	    //System.out.println(b);
	    int _10 = b / 10;   
	    int _1 = b % 10;               

	    if(_1 >= 5) {
	        _10 = _10 + 1;
	    }

	    double d = _10 * 10;                
	    d = d / 100;                    
	    System.out.println(d);
	}
}
