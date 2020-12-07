/*
    1. Create a file "encrypt.txt"
    2. I/P a text to be encrypted
    3. I/P the key (Use sum of digits as a key)
    4. Increment the characters of I/Ped text by key
    5. Print the encrypted text into the "encypt.txt" file
 */

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.Formatter;
//import java.io.File;
//import java.util.LinkedList;

public class Encrypt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key , digi , start , end ;
		key = digi = start = end = 0;
		
		System.out.println("Enter the key for encryption :");
		int temp = sc.nextInt();
		while(temp!=0) {
			digi = temp % 10;
			key += digi ;
			temp /= 10;
		}
		
		System.out.println("Enter the text for encryption :");
	    String s = sc.next();
		end = s.length(); // To return string length
		char buf[] = new char[end - start];
		s.getChars(start, end, buf, 0); // To convert String into array of char [] 
		
		
		try {
			Formatter f = new Formatter("encrypt.txt");
			for(char ch : buf) // For-each loop
				f.format("%c", (ch + key));
			f.close();
		}catch(FileNotFoundException e) {
			System.out.println("Error :"+e);
		}

	}

}
