#file = open('learningPython.txt','a')
#file = open('learningPython.txt','r')
#print('File created Succesfully')

#file.write('''1. We learned Loops.\n2. We learned recursion.\n3. We learned ifelse.\n4. We learned string operation.\n5. We learned diff data types.''')
with open('learningPython.txt','r') as files:
    content = files.read()
    contentlist = list(content.split())

print(contentlist)





'''
content = list(file.read().split())
print(content)
file.close()

with open('learningPython.txt','r') as files:
    content = files.read()
    print(content)
'''