import os
# make directory(folder)

dir_name = input("Enter the directory name : ")
os.mkdir("./demo/"+dir_name)
print(dir_name,"directory is created..")

# get working directory
cwd = os.getcwd()
print(cwd,"is your workign directory..")


try:
        
    dir_name = input("Enter the directory name : ")
    os.rmdir("./demo/"+dir_name)
    print(dir_name,"directory is deleted...")
except:
    pass

import glob
x = glob.glob("./*.txt")
print("your list : ",x)

