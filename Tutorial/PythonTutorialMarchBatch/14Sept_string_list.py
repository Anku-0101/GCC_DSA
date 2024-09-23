str = "Hello"
x = str[1:1] # is this clear?
print(x)
x = str[1:1]  #won't work because start = 1 and end-1 = 0, start > end

'''
def to_UpperCase(str):

result = ''

for i in str:

if i == 'a':

result += 'A'

elif i == 'b':

result += 'B'

elif i == 'c':

result += 'C'

elif i == 'd':

result += 'D'

elif i == 'e':

result += 'E'

elif i == 'f':

result += 'F'

elif i == 'g':

result += 'G'

elif i == 'h':

result += 'H'

elif i == 'i':

result += 'I'

elif i == 'j':

result += 'J'

elif i == 'k':

result += 'K'

elif i == 'l':

result += 'L'

elif i == 'm':

result += 'M'

elif i == 'n':

result += 'N'

elif i == 'o':

result += 'O'

elif i == 'p':

result += 'P'

elif i == 'q':

result += 'Q'

elif i == 'r':

result += 'R'

elif i == 's':

result += 'S'

elif i == 't':

result += 'T'

elif i == 'u':

result += 'U'

elif i == 'v':

result += 'V'

elif i == 'w':

result += 'W'

elif i == 'x':

result += 'X'

elif i == 'y':

result += 'Y'

elif i == 'z':

result += 'Z'

else:

result += char

return result

print(to_UpperCase('saptarshi'))

'''



def to_upper(s):
    # Initialize an empty string to hold the result
    result = ''
    
    # Loop through each character in the input string
    for char in s:
        # Get the ASCII value of the character
        ascii_value = ord(char) # ascii_value is a number, type is int
        
        print("ASCII VALUE of " , char , " = " , ascii_value)
        # Check if the character is a lowercase letter
        if 97 <= ascii_value <= 122:
            # Convert to uppercase by subtracting 32
            upper_char = chr(ascii_value - 32)
            result += upper_char
        else:
            # If it's not a lowercase letter, just add it as is
            result += char
    
    return result
    
#upper = to_upper("AbazBCo")
#print(upper)


str2 = "  This is a sen. tence  "
str3 = str2.strip()

#print(str3)

str = "this is a class" #- it's output will be a list
#print(str.split(' '))

def my_split(strings, separator):
    res = []
    temp = ""
    
    for char in strings:
        if char == separator:
            res.append(temp)
            temp = ""
        else:
            temp += char
    
    res.append(temp)
    return res

#print(my_split('India is my country', ' '))

def my_union(list1, list2):
    res = list1[0:]
    
    for i in list2:
        if i not in res:
            res.append(i)
    return res

#print(my_union([1,2,3,2,3], [1,3,5])) # output : [1,2,3,5]

'''
def intersection(list1, list2):
    new_list = []
    
    for i in list2:
        if i in list1:
            new_list.append(i)
        else:
            pass
    return new_list
    
print(intersection([2,3,4,5,6], [3,7,8,9,3,8]))
'''

def my_intersection(list1, list2):
    res = []
    
    for i in list2:
        if i not in res:
            res.append(i)
        for i in list2:
            if i not in res:
                res.append(i)
    return res

def intersection(list1, list2):
    new_list = []
    
    for i in list2:
        if i in list1 and i not in new_list:
            new_list.append(i)
        else:
            continue
    return new_list



















