
data = ["python","java","C#","html","js","mongodb","css"]
print(data,type(data))

print("---------------")
print(data[2])
print(data[-1])
print(data[-1][-1])
print(data[0:3:2])
print(data[::2])
print(len(data[::2]))

data[2] = "phps"
for i in data:
    print("language ",i)