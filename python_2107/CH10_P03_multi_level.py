# A -> B -> C

class A:
    def show(self):
        print("class A",self)

class B(A):
    def show(self):
        print("class B",self)

class C(B):
    def show(self):
        print("class C",self)


c = C()

c.show()