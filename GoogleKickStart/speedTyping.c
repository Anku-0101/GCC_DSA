#include<stdio.h>

int GetLen(char str[])
{
    int count = 0;
    for(int i = 0; str[i]!= '\0'; i++)
    {
        count++;
    }

    return count;
}

int main()
{
    int t;
    scanf("%d", &t);
    int itr = t;
    while(itr--)
    {
        char I[100001];
        char P[100001];

        scanf("%s", I);
        scanf("%s", P);

        int lenI = GetLen(I);
        int lenP = GetLen(P);

        if(lenP < lenI)
        {
            printf("Case #%d: IMPOSSIBLE\n",t-itr);
            continue;
        }

        int  j = 0;
        int count = 0;
        int isPossible = 1;
        int matchedCount = 0;

        char c = I[0];
        for(int i = 0; i<lenP; i++)
        {
            if(P[i] == c)
            {
                count++;
            }
            if(count == lenI)
             break;
            
        }

        if(count == lenI)
        {
            printf("Case #%d: %d\n",t-itr, lenP-lenI);
        }
        else
        {
            printf("Case #%d: IMPOSSIBLE\n",t-itr);
        }

    }
    return 0;
}