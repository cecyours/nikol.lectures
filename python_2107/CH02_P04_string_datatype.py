
#single line
s = "Hello World"
print(s,type(s))

s = 'hiii'
print(s,type(s))

#multiline string

s = """


    i am the best...

        sdfds   
            ds



    """
print(s,type(s))


s = '''
hello me..@you
'''
print(s,type(s))

print("---------------------------------------------")

# indexing
s = "Hello World"

print(s," : ",s[2])
print(s," : ",s[-1])
print(s," : ",s[-2])

# slicing 
print(s," : ",s[2:5])
print(s," : ",s[2:-1])

print(s," : ",s[::2])
print(s," : ",s[::-1])