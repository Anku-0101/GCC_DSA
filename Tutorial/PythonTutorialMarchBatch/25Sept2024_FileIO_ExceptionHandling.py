#file = open('learningPython.txt','a')
#file = open('learningPython.txt','r')
#print('File created Succesfully')

#file.write('''1. We learned Loops.\n2. We learned recursion.\n3. We learned ifelse.\n4. We learned string operation.\n5. We learned diff data types.''')
with open('learningPython.txt','r') as files:
    content = files.read()
    contentlist = list(content.split())

print(contentlist)





'''
content = list(file.read().split())
print(content)
file.close()

with open('learningPython.txt','r') as files:
    content = files.read()
    print(content)
'''

try:
    print("Enter two numbers")
    x = int(input("Enter first number = "))
    y = int(input("Enter second number = "))
    
    print("Sum is = ", x+y)
    print("Division is = ", x//y)

except FileNotFoundError:
    print("File not found exception")

except ZeroDivisionError:
    print("Division by zero")
    
except Exception as exc: # generic exception, capable of cathcing all the exceptions
    print(f"Exception is {exc}")


# you can have multiple exception blocks dealing with differnt types of exception which can arise    
    
# finally block is optional, but if given it will execute everytime
#regardless of try and except
finally:
    avg = (x+y)//2
    print("average is = ", avg)
