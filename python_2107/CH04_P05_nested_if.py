
a = int(input("Enter a number : "))
b = int(input("Enter a number : "))
c = int(input("Enter a number : "))

if a>b:
    if a>c:
        print("a is max : ",a)
    else:
        print("c is max : ",c)
else:
    if b>c:
        print("b is max : ",b)
    else:
        print("c is max : ",c)
