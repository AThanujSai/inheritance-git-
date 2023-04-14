 package inheritance; 

interface I1{
	int x=100;
	
	void add();
	
	void sub();
}

interface I2{
	float y=200;
	
	void mul();
	
	void div();
}

class C1 implements I1, I2{

	@Override
	public void mul() {
		System.out.println("Mul is: " + (x*y));
		
	}

	@Override
	public void div() {
		System.out.println("Div is: " + (x/y));
		
	}

	@Override
	public void add() {
		System.out.println("Add is: " + (x+y));
		
	}

	@Override
	public void sub() {
		System.out.println("Sub is: " + (x-y));
	    
		
	}
	
	
}


	
public class Multiple {
	public static void main(String[] args) {
		C1 obj = new C1();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
	}

}
