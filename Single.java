package inheritance;

//super or parent or base
class First {
	int a=100, b=20;
	int x = 1000;
	
	public First() {		
	System.out.println("Super Class Constr...");
    }
	
	void addition() {
		System.out.println("add is: " + (a + b));
		
	}
	
	void subtraction() {
		System.out.println("sub is: " + (a - b));
	}
}

//sub or child or derived
class Second extends First{
	int a=100, b=20;
	int x=2000;
	
	public Second() {
		System.out.println("sub class constr......");
	}
	
	void multiplication() {
		System.out.println("mul is: " + (a*b));
	}
	
	void division() {
		System.out.println("div is: " + (a/b));
	}
	
	void show() {
		System.out.println(this.x);
		System.out.println(super.x);
	}
	
}



public class Single {
	public static void main(String[] args) {
		Second sec = new Second();
		sec.addition();
		sec.division();
		sec.subtraction();
		sec.multiplication();
		sec.show();
	}

}
