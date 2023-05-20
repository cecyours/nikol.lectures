from array import *
import clear


a = array('i',[10,20,30,40,50,60,70,80,90])

print(a)
# traverse : access each element of ARRAy
# using for each loop

def display(a,operation):
    print("  ======== ======= "+operation+" ========= ")
    for i in range(0,len(a)):
        print("a [{:>2}] = {}".format(i,a[i]))

# insertion : add a new element 
a.append(10)
display(a,"append")

a.extend([1,3,5])
display(a,"extends")

a.pop()
display(a,"pop")

a.reverse()
display(a,"reverse")

data = [23,4,5,67,89,0]
a.fromlist(data)
display(a,"fromlist")

x = a.count(10)
print("count ; ",x)