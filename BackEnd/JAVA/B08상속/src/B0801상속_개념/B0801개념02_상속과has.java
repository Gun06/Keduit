package B0801상속_개념;

class AAAAA{
	int x;
	int y;
}

class BBBBB{
	AAAAA a = new AAAAA();
}

class CCCCC{
	BBBBB b = new BBBBB();
}

class DDDDD{
	CCCCC c =new CCCCC();
}

class EE{
	int x;
	int y;
}
class FF extends EE{}
class GG extends FF{}
class KK extends GG{}

public class B0801개념02_상속과has {	
	public static void main(String[] args) {
		
		DDDDD d =new DDDDD();
		d.c.b.a.x = 10;
		
		KK k = new KK();
		k.x = 10;
		
	}
}
