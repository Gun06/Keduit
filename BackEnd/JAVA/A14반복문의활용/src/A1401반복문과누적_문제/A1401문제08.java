package A1401반복문과누적_문제;
/*
[문제]
반복문을 사용하여 10부터 50까지의 숫자 중,
십의 자리가 짝수이고 일의 자리가 홀수인 숫자들만을 찾아 출력한다.
또한 그 중에서 3의 배수인 숫자들을 누적하여 합을 출력하시오.
*/
/*
[출력예시]
21 27 45 
93
*/
public class A1401문제08 {
	public static void main(String[] args) {
int total = 0;
	    for(int i = 10; i < 51; i++){
	        int a = i / 10;
	        int b = i % 10;
	        boolean check1 = a % 2 == 0 && b % 2 == 1;
	        boolean check2 = i % 3 == 0;
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
