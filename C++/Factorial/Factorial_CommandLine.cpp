//Factorial of a number using command line arguments
//Time complexity O(n)

#include <iostream>
#include <string>

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

int main(int argc, char* argv[])
{

//First argument is program name, arg count will always be 1 greater than input.
    std::cout << "Argument count = " << argc << std::endl;

//Method to convert string to an integer.
    int num = std::stoi(argv[3]);
    //std::cin >> num;

    int result;
    result = factorial(num);
    std::cout << result << std::endl;
    return 0;
}
