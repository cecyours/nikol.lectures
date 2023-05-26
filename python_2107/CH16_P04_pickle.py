
import pickle
import clear


mohan = {"name":"mohan","rollno":18,"subject":"python"}
neha = {"name":"neha","rollno":42,"subject":"C++"}

data = {"mohan":mohan,"neha":neha}
# data = {"neha":neha}

file = open("CH16_Practice.txt","ab+")

pickle.dump(data, file)                     
# file.close()

# 
file.seek(0)

data = pickle.load(file)
print(data)

