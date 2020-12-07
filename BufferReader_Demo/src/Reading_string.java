import java.io.*;
public class Reading_string {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out ,true);
		
		String[] str = new String[10]; //Array of string
		pw.println("Enter the strings 'stop' to quit :");
		
		for(int i=0;i<10;i++) {
			str[i]=br.readLine();
			if(str[i].equals("stop")) break;
		}
		
		for(String i:str)
			System.out.println(i);
	}
}
