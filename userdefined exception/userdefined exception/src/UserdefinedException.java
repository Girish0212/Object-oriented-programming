
import java.util.Scanner;

class MyException extends Exception
{
    public String toString() {
        System.out.println("error occured");
        return ("The string length is greater");
        
    }

   
}

        
        

public class UserdefinedException 
{
    
    public static void main(String args[]) throws MyException {
        String str1;
        Scanner input =new Scanner(System.in);
        System.out.println("enter the string");
        str1=input.nextLine();
        try
        {
          int a=str1.length();
           if(a>10)
      {
          throw new MyException();
    }      else
           {
               System.out.println("The Enterted String is valid");
           }
          
        }
        catch(MyException exp)
                {
                    System.out.println(exp);
                   
                } 
    }   

}
