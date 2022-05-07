package lession1Demo;

class Car{
	String Model;
	String Brand;
	int Rel_year;
	int cost;
	
	//method for differant behaviors
	public void Top_speed() {
		System.out.println("This model gives 300km/hr. of top speed");
	}
	
	public void Average() {
		System.out.println("Average fuel efficiency is 1000km/full charge");
	}
	
	public void Top_speed1() {
		System.out.println("This model gives 350km/hr. of top speed");
	}
	
	public void Average1() {
		System.out.println("Average fuel efficiency is 7km/lit");
	}
	
	
}

public class CarDemo {
	
	public static void main (String args[]) {
	
	//object first	
	Car d = new Car();
	d.Model = "Model-X";
	d.Brand = "Tesla";
	d.Rel_year = 2017;
	d.cost = 3500000;
	
	System.out.println("Model of the car: " + d.Model);
	System.out.println("Brand: " + d.Brand);
	System.out.println("Luanch year: " + d.Rel_year);
	System.out.println("Cost of the car: " + d.cost);
	d.Top_speed();
	d.Average();
	
//	object second
	Car c = new Car();
	c.Model = "Gt-R";
	c.Brand = "Audi";
	c.Rel_year = 2015;
	c.cost = 25000000;
	
	System.out.println("Model of the car: " + c.Model);
	System.out.println("Brand: " + c.Brand);
	System.out.println("Luanch year: " + c.Rel_year);
	System.out.println("Cost of the car: " + c.cost);
	c.Top_speed1();
	c.Average1	();
		
		}

}
