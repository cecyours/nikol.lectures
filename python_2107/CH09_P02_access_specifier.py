

class User:
    def __init__(self,username=None):
        self.__username = username
        # print("Hello World")
    def display(self):
        print(self.__username)


s1 = User("User17")

s1.display()
# print(s1.__username)
