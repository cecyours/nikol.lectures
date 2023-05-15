

import clear

# using % operator...
# int : %d
# float : %f
# String : %s

rollno= 10
marks = 6.32
name = "harsh"

s = "%f is marks of %s whose rollno is %d"
print(s%(marks,name,rollno))

# using format()

s = "Hello {2}, i am {0}, what about my new {1}?"
print(s.format("harsh","gk","book"))


s = "Hello {2:^10}, i am {0}, what about my new {1}?"
print(s.format("harsh","gk","book"))

