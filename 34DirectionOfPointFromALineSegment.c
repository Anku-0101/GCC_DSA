#include<stdio.h>

struct point
{
    double x;
    double y;
};

const int LEFT = -1, RIGHT = +1, ON_THE_LINE = 0;

double CrossProduct(struct point a, struct point b)
{
    return a.x * b.y - a.y * b.x;
}

struct point Subtract(struct point m, struct point n)
{
    struct point res;
    res.x = m.x - n.x;
    res.y = m.y - n.y;

    return res;
}

// Calculates cross product after shifting origin to point A in the line AB
int Get_Direction(struct point a, struct point b, struct point p)
{
    //Shifting the origin to point a
    b = Subtract(b,a);
    p = Subtract(p,a);

    double cross_product = CrossProduct(b,p);

    if(cross_product > 0)
    {
        return LEFT;
    }

    else if(cross_product < 0)
    {
        return RIGHT;
    }

    else return ON_THE_LINE;
}



int main()
{
    printf("Enter the co-ordinates of end points of line AB \n");
    struct point a, b, p;
    printf("Enter x and y values of A \n");
    scanf("%lf", &a.x);
    scanf("%lf", &a.y);

    printf("Enter x and y values of B \n");
    scanf("%lf", &b.x);
    scanf("%lf", &b.y);

    printf("Enter the co-ordinates of point P whose direction from A->B needs to be specified \n");
    printf("Enter x and y values of Point P \n");
    scanf("%lf", &p.x);
    scanf("%lf", &p.y);

    int direction = Get_Direction(a,b,p);

    if(direction == LEFT)                printf("Point is to the left \n");
    else if(direction == RIGHT)          printf("Point is to the right \n");
    else if(direction == ON_THE_LINE)    printf("Point is on the line \n");

}