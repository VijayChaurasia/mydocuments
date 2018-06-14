import java.util.Scanner;

import java.util.Random;

class Dice

 {
    
    int sides;

    Dice(int x)

    {
        
      sides=x;

    }
    
    String rolldice()

    {
        
       String ans;

       Random rand=new Random();

       if(sides==6)

        {
          
          ans=Integer.toString(rand.nextInt(sides)+1);
  
          return ans;
   
        }
      
       else if(sides==4)
    
        {
          
          ans=Integer.toString(rand.nextInt(sides)+1);
   
          return ans;
    
        }
       
       else if(sides==2)
     
        {
    
          String arr[]={"Heads","Tails"};
      
          int i=rand.nextInt(arr.length);
     
          ans=arr[i];
     
          return ans;
      
        }
      
       else 
     
        {
      
           System.out.println("wrong input");
 
           return null;
   
        }
        
        

    }
  
  
 }


public class Z
   
  {


     public static void main(String []args)
 
     {
    
       System.out.println("enter no. of sides");
 
       int side;
 
       Scanner sc=new Scanner(System.in);
 
       side=sc.nextInt();
     
       Dice d1=new Dice(side);
  
       System.out.println(d1.rolldice());
     
  
    }

}