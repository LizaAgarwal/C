//Write C Program to check whether two matrices are equal or not
#include<stdio.h>
int main() {
    int A[10][10];
    int B[10][10];
    int r,c;
    printf("enter the no of rows:");
    scanf("%d",&r);
    printf("enter the no of columns:");
    scanf("%d",&c);
    printf("enter the elements in 1st matrix:");
    for (int i=0;i<r;++i)
    for (int j=0;j<c;++j)
    {
        printf("enter element A%d%d",i+1,j+1);
        scanf("%d",&A[i][j]);
    }

    printf("enter the elements in 2nd matrix:");
    for (int i=0;i<r;++i)
    for (int j=0;j<c;++j)
    {
        printf("enter element B%d%d",i+1,j+1);
        scanf("%d",&B[i][j]);
    }

    int isequal=1;
    for (int i=0;i<r;++r)
    for (int j=0;i<c;++c)
    {
        if (A[i][j]!=B[i][j]){
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