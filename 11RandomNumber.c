#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int RandomNumber()
{
    int number;
    srand(time(0));
    number = rand()%100 + 1; //Generated random number from 1 to 100
    return number;
}

int main()
{
    int countGuess = 0;
    int ans = RandomNumber();
    int guessedNum;
    
    do
    {
        printf("Enter the number \n");
        scanf("%d",&guessedNum);

        if(guessedNum == ans)
        {
            break;
        }

        if(guessedNum > ans)
        {
            printf("Guessed number is greater than ans \n");
            countGuess ++;
        }
        
        if(guessedNum < ans)
        {
            printf("Guessed number is less than ans \n");
            countGuess ++;
        }
    } 
    while (guessedNum != ans);
    printf("Ans guessed in %d attempts \n",countGuess);
}