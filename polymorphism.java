package inheritance;

class Animals{
	void sound() {
		System.out.println("Animals make sound...");
	}
	
	void color() {
		System.out.println("My pet color is black..");
	}
}

class Cat extends Animals{
	//overload
	void sound(String m) {
		System.out.println("cats make: " + m);
	}
	
	//override
	void color() {
		System.out.println("My pet color is white..");
		
	}
}

public class polymorphism {
	public static void main(String[] args) {
		Cat obj = new Cat();
		obj.sound();
		obj.sound("Meow");
		obj.color();
		
	}
	
	
	
	
	

}
