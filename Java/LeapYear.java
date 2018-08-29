
package testproject;

import java.io.*;

class LeapYear
{
    boolean isLeapYear(int year)
    {
        if(year%100 == 0)
        {
            return year%400 == 0;
        }
        else
        {
            return year%4 == 0;
        }
    }
    
    int[] leapYears(int startYear, int endYear)
    {
        int[] leapYearArray = new int[endYear/4];
        int j=0;
        for(int i=startYear;i<=endYear;i++)
        {
            if(isLeapYear(i))
            {
                    leapYearArray[j++] = i;
            }
            else
            {
                continue;
            }   
        }
        return leapYearArray;
    }
}

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bufferedInput = new BufferedReader(new InputStreamReader(System.in));
        
        LeapYear leapYearObj = new LeapYear();
        
        int startYear = Integer.parseInt(bufferedInput.readLine());
        int endYear = Integer.parseInt(bufferedInput.readLine());
        
        int[] leapYearArray = leapYearObj.leapYears(startYear, endYear);
        int leapYearArray_length = leapYearArray.length;
        
        for(int i=0;i<leapYearArray_length;i++)
        {
            System.out.println(leapYearArray[i]);
        }
        
    }
}