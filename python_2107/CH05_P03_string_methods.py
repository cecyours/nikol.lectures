

s = "hello woRld"

x = s.capitalize()
print("{:10} :  {}".format(s,x))


x = s.casefold()
print("{:10} :  {}".format(s,x))

x = s.center(20,"*")
print("{:10} : {}".format(s,x))

x = s.count("l")
print("{:10} : {}".format(s,x))

x = s.encode("utf-8 ")
print("{:10} : {}".format(s,x))

x = s.endswith("d")
print("{:10} : {}".format(s,x))

x = s.expandtabs(2)
print("{:10} : {}".format(s,x))

x = s.find("e")
print("{:10} : {}".format(s,x))

x = s.index("w")
print("{:10} : {}".format(s,x))

s = "helloworld12"
x = s.isalnum()
print("{:10} : {}".format(s,x))

x = s.isalpha()
print("{:10} : {}".format(s,x))

s = "1234"
x = s.isdecimal()
print("{:10} : {}".format(s,x))

s = "21"
x = s.isdigit()
print("{:10} : {}".format(s,x))

x = s.isidentifier()
print("{:10} : {}".format(s,x))

s = "Hello my name is harsh"
x = s.islower()
print("{:10} : {}".format(s,x))

s = "12345"
x = s.isnumeric()
print("{:10} : {}".format(s,x))

s = "123 hello"
x = s.isprintable()
print("{:10} : {}".format(s,x))

x = s.isspace()
print("{:10} : {}".format(s,x))

x = s.istitle()
print("{:10} : {}".format(s,x))

s = "HELLO WORLD"
x = s.isupper()
print("{:10} : {}".format(s,x))

s = ("mango","cherry","orange")
x = "#".join(s)
print(s,x)

s = "banana"
x = s.ljust(10)
print(x,"is my favorite fruit")

s = "HELLO WORLD"
x = s.lower()
print("{:10} : {}".format(s,x))

s = "   mango   "
x = s.split()
print("of all fruits",x,"is my favorite fruit")

txt = "hello world!"
x = txt.partition("world")
print(x)

txt = " i like cricket"
x = txt.replace("cricket","football")
print(x)

txt = " i like cricket"
x = txt.rfind("i")
print(x)

txt = " i like cricket"
x = txt.rindex("cricket")
print(x)

txt = "banana"
x = txt.rjust(10)
print(x, " is my favorite fruit")

txt = "I could eat bananas all day, bananas are my favorite fruit"
x = txt.rpartition("bananas")
print(x)
