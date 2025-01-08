//write function to calculate the area of a square, circle and rectangle
#include<stdio.h>

int squarearea(int a);
float circlearea(float rad);
int rectanglearea(int x, int y);

int main() {
    int a;
    printf("enter a");
    scanf("%d",&a);
    printf("area of square is %d\n",squarearea(a));

    float rad;
    printf("enter rad");
    scanf("%f",&rad);
    printf("area of circle is %f\n",circlearea(rad));

    int x;
    printf("enter x");
    scanf("%d",&x);

    int y;
    printf("enter y");
    scanf("%d",&y);

    printf("area of rectangle is %d\n",rectanglearea(x,y));

    return 0;
}

int squarearea(int a) {
    return a*a;
}

float circlearea(float rad) {
    return 3.14*rad*rad;
}

int rectanglearea(int x,int y) {
    return x*y;
}
