
import clear

class MyError(Exception):
    def __init__(self,value):
        self.value = value
        print("There is an error..")

balance = 1000

withdraw = int(input("Enter the balance : "))

try:
    if(balance-withdraw<0):
        raise MyError("invalid amount");
    balance = balance-withdraw
    print("available balance ",balance)

except MyError as error:
    print("error ",error.value)

