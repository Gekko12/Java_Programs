class RunDemo extends Thread{
	Thread obj1 = new Thread();
	RunDemo(){
		obj1 = new Thread(this,"Child");
		// obj1 = new Thread(); This will not work
		System.out.println(obj1);
		obj1.start();
	}
	
	public void run(int time) {//This is not invoked by start() method as run() method doesn't have parameter list
		try {
			for(int i=5; i>0; i--) {
				System.out.println("Our run() call "+i);
				Thread.sleep(time);
			  }
			}catch(InterruptedException e) {
				System.out.println("Our run() call interrupted :"+e);
			}
		System.out.println("Exiting Our run() ....");
		}
	 public void run() {//This is invoked by start() method
		System.out.println("It's our run() method........");
	}
}
 class ExperiThread {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RunDemo obj = new RunDemo();
		System.out.println("In main thread....");
		obj.run(1000);
		System.out.println("After our's run() method..");
	}

}
