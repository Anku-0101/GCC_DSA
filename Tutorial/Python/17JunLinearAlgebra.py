import numpy as np

A = np.array([1,-3,-4,5])
B = np.array([0,2,1,0])

dif = A-B

dist = np.linalg.norm(dif)

addition = A+B
#print(dist)
#print(addition)

dot_product = A.dot(B)
print(dot_product)
dot_product_1 = np.dot(A,B)
print(dot_product_1)
