import java.io.*;

public class Reading_char {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out ,true); //This can be used for O/P
		
		char ch;
		System.out.println("Input character 'q' to stop :");
		
		do{
			ch = (char)br.read();
			pw.println(ch);
		}while(ch!='q');
		
	}

}
