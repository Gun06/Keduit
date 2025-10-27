package A0207실수;
/*
	[연결연산자] 문자와 숫자
		문자와 숫자를 연결연산자를 사용하면 문자는 숫자를 강제로 문자로 형변환한다. 
		
		예를들어 "a" + 10 은 10이 "10" 으로 변경되고, 그위에 합쳐저서 "a10"이된다.
 */
public class A0207개념08_연결연산자문자와숫자 {
	public static void main(String[] args) {
		System.out.println("a" + 10);
		System.out.println(11 + "b");
		
	}
}
