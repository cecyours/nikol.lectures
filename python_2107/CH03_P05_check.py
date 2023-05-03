
char = input("Enter a character : ")[0]

if (char>='A' and char<='Z') or (char>='a' and char<='z'):
    print("alphabet")
elif char>='0' and char<='9':
    print("digit..")
else:
    print("special symbol..")