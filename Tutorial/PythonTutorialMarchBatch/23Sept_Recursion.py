def reverse_string(str):
    reversed_str = ""
    
    '''
    for c in str:
        reversed_str = c + reversed_str
    '''
    
    for index in range(len(str)-1,-1,-1):
        reversed_str += str[index]
    
    return reversed_str

#print(reverse_string('Hello'))


def reverse_string_recursion(str):
    if len(str) == 1:
        return str
    
    return str[-1] + reverse_string(str[:-1])

#print(reverse_string_recursion('Hello'))


def getSum(list):
    res = 0
    
    for i in list:
        res += i
    return res

#print(getSum([1,4,5,3,6]))



def getSum_recursion(lst):
    if len(lst) == 1:
        return lst[0]
    
    #return lst[-1] + getSum_recursion(lst[:-1])
    return lst[0] + getSum_recursion(lst[1:])
#print(getSum_recursion([1,4,5,3,6]))

def getSumList(list):
    return getSumListHelper(list, 0, len(list)-1)


def getSumListHelper(list, startIndex, endIndex):
    if(startIndex == endIndex):
        return list[startIndex]
    
    if(startIndex > endIndex):
        return 0
    
    # optimized, less recursive calls
    return list[startIndex] + list[endIndex] + getSumListHelper(list, startIndex+1, endIndex-1)
    
    # Un-Optimized, more recursive calls
    #return list[startIndex] + getSumListHelper(list, startIndex+1, endIndex)

#print(getSumList([2,3,4,5,0,1]))


def fibonacci_sequence(n):
    if n <= 0:
        return []
        
    elif n == 1:
        return [0]
    
    elif n == 2:
        return [0, 1]
    
    fib_seq = [0, 1]
    
    for i in range(2, n):
        i1_term = fib_seq[-1] + fib_seq[-2]
        fib_seq.append(i1_term)
    
    return fib_seq
''' 
n = 4, fib_seq = [0,1]
i = 2, term = 1+0 = 1, fib_seq = [0,1,1]
i = 3, term = 1+1, fib_seq = [0,1,1,2]

'''


#print(fibonacci_sequence(600))

# Optimized code, making very less number of recursive calls, in the order of n, linear complexity
def fibonacci_sequence_rec(n):
    
    if n <= 0:
        return []
    
    elif n == 1:
        return [0]
    
    elif n == 2:
        return [0, 1]
    
    fib_seq = fibonacci_sequence(n - 1)
    next_value = fib_seq[-1] + fib_seq[-2]
    fib_seq.append(next_value)
    
    return fib_seq

#print(fibonacci_sequence_rec(5))



def fibonacci_seq(n):
    result = []
    for i in range(1,n+1):
        result.append(fibbonacci(i))
    return result


# very costly, it's complexity is exponentional  (Most complex in terms of time)
def fibbonacci(n):
    if n <=2:
        return n-1
    else:
        return fibbonacci(n-1) + fibbonacci(n-2)

print(fibonacci_seq(10))
print(fibbonacci(5))































