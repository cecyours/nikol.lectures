#include<iostream>
using namespace std;
int main()
{
    int num,i;
    bool prime=true;

    cout<<"enter a number";
    cin>>num;

    for(i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                prime=false;
                cout<<"number is not a prime";
                break ;

            }
        }
        if(prime)
        {
            cout<<"number is prime :"<<num ;
        }
}