
data = {"harsh":89,"mohan":90,"heena":14,"jiya":91}
print(data)
data.clear()

new_data = {"riyo":90,"berlin":58,"denver":81,"nairobi":78}
data = new_data.copy()
print(data)

new_list = ["professor","tokyo","rakiel"]

data.update(dict.fromkeys(new_list,0))
print(data)

print(data.get("tokyo"))


