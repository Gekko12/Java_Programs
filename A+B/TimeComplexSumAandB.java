/*
                                    Problem Description

     Given a series of integer pairs A and B, output the sum of A and B.

Input Format:-
Each line contains two integers,A and B. One input file may contain several pairs P where 0 <= P <=12 .

Output Format:-
Output a single integer per line - The sum of A and B.

Constraints:-
0 <= A,B <= 10^98  //It's too big

 */
import java.util.*;

public class TimeComplexSumAandB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	       while(sc.hasNext()){
		        String A = sc.next(); //We can also perform this using BigInteger class easily
		        String B = sc.next();
		        
		        StringBuffer aA = new StringBuffer(A);
		        StringBuffer bB = new StringBuffer(B);
	
		        int a_length = A.length();
		        int b_length = B.length();
		        int result_len = Math.max(a_length, b_length) + 1;
		        
	        	int how_much = result_len - a_length; //To insert 0 at the beginning
	        	for(int i=0;i<how_much;i++)
	        		aA.insert(0,"0"); 
	        	A = aA.toString();
	        	
	        	how_much = result_len - b_length;
	        	for(int i=0;i<how_much;i++)
	        		bB.insert(0,"0");
	        	B = bB.toString();
		       
	           char Aary[] = A.toCharArray();
	           char Bary[] = B.toCharArray();
	           int carry = 0;
		       Deque <Integer> result = new LinkedList<Integer>();
		       
		       for(int i=result_len-1;i>0;i--) {
		    	   int ia = Aary[i]-'0'; //To convert it into num
		    	   int ib = Bary[i]-'0';
		    	   
		    	   int sum = ia+ib+carry;
		    	   if(sum > 9)
		    		   carry = 1;
		    	   else
		    		   carry = 0;
		    	   int digi = sum%10;
		    	   result.addLast(digi);
		       }
		       if(carry > 0)
		    	   System.out.print(carry);
		       
		       try {
		       for(int i=0;i<result_len-1;i++)
		    	   System.out.print(result.removeLast());
		       }catch(NoSuchElementException e) {
		    	   
		       }
		       System.out.println();
		       sc.close();
	       }
	}

}
