//Program to create a thread using Runnable interface

class NewThread implements Runnable{
	Thread obj1;
	
	NewThread(){
		obj1 = new Thread(this,"Child 1");
		// obj1 = new Thread(); This will not work
		System.out.println(obj1);
		obj1.start();
	}
	
	public void run() {
		try {
			for(int i=5; i>0; i--) {
				System.out.println("Child Thread "+i);
				Thread.sleep(500);
			  }
			}catch(InterruptedException e) {
				System.out.println("Child Thread Interrupted :"+e);
			}
		System.out.println("Exiting Child thread....");
		}
}
public class RunnableInterface {
	public static void main(String[] args) {
		new NewThread();
		
		try {
			for(int i=5; i>0; i--) {
				System.out.println("Main Thread "+i);
				Thread.sleep(1000);
			  }
			}catch(InterruptedException e) {
				System.out.println("Main Thread Interrupted :"+e);
			}
		System.out.println("Exiting Main thread....");
		}
	}

