//Factorial of a number using Iterative Method
//Time complexity O(n)

#include <iostream>

int factorial(int num)
{
    int factorial = 1;

    if(num == 0 || num == 1)
    {
        return factorial;
    }
    else
    {
        for(int i=num; i>0; i--)
        {
            factorial = i * factorial;
        }


//        Using while loop:
//        int i = num;
//        while(i>0)
//        {
//            factorial = i * factorial;
//            i--;
//        }

        return factorial;
    }
}

int main()
{
    int num;
    std::cin >> num;

    int result;
    result = factorial(num);
    std::cout << result << std::endl;
    return 0;
}
