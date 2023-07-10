

class A:
    
    def display(self)->None:
        print(" i am A..",self)

class B(A):
    pass

b = B()
b.display()