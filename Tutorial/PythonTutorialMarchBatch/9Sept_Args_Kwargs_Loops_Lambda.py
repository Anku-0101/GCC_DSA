'''
def order_pizza(size, *toppings):
    print(f"Size of pizza is {size}")
    for topping in toppings:
        print(f"topping in pizza is {topping}")

#order_pizza("Medium", "Peoroni", "Cheese", "PineApple")
'''
def order_pizza(Size, *toppings):
    print(Size,end=' ')
    for topping in toppings:
        print(topping,'Pizza')

#order_pizza('Small', 'Peporini',"cheese")
'''
def func(*agrs1, *args2):
    for i in agrs1:
        print(i)
    for i in args2:
        print(i)

func(1,2,3,"abc",4,"def",'z')
'''
def order_pizza(size, *toppings, **details):
    print(f"Size of pizza is {size}")
    for topping in toppings:
        print(f"topping in pizza is {topping}")
    
    for key, value in details.items():
        print(f"Key = {key}  and value = {value}")

#order_pizza("Medium", "Peoroni", "Chilli", "Onion", delivery = True, Tip = 50)

def get_count(string, character):
    count = 0
    for i in string:
        if i == character:
            count += 1
    
    return count

#print(get_count("India is in Asia",'z'))
'''
Issue with this code has been explained
def getCount(str, character):
    v = 0
    for i in range(len(str)):
        print(i)
        
    return v

getCount("India is in Asia",'i')

def get_count(string, character):
    count = 0
    i = 0
    print("len = " , len(string))
    while i < len(string): # i = 0,1,2,3
        print(string[i-1])
        if string[i-1] == character:
            count += 1
        i += 1
    return count

print(get_count("guru","u"))
'''

def get_count(string, character):
    count  = 0
    length = len(string)
    index = 0
    
    while index < length :
        #print(string[index])
        if(string[index] == character):
            count +=1
        index += 1
    return count
    
#xprint(get_count("India is in Asia",'i'))

def guess_game(correct_guess):
    count = 0
    
    while True:
        n = int(input('Enter guess between 1 to 100: '))
        if n > correct_guess:
            print('Guess is higher than correct number')
            count += 1
        
        elif n < correct_guess:
            print('Guess is lower than correct number')
            count += 1
        
        elif n == correct_guess:
            count += 1
            print('Correct guess')
            break
    
    print(f"Number of guesses: {count}")

#guess_game(6)
def add(x,y):
    return x+y

# lambda arguments : expression


#print((lambda x,y : x+y)(4,5))

'''
def square(list):
    result = []
    for item in list:
        result.apped(item*item)
    return result
 '''

# higher order function because it is taking a function as input
def my_map(my_func, collection):
    result = []
    for item in collection:
        new_item = my_func(item)
        result.append(new_item)
    return result

# function
cube = lambda x : x**3
square = lambda x : x**2
my_list = [1,2,3,-4,5]
#result_list = my_map(cube, my_list)
result_list = my_map(square, my_list)
print(result_list)

print(my_map(lambda x:x**4, [9,0,8,-3]))
