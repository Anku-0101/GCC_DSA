from abc import ABC, abstractmethod

class Person:
    def __init__(self, name, age):
        self.__name = name
        self.age = age
    
    def __getAge(self, AGE): #Private
        self.age = AGE+10
        print(self.age)
    
    def getAgePublic(self):
        self.__getAge(30)

mohan = Person("Mohan", 0)
#mohan.getAgePublic()
#print(mohan.__name)

class AbstractDataType(ABC):
    
    @abstractmethod
    def Insert(self):
        pass
    
    @abstractmethod
    def Update(self):
        pass
    
    @abstractmethod
    def Delete(self):
        pass
    
    @abstractmethod
    def Search(self):
        pass

class my_list(AbstractDataType):
    def __init__(self):
        self.x = 0
        
    def Insert(self):
        print("List inserting")
    
    def Update(self):
        print("List updating")

#lst = my_list()


class Vehicle(ABC):
    @abstractmethod
    def start_engine(self):
        pass

    @abstractmethod
    def stop_engine(self):
        pass

class Car(Vehicle):
    def start_engine(self):
        return "Car engine started"

    def stop_engine(self):
        return "Car engine stopped"
    
    def get_model(self):
        return "model = xyz"

my_car = Car()

class Motorcycle(Vehicle):
    def start_engine(self):
        return "Motorcycle engine started"

    def stop_engine(self):
        return "Motorcycle engine stopped"



class WildAnimal:
    def __init__(self, species):
        self.species = species
    
    def lives_in(self):
        print("Lives in forest")

class Tiger(WildAnimal):
    def make_sound(self):
        print("roar")
        
tgr = Tiger('genus Panthera')
#tgr.make_sound()
#tgr.lives_in()
    
    
  
  
'''  
class Father:
    def sing(self):
        print("Father sings")
    
    def xyz(self):
        print("from father")


class Mother:
    def cook(self):
        print("Mother cooks")
    
    def xyz(self):
        print("from mother")


class Child(Mother, Father):
    def child_method(self):
        print("from child")
        
chld = Child()
#chld.child_method()
#chld.cook()
#chld.xyz()
'''

class GrandParent:
    def my_method(self):
        print("grand_parent_method")
        

class Parent(GrandParent):
    def my_method(self):
        print("parent_method")

class Child(Parent):
    pass

chld = Child()
#chld.my_method()

class Animal:
    def make_sound(self):
        pass
    
class Cat(Animal):
    def make_sound(self):
        print("Meow")

class Dog(Animal):
    def make_sound(self):
        print("WOWWW")
        
class Horse(Animal):
    def make_sound(self):
        print("Neigh")

cat = Cat()
horse = Horse()
dog = Dog()

cat.make_sound()
horse.make_sound()
dog.make_sound()




class Calculator:
    def sum(self, a,b,c=30):
        print(a+b+c)
    
    
    def multiply(self,a,b,c):
        print(a*b*c)
    
    def multiply(self,a,b):
        print(a*b)
# Compile time polymorphism is calling the same method with different number of parameters, it is also known as Method OVER LOADING
calc = Calculator()
calc.sum(5,8)
calc.sum(5,8,10)
calc.multiply(4,5)
calc.multiply(8,2)



class PM:
    def speak(self):
        print("PM speaks")

class CM:
    def speak(self):
        print("CM speaks")

def speaker(Spkr):
    Spkr.speak()

primeMinister = PM()
chiefMinister = CM()

speaker(primeMinister)
speaker(chiefMinister)



