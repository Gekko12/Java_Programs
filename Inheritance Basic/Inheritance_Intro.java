/*
 * Program to demonstrate the Inheritance concepts
 * Date- 02.05.2020
 */
class A{
	 int l ;
	A(){
		l = -1;  //When we'r implicit defining a constructor , it's compulsory to define a default constructor in superclass
	}
	A(int l){
		this.l = l;
	}
	void show() {
		System.out.println("A's l value using super = "+l+"\n");
	}
	
}
class B extends A{
	int n;
	
}
class C extends B{
	int p,q;
	C(int pr,int qr,int nr,int lr){
		p = pr;
		q = qr;
		n = nr; // B's n value
		l = lr; // A's l value
	}
	void show() {
		System.out.println("C's p value = "+p+"\n");
		System.out.println("C's q value = "+q+"\n");
		System.out.println("B's n value = "+n+"\n");
		super.show();
	}
}
public class Inheritance_Intro {
	public static void main(String[] args) {
		C objc = new C(2,3,4,5);
		objc.show();
		
		
	}

}
