import math
import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
from sklearn import linear_model

#df = pd.read_csv("price.csv")
data = {
            'area':[300,400,500,600,800,900,1000,1200],
            'price':[30000,50000,62000,75000,86000,120000,150000,170000]
        }

df = pd.DataFrame(data)

plt.xlabel('area(sq ft)')
plt.ylabel('price(INR)')
plt.scatter(df.area, df.price, color='blue', marker = '*')




reg = linear_model.LinearRegression()
reg.fit(df[['area']], df['price'])

ans = reg.predict([[800]])
print(ans[0])
m = reg.coef_[0]
c = reg.intercept_
y = m*(300) + c
print(y)

plt.plot(df.area, reg.predict(df[['area']]), color = 'red')
plt.show()








# Derivative Block
def f(x):
    return math.pow(x,2)-3*x+2

def derivative(x):
    h = 0.00000001
    res = (f(x+h) - f(x))/h
    return res

# print(derivative(100))
# Derivative Block end
