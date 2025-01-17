//Write C Program to check whether two matrices are equal or not
#include<stdio.h>
#define size 3
int main() {
    int A[size][size];
    int B[size][size];
    int row,col;
    printf("enter the elements in matrix A of size %dX%d:",size,size);
    for (row=0;row<size;++row)
    for (col=0;col<size;++col)
    {
        scanf("%d",&A[row][col]);
    }

    printf("enter the elements in matrix B of size %dX%d:",size,size);
    for (row=0;row<size;++row)
    for (col=0;col<size;++col)
    {
        scanf("%d",&B[row][col]);
    }

    int isequal=1;
    for (row=0;row<size;++row)
    for (col=0;col<size;++col)
    {
        if (A[row][col]!=B[row][col]){
            isequal=0;
            break;
        }
    }

    if (isequal==1){
        printf("two matrices are equal");
    }
    else{
        printf("two matrices are not equal");
    }
    return 0;
}