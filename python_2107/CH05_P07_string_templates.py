from string import Template

s = Template("my name is $username")
user = "harsh"

print(s.substitute({"username":user}))
print(s.substitute({"username":"gk"}))