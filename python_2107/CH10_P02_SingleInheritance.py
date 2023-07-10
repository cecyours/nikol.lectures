
# single inheritance...

class User:
    def show(self):
        print("i am user method. . ",self)


class Student(User):
    def show(self):
        print("I am Student.. ",self)


k = Student()
k.show()

