
def sum(a,b=0):
    print(a," + ",b," = ",a+b)

x = 10
y = 5
sum(y,y) 
sum(b=y,a=x) #keyword args

sum(9) # call default value.

def sum(*a):
    s= 0
    for i in a:
        s+=i
        print(i)
    print('final sum :',s)

sum(3,1,5)