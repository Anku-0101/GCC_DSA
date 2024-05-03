# Online Python compiler (interpreter) to run Python online.
# Write Python 3 code in this online editor and run it.
# range of 1 to 10
# for k in range(15):
#    print(k)

import math

def binomial_prob(n,p,x):
    return (math.comb(n,x))*(p**x)*((1-p)**(n-x))
    
##plug the values
p = 0.3
n = 50

prob_lessThan_15 = sum(binomial_prob(n,p,x)for x in range(15))

# P(x >= 15)
res = 1-prob_lessThan_15
print(res)
