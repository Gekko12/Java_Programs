// Program to demonstrate the basic methods of Thread class

public class CurrentThreadDemo {

	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println("Current Thread :"+t); // Thread[name,priority,thread group]
		
		 /* Thread to = Thread.currentThread();
		    System.out.println("Current Thread :"+t);
		     This also works
		 */
		t.setName("MyFirstThread"); //To change the name of default thread
		t.setPriority(2); //To change priority from default 5 to 2
		
				
		System.out.println("After change :"+t);
		System.out.println("getName() :"+t.getName());
		System.out.println("getPriority() :"+t.getPriority());

	}

}
