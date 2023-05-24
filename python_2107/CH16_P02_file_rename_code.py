import os

file_name = input("Enter file : ")
new_file_name = input("Enter new file name : ")

os.rename(file_name,new_file_name)

print(file_name+" is renamed by "+new_file_name)

