import FirstPackage.Balance ;
class PackUse{
public static void main(String args[]){
 Balance obj[] = new Balance[3];
 
 obj[0] = new Balance("Gaurav",2020);
 obj[1] = new Balance("Nobody",102);
 obj[2] = new Balance("Somebody",2048.124);       
 
 for(int i = 0 ; i <3 ; i++)
    obj[i].show();
    }
  }

