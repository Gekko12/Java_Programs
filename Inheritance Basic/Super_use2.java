
class ABC{
	int i ;
	ABC(){
		i = -1;
	}
	
	void showi() {
		System.out.println("A's i value = "+i+"\n");
	}
}
class BC extends ABC{
	int i ; // Integer i of B hides the i of A
	BC(int ia,int ib){
		i = ib;
		super.i = ia; //super refer to superclass A'i
	}
	void showi(){
		System.out.println("A's i value = "+super.i);
		System.out.println("B's i value = "+i);
	} 
}
public class Super_use2 {

	public static void main(String[] args) {
		BC obj = new BC(4,7);
		obj.showi(); // BC's super
		
	}

}
