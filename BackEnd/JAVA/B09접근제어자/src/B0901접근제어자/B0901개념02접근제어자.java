package B0901접근제어자;

class Student1 {
	private String name;
	private int age;
	
	public Student1(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}



public class B0901개념02접근제어자 {
	public static void main(String[] args) {
		
		
		Student1 hgd = new Student1("홍길동", 11);

		System.out.println(hgd.getName());
		System.out.println(hgd.getAge());
		
		hgd.setName("이만수");
		hgd.setAge(20);
				
		System.out.println(hgd.getName());
		System.out.println(hgd.getAge());
		
		// hgd.name = "aaa"; 직접접근을 불가하다.
		
		
		
		
	}
}
