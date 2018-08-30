
package testproject;

import java.io.*;

class GCD
{
//    Iterative method won't compute GCD if number is negative
    int computeGCD_Iterative(int num1, int num2)
    {
        if(num1==0)
            return num2;
        else if(num2==0)
            return num1;
        else
        {
            int minNum = num1<num2?num1:num2;
            int gcd=1;

            for(int i=2;i<=minNum;i++)
            {
                if(num1%i==0 && num2%i==0)
                {
                    gcd = i;
                }
            }
            return gcd;
        }
    }

//    Recursive method will compute GCD if number is negative    
    int computeGCD_Recursive(int num1, int num2)
    {  
        if (num2 == 0)
        {
            return num1;
        }
        return computeGCD_Recursive(num2, num1%num2);
    }
    
//    Subtraction method will compute GCD if number is negative
    int computeGCD_SubtractionMethod(int num1, int num2)
    {
        if(num1==0)
            return num2;
        else if(num2==0)
            return num1;
        else
        {
            num1 = (num1<0)?-num1:num1;
            num2 = (num2<0)?-num2:num2;
            int minNum = (num1<num2)?num1:num2;
            
            while(num1!=num2)
            {
                if(num1>num2)
                    num1 = num1 - num2;
                else
                    num2 = num2 - num1;
            }
            
            return num1;
        }
    }
    
}

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buffObj = new BufferedReader(new InputStreamReader(System.in));
        
        GCD gcdObj = new GCD();
        
        int num1 = Integer.parseInt(buffObj.readLine());
        int num2 = Integer.parseInt(buffObj.readLine());
        
//        Will Calculate GCD of Negative numbers
        int result = gcdObj.computeGCD_Recursive(num1, num2);

//        Won't Calculate GCD of Negative numbers
//        int result = gcdObj.computeGCD_Iterative(num1, num2);

//        Subtraction method
//        int  result = gcdObj.computeGCD_SubtractionMethod(num1, num2);

//        int lcm = (num1*num2)/result;
        
        System.out.println(result);
        
    }
}