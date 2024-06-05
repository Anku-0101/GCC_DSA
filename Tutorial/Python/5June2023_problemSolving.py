import numpy as np
import pandas as pd

#SERIES

arr = [1,3,5,9,2,3,4,0]
series = pd.Series(arr)
#print(series.describe())
#std = series.std()
#print(std)

# Data frame

dict1 = {
            'name':['Ram','Bam','Rani','Ravi','Rama','Ram','Balram','Rani','Ravi','Rama'],
            'marks':[50, 55, 60, 65, 70, 75, 80, 85, 90, 95],
            'city':['Bangalore','Mumbai','Bangalore','Delhi','Patna','Pune','Mysore','Rajasthan','Jamshedpur','Delhi']
    
        }

#print(dict1)
df = pd.DataFrame(dict1)
print(df)
#print(df.describe())

g = df.groupby('city')

print('########################------------#######')
#for city, city_df in g: 
#    print(city)    
#    print(city_df)

# get only a specific group in group by example - Bangalore
#print(g.get_group('Bangalore').sum())





# https://platform.stratascratch.com/coding/10367-aggregate-listening-data?code_type=2
# Import your libraries
import pandas as pd

# Start writing code
listening_habits.head()

df = listening_habits

df['listening_dur_min'] = df['listen_duration']/60
total_listen_duration = df.groupby('user_id')['listening_dur_min'].sum().reset_index()

total_listen_duration['total_listen_duration'] = total_listen_duration['listening_dur_min'].round().astype(int)

total_listen_duration = total_listen_duration.drop(columns='listening_dur_min')

unique_song_count = df.groupby('user_id')['song_id'].nunique().reset_index()
unique_song_count.columns = ['user_id', 'unique_song_count']
result = pd.merge(total_listen_duration, unique_song_count, on='user_id')
print(result)


'''
grp1 = listening_habits.groupby(['user_id','song_id'])['listen_duration'].sum().reset_index()

grp2 = grp1.groupby('user_id')['song_id'].count().reset_index()

grp3 = grp1.groupby('user_id')['listen_duration'].sum().reset_index()

merged1 = pd.merge(grp2,grp3,how='inner',on='user_id')

merged1['total_listen_duration']=round(merged1['listen_duration']/60)

merged1.rename(columns={'song_id':'unique_song_count'},inplace=True)

merged1[['user_id','listen_duration','unique_song_count']]
'''


# question link - 
# https://platform.stratascratch.com/coding/10299-finding-updated-records?code_type=2

# Import your libraries
import pandas as pd

# Start writing code
ms_employee_salary.head()
df = ms_employee_salary
g = df.groupby('id')['salary'].max().reset_index()
print(g)
# join the df and g column 
#for emp_id, emp_df in g : 
#    print(emp_id)
#    print(emp_df)

# OR
df = ms_employee_salary.groupby(['id','first_name','last_name','department_id'])['salary'].max().reset_index()
df
