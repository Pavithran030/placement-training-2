import java.util.*;
import java.io.*;



class Solution{
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                
                //user written starts
                
                if(x>=-128 && x<=127)System.out.println("* byte");
                
                if(x>=-32768 && x<=32767)System.out.println("* short");
                
                if(x>= Math.pow(-2,31) && x<=Math.pow(2,31)-1)System.out.println("* int");
                
                if(x>=Math.pow(-2,63) && x<=Math.pow(2,63)-1)System.out.println("* long");
                
                if(x>=-1.4e-45 && x<= (1.4e-45)-1)System.out.println("* float");
                
                if(x>=-4.9e-324 && x<=(4.9e-324)-1)System.out.println("* double");
                
                if(x>='\uffff' && x<='\u0000')System.out.println("* char");
                
                //end
                            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}



