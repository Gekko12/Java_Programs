/*    Program to demonstrate the working of Package using Terminal
       Date:-  13.05.2020
*/

 package FirstPackage;
  
 public class Balance{
 String name;
 double amt;
 
 public Balance(String name,double amt){
 this.name = name;
 this.amt = amt;
 System.out.println(" Inside the parameterized constructor of Balance class........\n");
 }
 
 public void show(){
 System.out.println("Name :"+name+"  "+"Amount :"+amt);
 }
 }

