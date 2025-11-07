package A1401반복문과누적_문제;
/*
[문제]
반복문을 사용하여 1000부터 2000까지의 숫자 중,
16의 배수이면서 백의 자리가 7인 숫자들만을 누적하여 합을 출력하시오.
 */
 /*
[출력예시]
1712 1728 1744 1760 1776 1792 
10512
 */
public class A1401문제05 {
	public static void main(String[] args) {
int total = 0;
	    for(int i = 1000; i < 2001; i++){
	        int a = i % 1000 / 100;
	        boolean check1 = i % 16 == 0;
	        boolean check2 = a == 7;
	        if(check1 && check2){
	        	System.out.print(i + " ");
	            total += i;
	        }
	    }
	    System.out.println();
	    System.out.println(total);
	}
	    }
	    System.out.println();
	    System.out.println(total);
	}
}
