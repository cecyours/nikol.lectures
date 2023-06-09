
#include<iostream>
using namespace std;

int main(){

    int num;
    int i;

    cout<<"Enter the end number : ";
    cin>>num;

    i=0;
    for(;;)
    {   
        if(i>=num)
            break;

        cout<<"line : "<<i<<endl;
        i+=2;
    }

}