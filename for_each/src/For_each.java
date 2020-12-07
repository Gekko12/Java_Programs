import java.util.Scanner ;
public class For_each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int n = sc.nextInt();
		int sum =0 ;
		int ary[] = new int[n];
		System.out.println("Enter the array elements :");
		for(int i=0;i<ary.length;i++)  
		{
			ary[i] = sc.nextInt();
		}//If we use for-each above , then there is logical error
		
		for(int i : ary) //For-each loop , i value will 
			            // be the next element in the array
		{		
			System.out.println("Value of i is :" +i);
		    sum += i;
		}
		System.out.println("Sum of numbers = "+ sum );
		sc.close();
	}

}
