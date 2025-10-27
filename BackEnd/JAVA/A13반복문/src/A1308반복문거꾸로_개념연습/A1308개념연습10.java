package A1308반복문거꾸로_개념연습;
/*
[문제]
반복문을 사용하여 20부터 10까지 숫자를 출력하되,
12보다 작거나 18보다 크면 숫자와 그 숫자의 세배를 출력합니다.
단, if문을 사용할 때 else는 사용하지 않습니다.
*/
/*
[출력예시]
20 60
19 57
18 18
17 17
16 16
15 15
14 14
13 13
12 12
11 33
10 30
*/
public class A1308개념연습10 {
public static void main(String[] args) {
		int num = 20;
	    for(int i = 10; i < 21; i++){
	        boolean check1 = num < 12;
	        boolean check2 = num > 18;
	        if(check1 || check2){
	        	System.out.println(num + " " + num * 3);
	        }
	        if(!check1 && !check2){
	        	System.out.println(num + " " + num);
	        }
	        num -= 1;
	    }
    
	}
}
