/* Program to demonstrate the use interface 
 * Date:- 13.05.2020
 */

interface SetInit{
	double basic_invest = 100.0 ; //Can be used as #define in c/c++ ,these values are not going to change as they'r final
	double inst = 0.15 ; //Interest rate
	
	void showData();
}

class Account implements SetInit{
	String name;
	double princ;
	int time , accno;
	double si = 0.00;
	
	Account(int accno,String na,double p,int t){
		this.accno = accno;
		name = na;
		princ = p;
		time = t;
	}
	
	boolean si() {
		if(princ <= basic_invest)
			return false ;
		else {
			si = princ * inst * time ;
			return true ;
		}
	}
	
	public void showData() {
		System.out.println("Account number :"+accno);
		if(!si()) {
			System.out.println("Principal is low to open the account......");
		}
		System.out.println("Name :"+name);
		System.out.println("Principal :"+princ);
		System.out.println("Simple Interest :"+si);
		System.out.println("Total amount after "+time+" years :"+(si+princ)+"\n");
	}
}
public class InterDemo {
	public static void main(String[] args) {
      Account obj1 = new Account(1248,"Gaurav Sharma",50.0,5);
      Account obj2 = new Account(9567,"Richy Rich",5000.0,3);
      Account obj3 = new Account(1248,"Common Man",2000,2);

     obj1.showData();
     
     obj2.showData();
     
     obj3.showData();
	}

}
