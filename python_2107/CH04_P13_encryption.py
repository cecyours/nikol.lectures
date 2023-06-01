
plain_text = input("Enter the msg : ")
enc_text = ""
for i in plain_text:
    x = ord(i)+3
    enc_text+=chr(x)
    # print(,end="")

print(enc_text)

new_text = ""
for i in enc_text:
    x = ord(i)-3
    new_text+=chr(x)
    # print(,end="")

print(new_text)