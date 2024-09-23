def func():
    x = 1
    def func1():
        print("nested function")
    
    func1()
        
# function nesting is possible in python

def my_map(my_func, collection):
    result = []
    for item in collection:
        new_item = my_func(item)
        result.append(new_item)
    return result

# function

#my_list = [1,2,3,-4,5]

#print(my_map(lambda x:x**2, [9,0,8,-3]))
#print(str(map(lambda x : x**2, [9,0,8,-3])))
#print(list(x))
'''
def my_filter(my_func, collections):
    result = []
    
    for item in collections:
        if my_func(item):
            result.append(item)
        
    return result

n = [33, 87,102,99,123,332,43]
print(my_filter(lambda x: x<100, n))
print(my_filter(lambda x: x>100, n))
even_num = my_filter(lambda x: x%2== 0, n)
print(even_num)
'''

def my_filter(my_func,collection):
    result =[]
    for item in collection:
        if my_func(item):
            result.append(item)
    return result

n = [1,2,3,4,5,8,6]
#print(my_filter(lambda x: x%2==0, n))

#concatenation, join

words = ["India", "USA", "Germany"]

sentence = " Country ".join(words)
print(sentence)

def my_join(collection, seperator):
    res = ""
    size = len(collection)
    index = 0
    for item in collection:
        res += item
        if index < size-1:
            res += seperator
            index += 1
    
    return res
    
#print(my_join(words, " Country "))

def isPalindrome(str):
    str2 = ""
    for index in range(len(str)-1,-1,-1):
        print(f"index is {index}")
        character = str[index]
        print(f"character is = {character}")
        str2 += character
        
    if str == str2:
        return True
    else:
        return False

#print(isPalindrome("asdffdsa"))

def is_palindrome(n):
    start_Index = 0
    end_Index = len(n)-1
    while start_Index < end_Index:
        
        if n[start_Index] != n[end_Index]:
            return False
        start_Index += 1
        end_Index -= 1
    
    return True

print(is_palindrome("racecar"))



def vowelCount(str):
    vowel = ["a","e","i","o","u","A","E","I","O","U"]
    cnt = 0
    
    for character in str:
        if character in vowel:
            cnt += 1
    
    return cnt

print(vowelCount("Hello World"))    
print("\"Hello \n world\"")
print("Hello \t world")
























