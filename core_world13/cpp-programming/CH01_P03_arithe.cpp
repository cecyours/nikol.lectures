#include<iostream>
using namespace std;
int main()
{
    int a,b;
    char operation;
   
    cout<<"Enter the expression : ";
    cin>>a>>operation>>b;

    switch(operation)
    {
        case '+': cout<<a<<" + "<<b<<" = "<<(a+b)<<endl;break;
        case '-': cout<<a<<" - "<<b<<" = "<<(a-b)<<endl;break;
        case '*': cout<<a<<" * "<<b<<" = "<<(a*b)<<endl;break;
        case '%': cout<<a<<" % "<<b<<" = "<<(a%b)<<endl;break;
        case '/': cout<<a<<" / "<<b<<" = "<<(a/b)<<endl;break;
        default:cout<<"invalid operation...";
    } 

    return 0;
}