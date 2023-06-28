class Employee:

    def __init__(self, name, no):
        self.no = no
        self.name = name

    def display(self):
        print(self.name, self.no)


emp1 = Employee("John",11)
emp2 = Employee("David", 12)
emp1.display()