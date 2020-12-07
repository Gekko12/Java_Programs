/*
 * Program to demonstrate the try,catch and final block
 */

public class Try_catch_final {

	static void demof() throws ArithmeticException{ //static keyword is necessary
		System.out.println("Inside method....");
		throw new ArithmeticException("It works");
	}
	public static void main(String[] args) {
			try {
				demof();
		}catch(ArithmeticException e) {
			System.out.println("Exception caught: "+ e);  //e prints It works
		}
		finally {
			System.out.println("In final block....");
		}

	}
}
