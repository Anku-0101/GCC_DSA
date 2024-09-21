def factorial(num):
    res = 1
    for i in range(1, num + 1):
        res *= i
    return res


#print(factorial(6))

def recursive(n):
    if(n == 0):
        return 0
        
    print(" n = ", n)
    return recursive(n-1)

#print(recursive(5))

def factorial(n):
    if n == 0:
        return 1
    return n*factorial(n - 1)

#print(factorial(0))



def fact(n):
    if n==1: # base condition
        return 1
    else:
        return n*fact(n-1) #0*fact(-1) => -1*factorial(-2) =>  

#print(fact(0))

def summation(n):
    res = 0
    for i in range(1,n+1):
        res += i
    return res

#print(summation(0))


def summation_recursive(n):
    if n == 0:
        return 0
    
    return n+summation(n-1)

#print(summation_recursive(3))

# check for error on line 56
def expo(n,e):
    for i in range(1,e):
        n *= n
    return n

#print(expo(2,5))


def exponent(n, e):
    res = 1
    
    for i in range(e):
        res *= n
    
    return res
    
#print(exponent(3,4))
#call1 = 0
#call2 = 0
def exponent_recursive(n, e, calls):
    if e == 0:
        print("number of recursive calls, " , calls)
        return 1
        
    return n*exponent_recursive(n, e-1,calls+1)

print(exponent_recursive(2, 10, 0))


def exponent_optimized(n,e, calls):
    if e == 0:
        print("number of recursive calls, " , calls)
        return 1
    
    if e%2 == 0:
        y = exponent_optimized(n,e//2,calls+1)
        return y*y
    
    return n*exponent_optimized(n,e-1,calls+1)
    
print(exponent_optimized(2,10,0))    


















