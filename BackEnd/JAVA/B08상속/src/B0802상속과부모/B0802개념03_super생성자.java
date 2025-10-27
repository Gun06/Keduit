package B0802상속과부모;
class Unit{
	int health;
	int power;
	int level;
	String name;
	
	Unit(){}
	Unit(int health, int power, int level , String name){
		this.health = health;
		this.power = power;
		this.level = level;
		this.name = name;
	}
	void printData() {
		System.out.print(health + " ");
		System.out.print(power + " ");
		System.out.print(level + " ");
		System.out.print(name + " ");
		System.out.println();
	}
}

class Player extends Unit{
	Player(){
		
	}
	Player(int health, int power, int level , String name){
		super(health , power, level, name);
	}
}
class Wolf extends Unit{
	Wolf(){
		
	}
	Wolf(int health, int power, int level , String name){
		super(health , power, level, name);
	}	
}
class Bat extends Unit{}
class Tiger extends Unit{}

public class B0802개념03_super생성자 {
	public static void main(String[] args) {
		Player p = new Player(100, 10, 1 , "용사");
		p.printData();
		
		
		Wolf w = new Wolf(30, 3, 1 , "늑대");
		w.printData();
	}
}
