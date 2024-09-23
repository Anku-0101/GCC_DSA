str = "abc"
# a, ab, abc, b, bc, c
def getSubStr(str):
    result = []
    for startIndex in range(len(str)):
        for endIndex  in range(len(str)):
            subStr = ""
            i = startIndex
            while(i <= endIndex):
                subStr += str[i]
                i += 1
            if(len(subStr) > 0):
                result.append(subStr)
    return result

#print(getSubStr(str))
my_dictionary = {"Ram" : 90, "Shyam" : 95, "Abhinav" : 76, "Ram" : 0, }
my_dictionary["Mohan"] = 87

#my_dictionary.pop("Ramesh")
#print(len(my_dictionary))
#print(my_dictionary)



def char_freq(string):
    chars= [] # n space 
    
    for char in string:  # n times iteration
        if char not in chars: # n times iterating the list
            chars.append(char)
    
    result = dict() # n space
    
    for i in chars: # n times
        count = 0
        for j in string: # n times
            if i == j:
                count += 1
                result[i] = count
    return result

#print(char_freq("India is in Asia"))

def getCharacterFrequency(str): # n is len of string
    frequency = {} # n space
    for char in str: # n times
    
        if char in frequency: # O(1)
            frequency[char] += 1 # update , O(1)
        elif(char != ' '):
            frequency[char] = 1 # adding, O(1)
    
    #if(' ' in frequency):
    #    frequency.pop(' ')
    return frequency

#print(getCharacterFrequency("My Name Is Saptarshi"))



def getWordFrequency(str):
    str1 = str.split()
    frequency = {}
    
    for word in str1:
        if word in frequency:
            frequency[word] += 1
        else:
            frequency[word] = 1
            return frequency

#print(getWordFrequency("My Name My Saptarshi"))

def word_freq(string):
    #string = string.replace(",","")
    #string = string.replace(".","")
    
    words = string.lower().split(" ")
    result = {}
    
    for word in words:
        n = len(word)
        if word[n-1] == ',':
            word = word[0:n-1]
            if ',' in result:
                result[','] +=1
            else:
                result[','] = 1
        else:        
            if word[n-1] == '.':
                word = word[0:n-1]
                if '.' in result:
                    result['.'] +=1
                else:
                    result['.'] = 1
            
            if word not in result:
                result[word] = 1
            else:
                result[word] += 1

    return result

#print(word_freq("India, is in Asia. Asia is biggest continent, also Russia is largest country in Asia."))
def is_anagram(word1, word2):
    return getCharacterFrequency(word1) == getCharacterFrequency(word2)

#print(is_anagram("abc", "bac"))

def is_anagram_opt(word1, word2):
    if(len(word1) != len(word2)):
        return False
    
    word1Freq = getCharacterFrequency(word1)
    print(word1Freq)
    
    for char in word2:
        if(char in word1Freq):
            word1Freq[char] -= 1
        else:
            return False
    
    print(word1Freq)
    for key in word1Freq:
        if(word1Freq[key] != 0):
            return False
    
    return True

#print(is_anagram_opt("silent", "listen"))       


## RECURSION 

# Example of a recursive function
def func(param):
    if(param == 0): # Exit condition
        return
    print("value of param is ", param)
    
    func(param-1) # calling the same function, func inside func, Recursive call

func(5)








