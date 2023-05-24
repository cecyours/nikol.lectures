

file = open("CH16_FILE.txt","a+")

username = input("Enter the name : ")
file.write("welcome "+username+"\n")

# get data from file

print("file : ---------")
# reset cursor
file.seek(10)
x = file.tell()
print("file current position : ",x)
for i in file.readlines():
    print(i,end="")

file.close()
print("operation done...",file.closed)
input()