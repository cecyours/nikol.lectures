#include<iostream>
using namespace std;
int main()
{
    int a,b,i;

    cout<<"enter the value for start a";
    cin>>a;
    cout<<"enter the value for end b";
    cin>>b;

    for(i=a;i<=b;i++)
    {
        cout<<i<<"  "<<(char)i<<endl;
    }
}

