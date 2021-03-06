/*
    1. Read a file "encrypt.txt"
    2. I/P the key (Use sum of digits as a key) from user
    3. Decrement the characters of I/P file by key
    4. Print the decrypted text into the "decypt.txt" file
 */

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.io.File;
import java.util.LinkedList;

public class Decrypt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key , digi , end , start , i;
		key = i = start = 0;
		System.out.println("Enter the key for decryption :");
		int temp = sc.nextInt();
		while(temp!=0) {
			digi = temp % 10;
			key += digi ;
			temp /= 10;
		}
		
		File fi = new File("encrypt.txt");
		try {
			Scanner fsc = new Scanner(fi);
			String st = fsc.next();
			end = st.length(); // To return string length
			char buf[] = new char[end - start];
			st.getChars(start, end, buf, 0); // To convert String into array of char []
			
			try {
				Formatter f = new Formatter("decrypt.txt");
				for(char ch : buf) // For-each loop
					f.format("%c", (ch - key));
				f.close();
			}catch(FileNotFoundException e) {
				System.out.println("Error :"+e);
			}
			
		}catch(FileNotFoundException e) {
			System.out.println("Error :"+e);
		}
		
	}

}
