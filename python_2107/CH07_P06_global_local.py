

a = 10 # global
b = 4
def display():
    global a
    a = 20 # local
    b = 100
    print("value of a : ",a) # 20
    print("value of b : ",b) # 100

display();

print('value of a : ',a)# 20
print('value of b : ',b)# 4
