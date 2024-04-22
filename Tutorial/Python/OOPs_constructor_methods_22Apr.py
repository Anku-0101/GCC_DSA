class rectangle:

    def __init__(self, length=7, breadth=5): # setting breadth default to 5
        self._length = length
        self._breadth = breadth
    
    def area(xyz):
        #print(f'xyz address = {xyz}')
        return xyz._length*xyz._breadth

r1 = rectangle(breadth=8) # here we are not providing breadth so it will take default
#print(f'r1 address = {r1}')
print(r1.area())
r2 = rectangle(6,7) # here we are providing breadth so it will take currently passed value
#print(f'r2 address = {r2}')
print(r2.area())


'''
class Circle :
    def __init__(self, radius):
        self.RADIUS = radius # RADIUS is object's attribute and radius is method/function parameter
    
    def area(self):
        return 3.14*self.RADIUS*self.RADIUS
    
    def circumferece(self):
        return 2*3.14*self.RADIUS


circle1 = Circle(4)
print(circle1.area())
print(circle1.circumferece())
        





class person:
    def __init__(self, name, age, gender, height): 
        self.NAME = name # NAME is class attribute and 'name' is method parameter
        self._height = height
        self._age = age # AGE is class attribute and 'age' is method attribute
        self._gender = gender
        
        

ram = person("Ram")
#shyam = person("Shyam", 32, "Male", "6ft2inches")
#print(f"Ram height  =   {ram._height}")

class person :
    name = ''
    age = 0
    gender = ''
    height = 0
    

ram = person() # created object ram for person class
ram.name = "Ram" #initalizing attribute name for object ram of class person
ram.age  = 20 #initalizing attribute age for object ram of class person
ram.gender = 'Male' #initalizing attribute gender for object ram of class person
ram.height = '5ft8inches'
ram.weight = 80 # dynamic attribute

print(f"Ram age  =   {ram.age}") #accessing the attribute
print(f"Ram name  =   {ram.name}")
print(f"Ram gender  =   {ram.gender}")
print(f"Ram height  =   {ram.height}")
print(f"Ram weight  =   {ram.weight}")


class circle:
    radius = 0 # attribute
    def area(xyz): # methods / function, can't define a parameterless method
        #print(f'perimeter is = {perimeter}')
        #print(f'circumference is = {circumference}')
        return 3.14*xyz.radius*xyz.radius
    

c1 = circle()
c1.radius = 5
print(c1.area()) # 2
# object.method() -> even if we're not passing any argument, class argument will be passed -> object.method(object), the first argument will always be object

###
#def method1(green):
#    print(f'{green}')

#method1(yellow)
'''
