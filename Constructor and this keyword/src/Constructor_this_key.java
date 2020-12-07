/*
 * Program to demonstrate the use of constructor and this keyword
 * Date:- 01.05.2020
 */
import java.util.Scanner;
class RectArea{
	
	int length;                               //             <--------------------------------------------------------------
	int breadth;                              //                                                                           |
	                                          //                                                                           |          
	RectArea(int l,int b){                    //                                                                           |
		length = l;                           //                                                                          |||
		breadth = b;                          //                                                                          |||
		System.out.println("Control...Inside the parameterizeed constructor...L= "+length+" B= "+breadth+"\n");  //       |||
	}                                                                         //                                           |
	                                                                                      //                               |
    int Area(int length,int breadth){    //                                                                                |
    	System.out.println("Control...Inside the Area() method.at starting..L= "+length+" B= "+breadth+"\n"); //           |
		length = this.length ; //this.length refers to the instance variable not the local variable ie. invoking object <---
		breadth = this.breadth ;
		System.out.println("Control...Inside the Area() method..at ending.L= "+length+" B= "+breadth+"\n");
        return (length*breadth);	
    }
}

public class Constructor_this_key {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length , breadth ;
		
		System.out.println("Input length and breadth of Rectangle :");
		length = sc.nextInt();
		breadth = sc.nextInt();
		
		RectArea obj = new RectArea(length,breadth);//Whatever value we supplied here that's going to print
		//Observe the next line carefully and what's going to print whether 2*3=6 or user given calculated area
		System.out.println("Area = " + obj.Area(2 ,3));
		sc.close();
	}
}
