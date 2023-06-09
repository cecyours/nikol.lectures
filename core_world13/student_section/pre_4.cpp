#include <iostream>
using namespace std;
int main()
{
    int a, b;
    char operation;
    cout << "enter a exprestion :";
    cin >> a >> operation >> b;

    switch (operation)
    {
    case '+':
        cout << a << " + " << b << " = " << (a + b) << endl;
        break;
    case '-':
        cout << a << " - " << b << " = " << (a - b) << endl;
        break;
    case '*':
        cout << a << " * " << b << " = " << (a * b) << endl;
        break;
    case '%':
        cout << a << " % " << b << " = " << (a % b) << endl;
        break;
    case '/':
        cout << a << " / " << b << " = " << (a / b) << endl;
        break;

    default:
        cout << "enviled opration";
    }

    return 0;
}