import clear


class MyException(Exception):
    def __init__(self, msg):
        self.msg = msg
        pass

    def __str__(self):
        return self.msg


username = input("Enter a nume : ")

try:

    if (username.isupper()):
        raise MyException("due to uppercase")
    print("welcome ", username)
except MyException as my:
    print("error ", my)
