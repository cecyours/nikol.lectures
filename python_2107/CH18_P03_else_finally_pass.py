

x = [1,2,3,4,5,6,7,8,9]

index = int(input("Enter the index number "))
number = input("Enter the number ")
c = None
try:
    c = x[index]/int(number)
except ZeroDivisionError:
    print("Error.. ZeroDivisionError")
except IndexError:
    print("error IndexError")
except:
    pass
else:
    print("There is no error")
finally:
    print("i am always,,")
print(x,c)