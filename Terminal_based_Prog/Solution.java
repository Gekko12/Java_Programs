import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    
    // Write your constructor here
    
    Student(String first,String last,int id,int[] testScores){
        super(first,last,id);
        this.testScores=testScores;
    }

    // Write your method here
    char calculate(){
            int sum = 0 , avg , size;
            for(int i=0;i<testScores.length;i++)
             sum += testScores[i];

            size = testScores.length;
            avg = sum / size ;

            if(avg>=90 && avg<=100)
             return 'O';
            else if(avg>=80 && avg<90)
             return 'E';
            else if(avg>=70 && avg<80)
             return 'A';
            else if(avg>=55 && avg<70)
             return 'P';
            else if(avg>=40 && avg<55)
             return 'D';
            else
             return 'T';     
        }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}
