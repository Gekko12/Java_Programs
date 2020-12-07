//Program to demonstrate the multilevel interface using extends keyword

interface A{
	void meth1();
}

interface B extends A{
	void meth2();
	void meth3();
}

class Demo implements B{ // DEmo class should and must implement all the methods inherited from A and B interface
	public  void meth1() {
		System.out.println("Method 1 imlemented");
	}
	public  void meth2() {
		System.out.println("Method 2 imlemented");
	}
	public  void meth3() {
		System.out.println("Method 3 imlemented");
	}
}
public class Multilevel_Interfacae {

	public static void main(String[] args) {
		Demo obj = new Demo();
		
		obj.meth1();
		obj.meth2();
		obj.meth3();

	}

}
