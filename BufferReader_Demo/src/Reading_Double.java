import java.io.*;
public class Reading_Double {
	public static void main(String[] arguments)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out,true);
		
		pw.println("Enter a floating point number :"); //Eg. 25e5 ie. 25*10^5
		String str = br.readLine();
		
		double d = Double.parseDouble(str);
		
		pw.println("Double value :"+d);
	}
}
