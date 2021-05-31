#include<stdio.h>
#include<limits.h>

// Getting prime numbers 
int PrimeNumbers(int arr[], int n)
{
    int count = 0;
    for(int i =2; i*i<n; i++) 
    {
        if(arr[i] == 0)
        {
            count++;
            for(int j = i; j*i <n; j++)
            {
                arr[i*j] = 1;
            } 
        } 
    }
    return count; 
}

int BinarySearch(long arr[], int n, long x)
{
    int start = 0;
    int end = n-1;

    while(start <= end)
    {
        
        int mid = start + (end - start)/2;
        //printf("start = %d End = %d Mid = %d arr[%d] = %ld  \n", start, end, mid,mid,arr[mid]);
        if(arr[mid] == x)  return 1;
        else if(arr[mid] > x) end = mid - 1;
        else start = mid + 1;
    }
    return -1;
}
int main()
{
    int arr[1000000];
    arr[0] = 1;
    arr[1] = 1;
    for(int i =2; i<1000000; i++)arr[i] = 0;
    PrimeNumbers(arr, 1000000);
    //long TPrime[res];
    
    int counter =0;
    
    for(int i = 2; i < 1000000; i++)    if(arr[i] == 0) counter++;

    long TPrime[counter];
    counter = 0;
    for(int i = 2; i < 1000000; i++)    if(arr[i] == 0) TPrime[counter++] = (long)i*i;
    //printf("Count = %d and counter = %d \n", res, counter);
    //printf("Size of TPrime array = %d and value of counter = %d\n", sizeof(TPrime)/sizeof(TPrime[0]),counter);
    
    // for(int i = 0; i < 10; i++)
    // {
    //     printf("T Prime Array at index = %d has value = %ld \n", i, TPrime[i]);
    // }
    int n,ans; 
    scanf("%d", &n);

    //for(int i = counter-1; i>counter - 10; i--) printf("%ld\t",TPrime[i]);
    ans = BinarySearch(TPrime, counter, 4);
    //printf(" value of ans = %d and TPrime[0] = %d \n", ans, TPrime[0]);
    long num;
    while(n--)
    {
        scanf("%ld", &num);
        ans = BinarySearch(TPrime, counter, num);
        if(ans == 1)printf("YES\n");
        else if(ans == -1) printf("NO\n");
    }
    return 0;
}

 
// int TPrime(long n)
// {
//     if(n == 2) return -1;
//     int count =0;
//     long i = 0;
//     //printf("count = %d and i = %ld \n", count, i);
//     for(i =2; i*i < n; i++)
//     {
//         if(n%i == 0)return -1; 
//     }
//     //printf("count = %d and i = %ld \n", count, i);
//     if((n%i == 0)) return 1;
//     else return -1;
// }


// int main()
// {
//     int n;
//     scanf("%d",&n);
//     long val;
//     for(int i =0; i<n; i++)
//     {
//         scanf("%ld",&val);
//         //printf("%ld",val);
//         int num = TPrime(val);
//         if(num == -1)printf("NO\n");
//         else printf("YES\n");
//     }

//     return 0;
// }