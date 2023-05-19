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

a.insert(3,100)
display(a,"insert")

# deletion
a.remove(100)
display(a,"deletion")

# search
i = a.index(30)

print("data status ",i)

# update
a[3]=999
display(a,"update")
