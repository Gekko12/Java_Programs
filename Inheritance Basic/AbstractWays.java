/*
 * Program to demonstrate the use of abstract class and methods
 * Date- 03.05.2020
 */
abstract class Figure{
	//There would be no abstract constructors
	Figure(){
		System.out.println("Default construct of Figure");
	}
	//Abstract methods only require prototypein superclass
	abstract void area();
	void show() {
		//This show() cann't be access by any subclass
		//We can define non abstract methods in abstract class
		System.out.println("Non abstract methods in Abstract class");
	}
}
class Rect extends Figure{
	int length , breadth;
	Rect(int len ,int bre){
		length = len;
		breadth = bre;
	}
	//It's necessary to define abstract methods of superclass
	void area() {
		System.out.println("Area of Rectangle = "+ (length * breadth));
	}
}
public class AbstractWays {
	public static void main(String[] args) {
		Rect objr = new Rect(5,10);
		objr.area();
		objr.show();
		
	//	Figure ob = new Figure(); We cann't instantiate Abstract class

	}
}
