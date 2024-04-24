from abc import ABC, abstractmethod

class Shape(ABC):  # Inherit from ABC to create an abstract class
    @abstractmethod
    def area(self):
        pass

    @abstractmethod
    def perimeter(self):
        pass

# we support Rectangle, Square, Circle .... 

class Circle(Shape):
    def __init__(self, radius):
        self.radius = radius

    def area(self):
        return 3.14 * self.radius ** 2

    def perimeter(self):
        return 2 * 3.14 * self.radius

class Rectangle(Shape):
    def __init__(self, length, breadth):
        self.len = length
        self.bre = breadth

    def area(self):
        return self.len*self.bre

    def perimeter(self):
        return 2 *( self.len + self.bre)

circle = Circle(5)
print("Area:", circle.area())  # Output: 78.5
print("Perimeter:", circle.perimeter())  # Output: 31.4

rectangle = Rectangle(2,3)
print("Area:", rectangle.area())  
print("Perimeter:", rectangle.perimeter())  



############


class Animal:  # Parent Class
    def __init__(self, name):
        self.name = name

    def speak(self):
        return "KKKKK"
    

class Dog(Animal):  # Child Class of Animal
    def speak(self):
        return "Woof!"

class Cat(Animal): #Child class of Animal
    def speak(self):
        return "Meow!"
        
pet = Dog("Buddy")
cat = Cat("Tom")
print(cat.speak())
print(pet.speak())  # Output: Woof!


'''
class Parent:
    def speak(self):
        print("Parent speaks")

class Child(Parent):
    pass

child = Child()
child.speak()  # Output: Parent speaks





class Person:
    def __init__(self):
        self.AGE = 0
    

    @property #decorator
    def age(self): # getter method
        return self.AGE
    
    @age.setter
    def age(self, val):
        if val > 0:
            self.AGE = val
    
    def getAge(self): # getter method
        return self.AGE
    
    def setAge(self, val): # setter method
        if val > 0 : # data validation
            self.AGE = val


Ram = Person()
Ram.AGE = -9
#Ram.setAge(30)
print(Ram.getAge())
#Ram.age = 30
#print(Ram.age)
class Account:
    def __init__(self):
        self.__balance = 0
    
    
    def deposit(self, amount):
        if amount > 0:
            self.__balance += amount
        
    
    def getBalance(self):
        return self.__balance


sbi = Account()
sbi.deposit(100)
print(sbi.getBalance())
sbi.__balance = 500 #here balance is modified externally, which is allowed in this use case, so we have to make it private
print(sbi.getBalance())
'''
