isActive = 0

if isActive:
    print("yes this is active")
else:
    print("no this is not active")


num = int(input("Enter the number: "))

if num % 2 == 0:
    print(f"{num} the number is even")
else:
    print(f"{num} the number is odd")


age = int(input("Enter your age: "))

if age >= 18:
    print("you are eligible to vote")
else:
    print("you are not eligible to vote")



password = input("Enter password: ")

if password == "admin123":
    print("login successful")
else:
    print("invalid password")
