# Online Python compiler (interpreter) to run Python online.
# Write Python 3 code in this online editor and run it.
# implement the evenOdd function
def even_odd(number):
    if number%2==0 :
        print('even')
    else:
        print('odd')

def getAllFactors(number):
    l = []
    for i in range(1,number+1):
        if number%i==0:
            l.append(i)
    
    return l;

def prime_composite(number): #number = 24
    p=True
    for i in range(2,number): # 2,3,4,5,6,7,8 ... 23
        if number%i==0:
            p=False # no need to check more numbers
            break
    
    if p == True:
        print('prime')
    else:
        print('composite')

def power(a,n):
    p=1
    for _ in range(n):
        print('itr *')
        p*=a
    return p



def Pow(a, n):
    print('itr')
    if(n == 0):
        return 1
    
    if(n%2 == 0):
        y = Pow(a,n/2)
        return y*y
    
    return a*Pow(a,n-1)


def isNumberPalindrome(n):
    reverseNumber = 0
    originalNumber = n
    
    while n > 0:
        last_digit = n%10
        reverseNumber = reverseNumber*10 + last_digit
        n = n//10
    
    if(reverseNumber == originalNumber):
        return True
    
    return False
    


def isStringPalindrome(string):
    r = str()
    o = string
    
    for i in range(1,len(string)+1):
        r+=string[-i]
    
    if r==o:
        return True
    
    return False

print(isStringPalindrome('abac'))
