//Write C Program to Find the Transpose of a given Matrix
#include<stdio.h>
int main() {
    int A[10][10];
    int r,c;
    printf("enter the no of rows:");
    scanf("%d",&r);
    printf("enter the no of colums:");
    scanf("%d",&c);
    printf("enter the elements in the matrix:");
    for (int i=0;i<r;++i)
    for (int j=0;j<c;++j)
    {
        printf("the element A%d%d:",i+1,j+1);
        scanf("%d",&A[i][j]);
    }
    //printing the original matrix
    for (int i=0;i<r;++i)
    for (int j=0;j<c;++j)
    {
        printf("%d\t",A[i][j]);
        if (j==c-1){
            printf("\n\n");
        }
    }
    printf("\n");
    //printing the transpose of a matrix
    for (int j=0;j<c;++j)
    for (int i=0;i<r;++i)
    {
        printf("%d\t",A[i][j]);
        if (i==r-1){
            printf("\n\n");
        }
    }
    printf("\n");
    return 0;
}