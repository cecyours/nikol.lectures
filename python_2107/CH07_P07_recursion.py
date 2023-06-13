import time
i = 0
def display():
    global i
    i += 1
    print("Hello Harsh",i)
    time.sleep(0.0005)
    display()
display()