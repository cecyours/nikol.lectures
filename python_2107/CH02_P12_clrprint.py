import clrprint
import random
import time
clrprint.clrprint("Hello World",clr="purple")
clrs = ["red","blue","green","yellow","purple","white","black"]
# for  i in range(100):
while True:
    clrprint.clrprint("\u2764",clr=random.choice(clrs),end=" ")
    time.sleep(0.01)