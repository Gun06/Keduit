package A1402반복문과개수_문제;
/*
[문제]
반복문을 사용하여 2000의 약수를 찾고,
그 중 백의 자리가 4인 약수를 모두 출력한 후, 
그 개수도 출력하시오.
*/
/*
[출력예시]
400
1
*/
public class A1402문제03 {
	public static void main(String[] args) {
int count = 0;
	    int num = 2000;
	    for(int i = 1; i< 2001; i++){
	        int a = i % 1000 / 100;
	        boolean check1 = a == 4;
	        boolean check2 = num % i == 0;
	        if(check1 && check2){
	        	System.out.print(i + " ");
	            count += 1;
	        }
	    }
	    System.out.println();
	    System.out.println(count);
	}
}
