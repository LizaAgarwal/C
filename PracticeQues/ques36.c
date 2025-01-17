#include<stdio.h>
int main() {
    int A[100][100],B[100][100],r,c;

    printf("enter the no of rows betn 1 and 100:");
    scanf("%d",&r);
    printf("enter the no of columns betn 1 and 100:");
    scanf("%d",&c);
    printf("enter the elements of 1st matrix:");
    for (int i=0;i<r;++i)
    for (int j=0;j<c;++j)
    {
        printf("enter element A%d%d",i+1,j+1);
        scanf("%d",&A[i][j]);
    }

    printf("enter the elements of 2nd matrix:");
    for (int i=0;i<r;++i)
    for (int j=0;j<c;++j)
    {
        printf("enter element B%d%d",i+1,j+1);
        scanf("%d",&B[i][j]);
    }

    int sum[100][100];
    for (int i=0;i<r;++i)
    for (int j=0;j<c;++j)
    {
        sum[i][j]=A[i][j]+B[i][j];
    }
    printf("sum of two matrices:\n\n");
    for (int i=0;i<r;++i)
    for (int j=0;j<c;++j)
    {
        printf("%d\t",sum[i][j]);
        if (j==c-1){
            printf("\n\n");
        }
    }
    return 0;
}