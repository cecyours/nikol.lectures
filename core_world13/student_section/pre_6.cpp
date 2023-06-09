#include <iostream>
using namespace std;
int main()
{
    int num;
    cout << "enter number : ";
    cin >> num;

    if (num % 3 == 0)
    {
        cout << "your number is div by 3";
        if (num % 7 == 0)
        {
            cout << "your number is div by 7";
        }
    }
    else
    {
        cout << "your number is not div by 3 or 7";
    }
}