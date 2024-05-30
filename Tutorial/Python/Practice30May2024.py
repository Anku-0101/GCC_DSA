

def Transpose(matrix):
    rows = len(matrix) # m
    columns = len(matrix[0]) #n
    
    transposed = [[0]*rows for _ in range(columns)] # initializing the transposed matrix
    
    for i in range(rows):
        for j in range(columns):
            transposed[j][i] = matrix[i][j]
    
    return transposed
    

matrix1 = [
            [1,4,5],
            [2,3,8],
            [11,-3,-9],
            [8,0,1]
         ]

matrix2 = [
            [3,-9,0],
            [21,4,3],
            [1,3,39],
            [9,10,41]
         ]
    
def Add(matrix1, matrix2):
    rows = len(matrix1)
    cols = len(matrix1[0])
    
    for i in range(rows):
        for j in range(cols):
            matrix1[i][j] = matrix1[i][j] + matrix2[i][j]

    return matrix1


#print(Add(matrix1, matrix2))

def count_vowels(word):
    vowels='a,e,i,o,u,A,E,I,O,U'.split(',')
    dictionary = dict()
    for i in word:
        if i in vowels:
            if i not in dictionary:
                dictionary[i]=1
            else :
                dictionary[i]+=1
    return dictionary


#print(count_vowels('aeeiiioooouuuuu caps: AAAAAEEEEIIIOOU'))

def mean(list):
    size = len(list)
    total = 0
    for i in list:
        total+=i
    
    mean=total/size
    return mean
    
#print(mean([1,4,5,9,6]))


def median(list):
    list.sort()
    size = len(list)
    
    if(size%2 == 0): # medain when size is even
        return (list[(size-1)//2] + list[(size+1)//2])/2
    
    return list[(size-1)//2]

print(median([3,9,2,4,4,8,6])) # 2,3,4,4,6,8,9
#def mode(list):




