import java.util.*;
public class PascalTri {
	
	public static void main(String args[]) {
		
		Scanner obj = new Scanner(System.in);
		int rows,i,j,k;
		
		System.out.println("Enter number of rows :");
		rows = obj.nextInt();
		
		for(i=0;i<rows;i++) {
			for(j=0;j<rows-i;j++)
				System.out.print(" ");
			
			for(k=0;k<=i;k++)
				System.out.print(nCr(i,k)+" ");
			
			System.out.println();
		}
	}
	
	public static int factorial(int num) {
		if(num==0 || num==1)
			return 1;
		return num*factorial(num-1);
	}
	
	public static int nCr(int n,int r) {
		int p = factorial(n);
		int q = factorial(r);
		int s = factorial(n-r);
		return (p/(q*s));
	}

}
