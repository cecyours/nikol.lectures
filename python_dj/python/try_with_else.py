def check(): 
    try:
     file = open('data.txt' , 'r')
     content = file.read()
    except FileNotFoundError:
     print("Error: File not found.")
    except Exception as e:
      print(f'unknown error occured {e}')
    else: 
      print('File load Successfully')
      print(f'Content length is {len(content)}')
           

check()