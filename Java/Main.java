
package testproject;

import java.io.*;

class Factorial
{
    private int fact=1;
    
    public int computeFactorial(int number)
    {
        if(number==0 || number==1)
        {
            return 1;
        }
        else
        {
            for(int i=number;i>0;i--)
            {
                fact = i * fact;
            }
            
            return fact;
        }
    }
}

public class Main
{


    public static void main(String[] args) throws IOException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        int number;
        number = Integer.parseInt(input.readLine());
        
        
        Factorial factObj = new Factorial();
        int result = factObj.computeFactorial(number);
        System.out.println("Factorial = " + result);
    }
    
}
