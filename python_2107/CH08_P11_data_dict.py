

data = {
    'gk.hell':
        {
            'username': 'gk.hell',
            'password': '2forme72H',
            'post': 100,
            'like': 2000,
        },

    'heenu25':
        {
            'username': 'heenu25',
            'password': '124',
            'post': 11,
            'like': 20,
        },

}

print(data['heenu25']['post'])
for i in data:
    for j in data[i]:
        print(data[i][j])
