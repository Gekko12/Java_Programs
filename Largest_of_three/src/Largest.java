import java.util.Scanner; 
public class Largest {
	
	public static void main(String args[])
	{
		System.out.println("Enter three numbers :");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		
		if(a>=b && a>=c)
			System.out.println("Largest number is "+a+"\n");
		else if(b>=c && b>=a)
            System.out.println("Largest number is "+b+"\n");		
		else
			System.out.println("Largest number is "+c+"\n");
		sc.close();
	}
	

}
