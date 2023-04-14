package inheritance;

class One{
	int a=111;
	int x=1;
	
	public One() {
		System.out.println("one class constr ");
	}
	
}

class Two extends One{
	int b=222;
	int x=2;
	
	void addition() {
		System.out.println("add " + (b + a));
	}
	
}

class Three extends Two{
	int c=333;
	int x=3;
	
	void division() {
		System.out.println("div1 " + (c/b));
		System.out.println("div2 " + (c/a));
	}
}

class Four extends Three{
	int d=444;
	int x=4;
	
	void subtraction() {
		System.out.println("sub1 " + (d-c-b-a));
		
	}
	
	void show() {
		System.out.println(super.x);
	}
			
}

public class Multilevel {
	public static void main(String[] args) {
		Four obj = new Four();
		obj.subtraction();
		obj.show();
		obj.division();
		obj.addition();
	}

}
