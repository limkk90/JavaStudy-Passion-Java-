package ch21;

class Apple{
	public String toString() {
		return "i am an apple";
	}
}

class Orange{
	public String toString() {
		return "i am an orange";
	}
}

class AppleBox{
	private Apple ap;
	
	public void set(Apple a) {
		ap = a;
	}
	
	public Apple get() {
		return ap;
	}
}

class OrangeBox{
	private Orange or;
	
	public void set(Orange o) {
		or = o;
	}
	
	public Orange get() {
		return or;
	}
}

public class P481 {
	public static void main(String[] args) {
		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();
		
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		Apple ap = aBox.get();
		Orange og = oBox.get();
		
		System.out.println(ap);
		System.out.println(og);
	}
}
