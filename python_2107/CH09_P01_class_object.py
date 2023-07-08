


class Student:
    def __init__(self,student_name=None,marks=None):
        self.student_name = student_name
        self.marks = marks
        
    # instance method (self) 
    
    def display(self):
        print(self.student_name," : ",self.marks)

    @staticmethod
    def show():
        print("hii  i am static..")
    
    @classmethod
    def print_(f):
        print("hello im class")
    


s1 = Student("Riya",100)
s2 = Student("Neha",50)
s3 = Student("ppei",78)
s4 = Student("pscedi",98)
s5 = Student("rios",79)

# insatace  : object  (self)
# static : class & self (object)
# class : class name
Student.show()
s1.show()


Student.print_()
s1.print_()
