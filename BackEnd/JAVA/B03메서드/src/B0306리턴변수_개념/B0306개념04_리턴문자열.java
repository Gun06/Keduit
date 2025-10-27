package B0306리턴변수_개념;
import java.util.Random;
public class B0306개념04_리턴문자열 {	
	public static String getRanStr(int num) {
		Random ran = new Random();
		String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String result = "";
		for(int i = 0; i < num; i++) {
			int r = ran.nextInt(str.length());
			result += str.charAt(r);
		}
		return result;
	}
	public static void main(String[] args) {	
		/*
		  [문제]	
		  	랜덤숫자(2~9)개수만큼 랜덤알파벳을 문자열로 반환해주는 함수를 만드시오.
		 */	
		Random ran = new Random();
		int r = ran.nextInt(8) + 2;
		System.out.println(r);
		String str = getRanStr(r);		
		System.out.println(str);
	}
}
