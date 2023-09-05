#include<stdio.h>
int main()
{
    int a;
    
    printf("Enter the value for a : ");
    scanf("%d",&a);

    if(a<20)
    {
      if(a == 12)
         {
             printf("a is 12 .");
         }
         else
         {
            printf("a is not 12 .");
         }
    }
    else
    {
        if(a == 45)
        {
            printf("a is 45.");
        }
        else
        {
            printf("a is not 45.");
        }
        return 0;
    }

    
}