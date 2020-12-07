/*
   Program to demonstrate class fundamentals such as how to create class , objects , methods of class etc....
   Date:- 01.05.2020
 */

class Box{
	double height;
	double width , length ;
	
	double volume() {  // Method to return volume of Box
	 return (height * width * length) ;
	}
	
	void setData(double w , double h ,double l) {
		height = h;
		width = w;
		length = l;
	}
}      //No need for semicolon 

public class Class_Funda {
	public static void main(String []args) {
		
		Box mybox1;
		mybox1 = new Box(); // Use of new to dynamically allocate memory for instance(obj) of class Box
		
		//Another way to create obj of class
		Box mybox2 = new Box(); //Default constructor Box() used
		
		mybox1.setData(10 ,20 ,30);  //Call to methods
		mybox2.setData(5, 5, 5);
		
		System.out.println("Box 1 , Volume = " + mybox1.volume());
		System.out.println("Box 2 , Volume = " + mybox2.volume());
		

		
	}

}
