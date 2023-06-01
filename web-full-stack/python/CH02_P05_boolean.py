# Non-zero & non-empty : True
#  Zero : empty : False

x = bool(4>1)

print(x)

x = "Hello"
print("{:>10} {}".format(x,bool(x)))



x = ""
print("{:>10} {}".format(x,bool(x)))


x = []
print("{:>10} {}".format(str(x),bool(x)))


x = [0]
print("{:>10} {}".format(str(x),bool(x)))

x = 8>2
print("{:>10} {}".format(str(x),bool(x)))


