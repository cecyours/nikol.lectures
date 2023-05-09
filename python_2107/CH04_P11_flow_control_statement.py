

for i in range(1,11):
    if i==5:
        # break # exit the block
        continue # skip the block
    print("line ",i)


def sum(a,b):
    return a+b

x = 11
y = 29

z = sum(x,y)
print(x," + ",y," = ",z)


if z<0:
    print("exit...")
    exit()

""" 
function hello(){

}

 """
def hello():
    pass # empty block
    print("hi")

hello()