
import CH07_P11_module as module

data = module.data

for i in data:
    print(data[i])


rollno = input("Enter the roll no : ")

if rollno in data.keys():
    print(data[rollno])
else:
    print("rollno is not found...")