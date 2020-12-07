/*
 * Program to demonstrate the use of super() for private member access
 */
class Box{
	float len,bre;
	private float height ; //Private member to show the use of super()
	Box(){ //Default constructor
		len = bre = height = -1;
	}
	Box(float l,float b,float h){
		//Parameterized constructor
		len = l;
		bre = b;
		height = h;
	}
	//Constructor clone of a object
	Box(Box obj){
		//Constructor passes object
		len = obj.len;
		bre = obj.bre;
		height = obj.height;
	}
	Box(float side){//Constructor for Cube
		bre = len = height = side;
	}
	float volume() {
		return (len*bre*height);
	}
}

class Boxweight extends Box{
	float weight;
	Boxweight(){//Default constructor
		super(); // super() to access private members
		weight = -1;
	}
	Boxweight(float wt,float l,float b,float h){
		//Parameterized constructor
		super(l,b,h);
		weight = wt;
	}
	Boxweight(float wt,float side){
		//For cube
		super(side);
		weight = wt;
	}
	Boxweight(Boxweight subobj){
		super(subobj);
		weight = subobj.weight;
	}
}

public class Super_use {

	public static void main(String[] args) {
      
		Boxweight bw1 = new Boxweight();//Default
		Boxweight bw2 = new Boxweight(92.5f,2,3,4);//Parameterized
		Boxweight bw3 = new Boxweight(80.97f,5);//Cube
		Boxweight bw4 = new Boxweight(bw2);//object pass

		System.out.println("Volume obj1 = "+bw1.volume());
		System.out.println("Weight wt1 = "+bw1.weight+"\n");
		
		System.out.println("Volume obj2 = "+bw2.volume());
		System.out.println("Weight wt2 = "+bw2.weight+"\n");
		
		System.out.println("Volume obj3 = "+bw3.volume());
		System.out.println("Weight wt3 = "+bw3.weight+"\n");
		
		System.out.println("Volume obj4 = "+bw4.volume());
		System.out.println("Weight wt4 = "+bw4.weight+"\n");
	}

}
