
n = int(input("Enter total numbers of list : "))
list = []
for i in range(0,n):
    x = input("Enter movie name : ")
    list.append(x)


print("your list -----------")
for i in list:
    print("data : ",i)


request = input("Enter name to remove : ")
list.remove(request)

print(request," has been deleted... ",list)