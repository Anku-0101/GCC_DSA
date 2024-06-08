

Q Link to question - https://platform.stratascratch.com/coding/9891-customer-details?code_type=2

# Import your libraries
import pandas as pd

# Start writing code
#customers.head()
#orders.head()
merged_df = pd.merge(customers,orders,how='left',left_on='id',right_on='cust_id')[['first_name','last_name','city','order_details']]

merged_df.sort_values(by=['first_name','order_details'],ascending=[True,True])
merged_df


Q https://platform.stratascratch.com/coding/9622-number-of-bathrooms-and-bedrooms?code_type=2

#Solution 1
grouped_df = airbnb_search_details.groupby(['city', 'property_type'])[['bathrooms', 'bedrooms']].mean().reset_index()

grouped_df.rename(columns={'bathrooms': 'n_bathroom_avg', 'bedrooms': 'n_bedroom_avg'}, inplace=True)
grouped_df

#Solution 2
df = airbnb_search_details.pivot_table(index=['city','property_type'],values=['bathrooms','bedrooms'],aggfunc=['mean']).reset_index()
df



# Question :  https://platform.stratascratch.com/coding/10087-find-all-posts-which-were-reacted-to-with-a-heart?code_type=2

# Import your libraries
import pandas as pd

# Start writing code
facebook_reactions.head()
df = facebook_reactions[facebook_reactions['reaction'] == 'heart']
df_unq = df.drop_duplicates(subset='post_id')
merged_df = pd.merge(facebook_posts, df_unq['post_id'], on = 'post_id' )
merged_df

# https://platform.stratascratch.com/coding/9663-find-the-most-profitable-company-in-the-financial-sector-of-the-entire-world-along-with-its-continent?code_type=2

# Import your libraries
import pandas as pd

# Start writing code
forbes_global_2010_2014.head()
df=forbes_global_2010_2014[forbes_global_2010_2014['sector']=='Financials']

max_profit = df['profits'].max()

df1 = df[df['profits']==max_profit][['company','continent']]
df1


# https://platform.stratascratch.com/coding/10352-users-by-avg-session-time?code_type=2
# https://platform.stratascratch.com/coding/10180-find-the-lowest-score-for-each-facility-in-hollywood-boulevard?code_type=2
# https://platform.stratascratch.com/coding/10169-highest-total-miles?code_type=2
