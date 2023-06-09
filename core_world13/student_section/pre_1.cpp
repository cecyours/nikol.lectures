#include <iostream>
using namespace std;
int main()
{
    int a, b, i;

    cout << "Enter number ";
    cin >> a;

    for (i = 0; i <= a; i++)
    {
        if (i % 2 == 0)
        {

            cout << " "<<i;
        }
    }
    return 0;
}