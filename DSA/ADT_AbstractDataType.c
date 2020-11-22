// Abstraction hides the implementation details 

// Arrays are elements accessible by an index
#include <stdio.h>
#include <stdlib.h>

struct myArray
{
    // Memory to be reserved
    int total_size;
    //Memory to be used
    int used_size;
    int *ptr;
};

void CreateArray(struct myArray * a, int tsize, int usize)
{
    a->total_size = tsize;
    a->used_size = usize;
    a->ptr = (int *)malloc(tsize * sizeof(int));

    //This code block can also be used to initialize the values like the above code
    // (*a).total_size = tsize;
    // (*a).used_size = usize;
    // (*a).ptr = (int *)malloc(tsize * sizeof(int));
}

void show(struct myArray *a)
{
    printf("Marks are listed below\n");
    for(int i=0; i< a->used_size; i++)
    {
        printf("%d\n",(a->ptr)[i]);
    }
}

void SetVal(struct myArray *a)
{
    int n;
    for(int i=0; i < a->used_size; i++)
    {
        printf("Enter elements %d\n", i+1);
        scanf("%d", &n);
        (a->ptr)[i] = n;
    }
}

int main()
{
    struct myArray marks;
    CreateArray(&marks, 10, 5);
    printf("Setting values \n");
    SetVal(&marks);
    printf("Showing the marks\n");
    show(&marks);
    return 0;
}
