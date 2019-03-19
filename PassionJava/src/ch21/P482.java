package ch21;

class Apple1{
	int app = 10;
	public String toString() {
		return "I am an apple";
	}
}

class Orange1{
	public String toString() {
		return "I am an Orange";
	}
}

class Box{
	Object obj;
	
	public void set(Object o) {
		obj = o;
	}
	
	public Object get() {
		return obj;
	}
}

public class P482 {
	public static void main(String[] args) {
		Box aBox = new Box();
		Box oBox = new Box();
		
		aBox.set(new Apple1());
		oBox.set(new Orange1());
		
		Apple1 ap = (Apple1) aBox.get();
		Orange1 og = (Orange1)oBox.get();
		
		System.out.println(ap);
		System.out.println(og);
	}
}
