import clear
# start:end:step
for i in range(10,0,-1):
    print("line ",i)

data = ["kites","apple","banana","cherry"]

for i in data:
    print((i+" ")*2)


row=10
col=10
for i in range(row):
    for j in range(col):
        if i!=j:
            print(" - ",end=" ")
        else:
            print(" * ",end=" ")
    print()

