
data = {"harsh":89,"mohan":90,"heena":14,"jiya":91}
print(data)

print(data["mohan"]) # marks of mohan

print(data)

data["shivu"]=99

print(data)

print("--------------")

for i in data:
    print("{:>10} {}".format(i,data[i]))