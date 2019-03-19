package ch21;

class Apple2{
	public String toString() {
		return "I am an apple";
	}
}

class Orange2{
	public String toString() {
		return "I am an Orange";
	}
}

class Box1{
	private Object ob;
	
	public void set(Object o) {
		ob = o;
	}
	
	public Object get() {
		return ob;
	}
}

public class P484 {
	public static void main(String[] args) {
		Box1 aBox = new Box1();
		Box1 oBox = new Box1();
		
		aBox.set("Apple");
		oBox.set("Orange");
		
		Apple2 ap = (Apple2)aBox.get();
		Orange2 og = (Orange2)oBox.get();
		
		System.out.println(ap);
		System.out.println(og);
	}
	
	
}
