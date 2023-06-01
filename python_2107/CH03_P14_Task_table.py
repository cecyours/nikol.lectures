
start = int(input("Enter the start number : "))
end = int(input("Enter the end number : "))

for i in range(start,end+1):
    # print(i)
    print("-------")
    for j in range(1,11):
        print(i,"x",j,"=",j*i)