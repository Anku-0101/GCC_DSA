#x = 'Ram' == 'Ram'
#print(x)

y1 = True and True
y2 = True and False
y3 = False and True
y4 = (7 == 4) and (5 != 5)
''' AND operator done
print(y1)
print(y2)
print(y3)
print(y4)

z1 = (3==3) or (7 !=4)
z2 = True or False
z3 = False or True
z4 = False or False

print(z1)
print(z2)
print(z3)
print(z4)

x1 = not (4 > 5)
x2 = not (7==7)
print(x1)
print(x2)


z1 = True && True
z2 = True && False
z3 = False && True
z4 = (7 == 4) && (5 != 5)
# && doesn't work in python as AND Operator, it works in other programming language
# || doesn't work in python as OR Operator, it works in other programming language
print(z1)
print(z2)
print(z3)
print(z4) 







a = int(input('Enter Firs Number: '))
b = int(input('Enter Second Number: '))

if a < b:
    for i in range(a,b+1):
        if i % 2 != 0:
            print(i)
else:
    print('Error: a smaller integer compared to b')
'''

#a1 = int(input('Enter Firs Number: '))
#b1 = int(input('Enter Second Number: '))

def Odd_Even_Check(n):
    if n % 2 == 0:
        print("even")
    else:
        print('Odd')

Odd_Even_Check(9)


def checkPositiveNegativeZero(n):
    if n < 0:
        print("Negative")
    elif n == 0:
        print('Zero')
    else:
        print('Positive')


#checkPositiveNegativeZero(8)

def oddintegersInRange(a,b):
    print('Odd Numbers')
    if a < b:
        for i in range(a,b+1):
            if i % 2 != 0:
                print(i)
    else:
        print( 'Error: a smaller integer compared to b' )

#oddintegersInRange(7,19)


#n = int(input("Enter a number: "))

def calculateGrade(marks):
    if marks >= 90 and marks <= 100:
        return "A"
        #print("A")
    elif marks >= 80 and marks < 90:
        return "B"
        #print('B')
    elif marks >= 70 and marks < 80:
        return "C"
        #print('C')
    elif marks >= 60 and marks <70:
        return "D"
        #print('D')
    else:
        return "F"
    
    
        #print('F')
    
#########
#grade  = calculateGrade(n)
#print(grade)
