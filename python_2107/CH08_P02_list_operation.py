
data = ["The Gray","Avengers","Sooryavanshi","The Book"]

# repetition
x = data*2
print(x)

new_movies = ["Master","Pushpa","KGF"]

# concatenation
all_movies = data+new_movies
print(all_movies)

# memebership : available or not

if "Master" in new_movies:
    print("most welcome")


# iteration looping.
for i in all_movies:
    print("my movie : ",i)

# length

x = len(all_movies)
print("total movies ",x)
