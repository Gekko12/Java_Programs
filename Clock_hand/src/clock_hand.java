import java.util.*;
public class clock_hand {
	// ...........................= ABS(180 - ABS(180 -ABS(m*6 - (h*30 + m*0.5)))) 
	
	static double solution(int h ,int m)
	{
	  double sol = Math.abs(180 - Math.abs(180 - Math.abs(m*6 - (h*30 + m*0.5)))); //Formula to calculate the degree b/w hour and min hand
	  return sol;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str="" ,hh="" ,mm="" ;
		int t;
		t = sc.nextInt();
		while(t-- >0) {
			str = sc.next();
			StringTokenizer st = new StringTokenizer(str,":");
			while(st.hasMoreElements()) {
				hh = st.nextToken();
				mm = st.nextToken();
			}
			int h = Integer.parseInt(hh);
			int m = Integer.parseInt(mm);
			
			System.out.println((int)solution(h,m)+" degree");
		}
		sc.close();
	}

}
