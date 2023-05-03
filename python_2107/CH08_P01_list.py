data = ["apple","banana","cherry",78,90.28]

print(data)

# indexing
print(data[1])
print(data[-3])
print(data[0])

# slicing.
# start:end:step
print(data[2:])
print(data[1::2])
print(data[::-1])
print(data[:3])


# mutable means it can be modified.
data = ["apple","banana","cherry",78,90.28]
print("old ",data)
data[2]= "mango"
print("new ",data)
