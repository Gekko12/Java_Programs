/* Program to demonstrate the Random class methods, using entire java.util package which includes 
Date,Random,Scanner....etc  class
               public int nextInt(int bound)
   Parameters:
    bound - the upper bound (exclusive). Must be positive.
   Returns:
    the next pseudorandom, uniformly distributed int value 
    between zero (inclusive) and bound 
    (exclusive) from this random number generator's sequence
  Throws:
      IllegalArgumentException - if bound is not positive
  */
  
  import java.util.*;
  
  class RandomImport{
  public static void main(String[] args){
  
  Random ran = new Random();
  Date da = new Date();
  Scanner sc = new Scanner(System.in);
  
  System.out.println("\nCurrent Date :- "+da);
  System.out.println("\nEnter the upper bound for Random generator -");
  int upper = sc.nextInt();
  
  for(int i = 1; i <= 5; i++)
    System.out.println("Random number "+i+" generated = "+ran.nextInt(upper));
  
     }
  }
  
