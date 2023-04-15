n = int(input("Enter the number : "))

if n<0:
    n = n*-1
    print("-ve")
elif n==0:
    print("Zero")
else:
    print("+ve")

print("new number : ",n)