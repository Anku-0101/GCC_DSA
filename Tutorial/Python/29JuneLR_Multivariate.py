import math
import numpy as np
import pandas as pd
from sklearn import linear_model

data =  {
            'area':[2600,3000,3200,3600,4000],
            'bedroom':[3,4,3,4,5],
            'age':[20,15,18,30,6],
            'price':[550000,565000,610000,595000,760000]
        }
    # price = m1*area + m2*bedroom + m3*age + c

df = pd.DataFrame(data)
reg = linear_model.LinearRegression()
reg.fit(df[['area', 'bedroom', 'age']], df['price'])

print(reg.coef_)
print(reg.intercept_)

m1 = 138.90942699
m2 = -22153.41959335
m3 = -5101.66358595
c = 335369.6857670974
y = m1*3500 + m2*3 + m3*16 + c
print(y)
z = reg.predict([[3500, 3, 16]])
print(z)
