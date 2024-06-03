def mode(_list):
    dictionary = dict()
    
    for i in _list:
        if i not in dictionary:
            dictionary[i]=1
        else:
            dictionary[i] += 1
    #sorted_list = sorted(dictionary,key=lambda x : dictionary[x],reverse=True)
    mode = [];
    maxFreq = 0
    # for each key in dictionary, get the maxFreq,, if(freq > maxFreq) maxFreq = freq
    # again iterate and find all the keys from which freq = maxFreq and append them in mode list
    return sorted_list[0]

print(mode([2,3,4,5,6,2,4,5,6,7,9,6,5]))


# Question link : https://platform.stratascratch.com/coding/10308-salaries-differences?code_type=2



# Import your libraries
import pandas as pd

# Start writing code
df = pd.merge(db_employee, db_dept, how='left', left_on='department_id', right_on='id')

df_dept = df.groupby('department')['salary'].max().reset_index()

max_eng_salary = df_dept[df_dept['department'] == 'engineering']['salary'].values[0]
max_mkt_salary = df_dept[df_dept['department'] == 'marketing']['salary'].values[0]

salary_difference = abs(max_eng_salary - max_mkt_salary)

result = pd.DataFrame({'salary_difference': [salary_difference]})
result



# Question link : https://platform.stratascratch.com/coding/10363-weekly-orders-report?code_type=2

# Import your libraries
import pandas as pd

# Start writing code
#orders_analysis.head()
start_date = '2023-01-01'
end_date = '2023-03-31'

df_q1_2023 = orders_analysis[(orders_analysis['week'] >= start_date) & (orders_analysis['week'] <= end_date)]
print(df_q1_2023)
