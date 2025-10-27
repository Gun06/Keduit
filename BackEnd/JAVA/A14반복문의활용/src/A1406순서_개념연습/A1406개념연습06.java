package A1406순서_개념연습;
/*
[문제]
852의 약수를 큰 수부터 작은 수까지 거꾸로 찾은 후, 
다섯 번째 약수를 출력하시오.
*/
/*
[출력예시]
852 426 284 213 142 71 12 6 4 3 2 1 
142
*/
public class A1406개념연습06 {
	public static void main(String[] args) {
		int num = 852;
	    int count = 0;
	    int i2 = num;
	    int find = 0;
	    for(int i = 1; i < num + 1; i++){
	        if(num % i2 == 0){
	        	System.out.print(i2 + " ");
	            count += 1;
	            if(count == 5){
	                find = i2;
	            }
	        }
	        i2 -= 1;
	    }
	    System.out.println();
	    System.out.println(find);
	}
}
