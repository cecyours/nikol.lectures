class User:
    @classmethod
    def display(className):
        print("class Method ",className) 
    
    def inst(self):
        print("i am self : ",self)

    @staticmethod
    def state():
        print("Hello state ")

User.display();

x = User()
x.display()

User.state()
x.state()

x.inst()