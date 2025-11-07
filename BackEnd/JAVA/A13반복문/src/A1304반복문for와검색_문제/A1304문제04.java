package A1304반복문for와검색_문제;
/*
[문제]
반복문을 사용하여 1부터 5까지 숫자를 출력하되,
1이거나 5일 경우, 숫자와 그 숫자를 한 번 더 출력하고,
2이상 4이하일 경우, 숫자와 그 숫자의 두배를 출력합니다.
단, if문을 사용할 때 else는 사용하지 않습니다.
*/
/*
[출력예시]
1 1
2 4
3 6
4 8
5 5
*/
public class A1304문제04 {
public static void main(String[] args) {
		for(int i = 1; i<=5; i ++) {
			boolean check1 = i == 1 || i == 5;
	        boolean check2 = 2 <= i && i <= 4;
	        if(check1){
	        	System.out.println(i + " " + i);
	        }
	        if(check2){
	        	System.out.println(i + " " + i * 2);
	        }
		}
	}
}
