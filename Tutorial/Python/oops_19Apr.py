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
ram.weight = 80

print(f"Ram age  =   {ram.age}") #accessing the attribute
print(f"Ram name  =   {ram.name}")
print(f"Ram gender  =   {ram.gender}")
print(f"Ram height  =   {ram.height}")
print(f"Ram weight  =   {ram.weight}")



    
#ram = person() # object creation
#shyam = person()
#print(ram)
#print(shyam)
#ram.name = "Ram" # attribute assignment to object ram
#ram.age = 20 # attribute assignment to object ram, doing it dynamically

#print(ram.age)
#print(f"shyam age  =   {shyam.age}")
