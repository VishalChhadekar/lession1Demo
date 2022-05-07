package lession1Demo;

class AccessModifier{
	int a; //default can be visible in class but in same package
	public String name; //public is visible anywhere in project
	protected char c;
	private String address; //private is visible only in this class, to access it, in main 
	//method of main class, we have to use getter and setter method.
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	
}

public class AccessModifierDemo {
	public static void main(String args[]) {
		AccessModifier  obj = new AccessModifier();
		obj.a = 10;
		obj.name = "sample";
		obj.c = 'A';
		obj.setAddress("You will find road");
		System.out.println(obj.a);
		System.out.println(obj.name);
		System.out.println(obj.c);
		System.out.println(obj.getAddress());
		
	}

}
