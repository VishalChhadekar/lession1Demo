package lession1Demo;

public class TypeCasting {
	public static void main(String args[]) {
		//implicite type casting
		char a = 'A';
		System.out.println(a);
		int b = a;
		System.out.println(b);
		float c = a;
		System.out.println(c);
		
		//explicite type casting
		float f = 50.5f;
		int  m;
		m = (int)f;
		System.out.println(f);
		
		
	}

}

