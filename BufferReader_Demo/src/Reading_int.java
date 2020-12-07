import java.io.*;
public class Reading_int {
	public static void main(String[] args) throws IOException{ //BufferedReader throws I/O Exception
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out ,true);
		
		pw.println("Enter a number :");
		int i = Integer.parseInt(br.readLine());
		pw.println(i);
	}

}
