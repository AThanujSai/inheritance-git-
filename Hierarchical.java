package inheritance;
class H1{
	int a=1000000, b=9999;
	
	void add() {
		System.out.println("Add is: " + (a+b));
	}
}

class H2 extends H1{
	void sub() {
		System.out.println("Sub is: " + (a-b));
	}

}

class H3 extends H1{
	int a=3, b=2;
	void mul() {
		System.out.println("Mul is: " + (a*b));
	}
}


public class Hierarchical {
	public static void main(String[] args) {
		H2 h1 = new H2();
		h1.sub();
		h1.add();
		System.out.println("*********************************************");
		H3 h2 = new H3();
		h2.mul();
		h2.add();
	}

}
