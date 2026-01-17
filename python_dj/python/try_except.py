def check(): 
    try:
     num = int(input("Enter a number : "))
     result = 10 / num
     print(f'Result {result}')
    except ValueError:
     print("Please enter a number")
    except ZeroDivisionError:
      print('Cannot divide by zero')
    except Exception as e:
      print(f'unknown error occured {e}')
    else: 
      print('in the else block')
           

check()