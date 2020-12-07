/*
 * Program to demonstrate stack operations push() and pop()
 */
import java.util.*;
class Stack{
	int size , top;
	int ary[] = new int[10];
    
	Stack(int size) { //Parameterized constructor to initialize size and top
		this.size = size;
		top = -1;
	}
	void push(int item) {
		if(top >= size-1)
			System.out.println("Overflow.......");
		else 
		   ary[++top] = item;
	}
	int pop() {
		if(top == -1)
			{
			System.out.println("Underflow........");
			return -9999;
			}
		else
		  return ary[top--];
	}
	void display() {
		System.out.println("Stack-");
		for(int i = top ; i >= 0 ; i-- )
			System.out.println("ary["+i+"] = "+ary[i]+"\n");
	}
}
public class StackDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of stack :");
		int sz = sc.nextInt();
		Stack stk = new Stack(sz);
		
		for(;;) {
			System.out.println("Enter the choice :- \n 1.Push \n 2.Pop \n 3.Display \n 4.Exit");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter the item to be pushed");
			int item = sc.nextInt();
			stk.push(item);
			break;
		case 2:
			System.out.println("Pop item = "+ stk.pop());
			break;
		case 3:
			stk.display();
			break;
		case 4:
			System.out.println("Aborting............");
			return ;
		default : System.out.println("Wrong insertion...........");	
		          
		}
		sc.close();
	  }
	}

}
