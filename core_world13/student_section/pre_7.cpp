#include<iostream>
using namespace std;
int main()
{
    int num,i;

    bool isPrime = true;
    cout<<"enter end number :";
    cin>>num;

        for(i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {   
                isPrime = false;
                cout<<"your number is  not prime";
                break;
            }
        }

        if(isPrime)
        {
            cout<<"prime number "<<num;
        }


}