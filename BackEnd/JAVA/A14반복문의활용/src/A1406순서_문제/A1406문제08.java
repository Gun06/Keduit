package A1406순서_문제;
/*
[문제]
75의 약수를 큰 수부터 작은 수까지 거꾸로 찾은 후, 
20보다 작은 수 중에서 두 번째로 큰 수를 출력하시오.
*/
/*
[출력예시]
75 25 15 5 3 1 
5
*/
public class A1406문제08 {
	public static void main(String[] args) {
int num1 = 75;
	    int num2 = 20;
	    int count = 0;
	    int i2 = num1;
	    int find = 0;
	    for(int i = 1; i < num1 + 1; i++){
	        if(num1 % i2 == 0){
	        	System.out.print(i2 + " ");
	            if(i2 < num2){
	                count += 1;
	                if(count == 2){
	                    find = i2;
	                }
	            }
	        }
	        i2 -= 1;
	    }
	    System.out.println();
	    System.out.println(find);
	}
}
