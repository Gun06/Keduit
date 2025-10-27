package B1201벡터_개념;



/*
	# 래퍼 클래스(wrapper class)
	- 래퍼 클래스란, 기본 자료형을 클래스로 만들어 놓은 것을 의미한다.
		[기본형]          [래퍼 클래스]
		byte             Byte
		short            Short
		int              Integer
		long             Long
		float            Float
		double           Double
		char             Character
		boolean          Boolean	
 */

public class B1201개념01_래퍼클래스 {
	public static void main(String[] args) {
		
		int i1 = 10;
		Integer i2 = 10;
		System.out.println(i1);
		System.out.println(i2);
		System.out.println("---------------");
		
		float f1 = 10.1f;
		Float f2 = 10.1f;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println("---------------");
		
		double d1 = 10.11;
		Double d2 = 10.11;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println("---------------");
		
		char ch1 = 'a';
		Character ch2 = 'a';
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println("---------------");
		
		
		long l1 = 10000000000000l;
		Long l2 = 10000000000000l;
		System.out.println(l1);
		System.out.println(l2);
		System.out.println("---------------");
		
		boolean b1 = false;
		Boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println("---------------");
		
	}
}