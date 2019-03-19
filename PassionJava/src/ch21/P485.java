package ch21;
class Apple3{
	public String toString() {
		return "I am an Apple";
	}
}

class Orange3{
	public String toString() {
		return "I am an Orange";
	}
}

class Box2{
	private Object ob;
	
	public void set(Object o) {
		ob = o;
	}
	
	public Object get() {
		return ob;
	}
}
public class P485 {	
	public static void main(String[] args) {
		Box2 aBox = new Box2();
		Box2 oBox = new Box2();
		
		aBox.set("Apple");
		oBox.set("Orange");
		
		System.out.println(aBox.get());
		System.out.println(oBox.get());
	}
}
