
def my_replace(str, toReplaceWord, WithNewWord):
    words = str.split() # split requires a seperator?
    res =[]
    
    for i in words:
        if i == toReplaceWord:
            res.append(WithNewWord)
        else:
            res.append(i)
        
    return ' '.join(res)

#print(my_replace('My Country is a','y','WXY'))
#str = "India is in Asia"
#print(str.replace('i','CAT'))

def my_find(str, search_str):
    words = str.split()
    count = 0
    indicator = False
    
    for word in words:
        
        if word == search_str:
            print(f"The index Of The Search Key for word \'{search_str}\' is: {count}")
            indicator = True
            count += 1
        if not indicator:
            count = 0
            for i in str:
                if i == search_str:
                    print(f"The index Of The Search Key for alphabet \'{search_str}\' is: {count}")
                indicator = True
                count += 1
                

#print(my_find('My name is Saptarshi and it is my name', 'ptars'))
str1 = 'My name is Saptarshi and it is my name'
#print(str1.find('ptars'))
#my_find('My name is Saptarshi', 'i')

#. Excllent effort!
# Need to optimize this two methods
def my_intersection(list1, list2): # list 1 has n elements and list2 has m elements
    res = []
    
    for i in list1: # n times
        if i in list2 and i not in res: #i in list2(searching/iterating m elements) # in the final stages it can have m+n elements
            res.append(i)
    return res
# how may times code ran - n * (m + (n+m)) = n^2 + 2*m*n

def my_unique_num_union(list1, list2):
    res = []
    n = list1 + list2
    
    for i in n:
        if i not in res:
            res.append(i)
    return res
    
#print(my_unique_num_union([2,3,4,6,2,4], [-1,0,2,4,5]))
#print(my_intersection([2,3,4,6,2,4], [-1,0,2,4,5]))

def my_strip(str):
    n = ' '
    res = []
    
    start = 0
    end = len(str) - 1
    
    while start < len(str) and str[start] == n:
        start += 1
        
    while end >= 0 and str[end] == n:
        end -= 1
    
    for i in range(start, end + 1):
        res.append(str[i])
        
    return ''.join(res)

#print(my_strip(' My Name '))

my_set = {2,3,4,2,2,1}
#print(my_set)
my_set.add(7)
#print(my_set)
my_set.add(3)
#print(my_set)


def my_UNION(list1, list2): # list 1 has n items and list 2 has m items
    my_set = set()
    #return list(set(list1) | set(list2))
    
    for element in list1: # n items
        my_set.add(element)
    
    for element in list2: # m items
        my_set.add(element)
    
    return list(my_set)
    
#print(my_UNION([2,3,4,6,2,4], [-1,0,2,4,5]))

def getLargeDummyList():
    res = [] 
    for i in range (1000000000):
        res.append(i*10)

#list1 = getLargeDummyList()
#list2 = getLargeDummyList()

#print(my_UNION(list1,list2))

def intersection(l1,l2):
    s1 = set(l1)
    s2 = set(l2)
    common_elements = [element for element in s1 if element in s2]
    
    return common_elements

#print(intersection([1,3,4,5,6],[2,8,4,9,1]))

def MY_Intersectioon(list1, list2):
    temp_set = set()
    my_res = set()
    
    for element in list1: # n times
        temp_set.add(element)
    
    for element in list2: # m times
        if element in temp_set : # O(1) complexity
            my_res.add(element)
    
    return list(my_res)

print(MY_Intersectioon([1,3,4,5,6],[2,8,4,9,1]))
