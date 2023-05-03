
data = {
    '101':
        {
            "name":"harsh",
            "subject":"python",
            "marks":90.12
        },

    '102':
    {
            "name":"siya",
            "subject":"java",
            "marks":49.00
    }
    ,

    '103':
    {
            "name":"mia",
            "subject":"php",
            "marks":44.00
    }
    ,

    '104':
    {
            "name":"rio",
            "subject":"js",
            "marks":59.00
    }
}


for i in data:
    for  j in data:
        if data[i]["marks"]>data[j]["marks"]:
            node = data[i]
            data[i] = data[j]
            data[j] = node

# print(data)
for i in data:
    print(data[i])
