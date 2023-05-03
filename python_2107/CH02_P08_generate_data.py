import random
import names
#  first name, last name, age, number,product, quantity, price,city,date
# data = {}
product = ["laptop","phone","charger","handfree","processor","RGB Fan"]
price = [50000,150000,20000,150,90000,120000]
city = ["Ahmedabad","pune","delhi","mumbai","hydrabad"]

# file = open("data.txt","w")
# file.write("{},{},{},{},{},{},{},{},{},{}\n".format("SrNO","first name","last name","age","product","price","q","total","city","date"))
for i in range(500):
    fname = names.get_first_name()
    lname = names.get_last_name()
    age = random.randint(12,45)
    index = random.randint(0,len(product)-1)
    i_product = product[index]
    i_price = price[index]
    q = random.randint(1,10)
    bill = i_price*q
    c = random.choice(city)
    date = str(random.randint(1,31))+"/"+str(random.randrange(1,12))+"/"+str(2023)
    print(i+1,fname,lname,age,i_product,i_price,q,bill,c,date)
    # file.write("{},{},{},{},{},{},{},{},{},{}\n".format(i+1,fname,lname,age,i_product,i_price,q,bill,c,date))
