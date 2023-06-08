

sum = lambda x,y:x+y

ans = sum(10,6)

print("sum is",ans)

reverse = lambda x: x.upper()[::-1]

print("user name : ",reverse("gk.hell"))


# with list

li = [10,32,5,2,6,7]

sum = filter(lambda i: i%2!=0,li) 



print(list(sum))
