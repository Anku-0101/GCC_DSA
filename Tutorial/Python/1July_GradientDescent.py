import numpy as np

def gradient_descent(x,y):
    m_curr = 0
    b_curr = 0
    n = len(x)
    iteration = 1000
    learning_rate = 0.006
    for i in range(iteration):
        y_predicted = m_curr*x+b_curr
        md = -(2/n)*sum(x*(y-y_predicted))
        bd = -(2/n)*sum(y-y_predicted)
        m_curr = m_curr - learning_rate*md
        b_curr = b_curr - learning_rate*bd
        cost = 1/n*sum([val**2 for val in(y-y_predicted)])
        print("m = {}, b = {},cost = {} iteration {}".format(m_curr,b_curr,cost,i))
    
    
    

x = np.array([3,4,5,6,8,9,10,12])
y = np.array([4,5,6.2,7.5,8.6,10.2,11.5,14.2])
gradient_descent(x,y)
