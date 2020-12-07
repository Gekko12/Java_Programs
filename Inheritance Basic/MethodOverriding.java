/*
 * Program to demonstrate the use of method overriding and overloading
 * Date- 03.05.2020
 */
class Adv{
	int i=5;
	Adv(){//Default constructor is compulsory in super class
		System.out.println("Sequence of constructor called"+"\n"+"Constructor AdV called........");

		i = -1;
	}
	Adv(int a){
		i = a;
		System.out.println("Constructor Adv first called......");
	}
	void show() {
		System.out.println("Inside Adv , i = "+i);
	}
}
class Dv extends Adv{//This is Multilevel inheritance (Multiple inheritance doesn't support in JAVA)
	int i;
	Dv(){//Neseccary as it acts as superclass for class EndsAdv
		i = -2;
	}
	Dv(int i){
		this.i = i;
		System.out.println("Constructor Dv called.....");
	}
	void show() {//Method overriding (it hides the show() of class Adv)
	System.out.println("Inside Dv , i = "+i);
    }
}	
class V extends Adv{//This is Hierarichal inheritance 
	int k;
	V(int kref){
		k = kref;
		System.out.println("Constructor V called........");
	}
	void show(String msg) {// This is method overloading as signature differs from super class
		super.show();// To call show() of Adv
		System.out.println(msg+ " "+ k);
	}
}
class EndsAdv extends Dv{
	int k , l;
	EndsAdv(int kref,int lref,int iref){
		super(iref);
		k = kref;
		l = lref;
		System.out.println("Constructor EndsAdv called.....");

	}
	void show() {//Method overriding
		super.show();//To call show of Dv
		System.out.println("Inside EndsAdv , k = "+k+" , l = "+l);
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		V objv = new V(10);
		objv.show("Message , Inside V k = ");
		System.out.println("\n\n");
		
		EndsAdv obje = new EndsAdv(2,3,4);
		obje.show();
   // Constructors are called from superclass to subclass //
	}
}
