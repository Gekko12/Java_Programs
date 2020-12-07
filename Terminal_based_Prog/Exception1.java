/*
      Program for illustration of try and catch ie. Exception Handling 
      Date:-  30.04.2020
      
 */
     
     import  java.util.* ;
     class  Exception1{
     static void throwone()  throws IllegalAccessException {
       throw new IllegalAccessException("Wrong.......\t");
       }
       
       public static void main(String []args){
         try{
            throwone();
            }
          catch(IllegalAccessException e){
              System.out.println("\n_____" + e);
              }
              
         finally{
           System.out.println("...........Success............  8-) \n");
           }
          }
         }        
