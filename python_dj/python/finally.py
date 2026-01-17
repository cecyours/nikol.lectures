def check(): 
    try:
     file = open('data.txt' , 'r')
     content = file.read()
     print("File content:", content)
    except FileNotFoundError:
     print("Error: File not found.")
    finally:
      print('This block of code always execute')      

check()