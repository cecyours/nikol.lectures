data = {
     '1':
        {
             "name":"meet",
             "subject":"maths",
             "marks":80

         },
     '2':
        {
             "name":"mann",
             "subject":"science",
             "marks":85
        },
     '3':
        {
             "name":"keyur",
             "subject":"hindi",
             "marks":50
        },
     '4':
         {
             "name":"mikhil",
             "subject":"s.s.",
             "marks":78
         }
             
}

for i in data:
    for j in data:
        if data[i]["marks"]>data[j]["marks"]:
            node = data[i]
            data[i] = data[j]
            data[j] = node

for i in data:
    print(data[i])
