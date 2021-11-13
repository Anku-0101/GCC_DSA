#include<stdio.h>

int binarySearch(long long number,int counter,long long arrPrime[]){

//printf("%lld",number);
//printf("%d",counter);
//printf("%d",arrPrime[0]);
int start=0;
int end=counter-1;
//int flag=0;
while(start<=end){

    int mid= start+((end-start)/2);

    printf(" Mid index  = %d Mid value = %d",mid, arrPrime[mid]);
    if(number==arrPrime[mid]){
       
        return 0;
    }
    else if(number>arrPrime[mid]){
        start=mid+1;
    }
    else{
        end=mid-1;
    }
}

return 1;


}


int main(){


int prime[1000000];
for(int i=0;i<1000000;i++){
    prime[i]=1;
   
}
prime[0]=0;
prime[1]=0;

for(int i=2;i*i<=1000000;i++){

    if(prime[i]==1){
        for(int j=i;i*j<=1000000;j++){
            prime[i*j]=0;
        }
    }
}

// for(int i=0;i<15;i++){
//     printf("%d\t",prime[i]);
// }


int count=0;

int j=0;
for(int i=2;i<1000000;i++){
    if(prime[i]==1){
        count++;
    }
}
long long arr[count];

for(int i=2;i<1000000;i++){
    if(prime[i]==1){
        arr[j++]=i*i;
        
    }
}

// for(int i=0;i<15;i++){
//     printf("%lld\t",arr[i]);
// }

//long long arr2[]={4,9,25,49,121,169,289,361};
//printf("value of count = %d\n",count);
//printf("value of j = %d  \n",j);

for(int i =count-1; i>count-15; i-- )printf("value of at index = %d is = %lld \n", i, arr[i]);
int n;
long long num;
scanf("%d",&n);
for(int i=0;i<n;i++){
    scanf("%lld",&num);
    
    
   int res=binarySearch(num,count,arr);
   if(res==0){
       printf("YES\n");
   }
   else{
       printf("NO\n");
   }
}

    return 0;
}