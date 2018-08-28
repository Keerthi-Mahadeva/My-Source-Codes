//Factorial of a number using Recursive Method
//Time complexity O(n)

#include <iostream>

int factorial(int num)
{
    int fact = 1;

    if(num == 0 || num == 1)
    {
        return fact;
    }
    else
    {
        return num * factorial(num-1);
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
