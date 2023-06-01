# exit : used to exit the program

username = input("Enter the username : ")
password = input("Enter the password : ")

if(username=="harsh" and password=="123"):
    print("welcome")
else:
    print("exit.... the code")
    exit()

# return : used to return the value where function called.

def sum(a,b):
    return a+b

x = 10
y = 15

z = sum(x,y)
print(x," + ",y," = ",x+y)