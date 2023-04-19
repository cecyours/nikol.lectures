import clear

print("apple","banana","cherry",sep="_",end='.\n')
n = int(input("Enter the number : "))
for i in range(n):
    if i%3==0:
        print(" \u7839 ",end=" ")
    else:
        print("\u2764 ",end=" ")