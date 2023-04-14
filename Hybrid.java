package inheritance;

class HY1{
	int d=34,e=43;
	
	void add(){
		System.out.println("Addition: " + (d+e));
	}
}

class HY2 extends HY1{
	float b=21, c=12;
	
	void div() {
		System.out.println("Division: " + (b/c));
	}
}

class HY3 extends HY2{
	float a=76.32f, z=23.98f;
	
	void sub() {
		System.out.println("Subtraction: " + (a-z));
	}
}

class HY4 extends HY3{
	
	void mul(int x,int z) {
		System.out.println("Multiplication: " + (x*z));
	}
}

class HY5 extends HY3{
	
	void rem() {
		System.out.println("Reminder: " + (a%z));
	}
}

public class Hybrid {
	public static void main(String[] args) {
		
		HY4 h1 = new HY4();
		HY5 h2 = new HY5();
		h1.mul(456, 654);
		h1.add();
		h1.sub();
		h1.div();
		h2.rem();
		
		
		
	}

}
