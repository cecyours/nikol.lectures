products = {
    '1' :
        {
             "name":"T-shirt",
             "quantity":2,
             "brand":"Zara",
             "price":5000.00
        },
    '2' :
        {
             "name":"choclate",
             "quantity":5,
            "brand":"kit-kat",
             "price":100.00

        },
    '3' :
        {
             "name":"maggie",
             "quantity":1,
             "brand":"nestle",
             "price":97.55
        },
    '4' :
        {
             "name":"soes",
             "quantity":1,
             "brand":"air jorden",
             "price":18000.00
        },
    '5' :
        {
             "name":"Tennis ball",
             "quantity":2,
             "brand":"Nevia",
             "price":180.00
        }                            

}
sum = 0
print("{:^5} | {:^15} | {:^9} | {:^10} | {:^8} ".format("SrNo","ProductName","quantity","brand","price"))
for i in products:
    sum += products[i]["price"]
    print("{:5} + {:15} + {:9} + {:10} + {:8} ".format("-----","---------------","---------","----------","--------"))
    print("{:^5} | {:^15} | {:^9} | {:^10} | {:^8}  ".format(i,products[i]["name"],products[i]["quantity"],products[i]['brand'],products[i]['price']))
print("{:5} + {:15} + {:^9} + {:10} + {:8} ".format("-----","---------------","-------","----------","--------"))
print("{:5} | {:15} | {:^9} | {:10} | {:8} ".format("","","","",sum))


