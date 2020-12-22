#include<stdio.h>

// Using struct to store the co-ordinates of verices
struct point
{
    double x;
    double y;
};

// Method to calculate cross _ product
double cross_product(struct point a, struct point b)
{
    return a.x * b.y - a.y * b.x;
}

// Area of any n- sided polygon
double Area(struct point vertices[], int n)
{
    double sum = 0.0;

    for(int i = 0; i < n; i++)
    {
        sum += cross_product(vertices[i], vertices[(i+1)%n]);
    }

    if(sum >= 0 ) return sum/2.0;
    else return -1.0*(sum/2.0);
}

int main()
{
    printf("Enter the number of sides \n");
    int n;
    scanf("%d", &n);
    struct point vertex[n];
    double x_,y_;

    for(int i =0; i<n; i++)
    {
        printf("Enter the x and y co-ordinates of vertex = %d \n", i+1);
        scanf("%lf", &x_);
        scanf("%lf", &y_);

        vertex[i].x = x_;
        vertex[i].y = y_;
    }

    double area = Area(vertex, n);

    printf("Area of %d sided polygon is %lf \n", n, area);

    return 0;
}
