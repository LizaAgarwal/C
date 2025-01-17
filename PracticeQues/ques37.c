//Write C Program to Multiply Two Matrices
#include<stdio.h>
int main() {
    int A[10][10],B[10][10],r1,c1,r2,c2;
    printf("enter the no of rows and columns for 1st matrix:");
    scanf("%d%d",&r1,&c1);
    printf("enter the no of rows and columns:");
    scanf("%d%d",&r2,&c2);

    while(c1!=r2){
        printf("enter same no of column and row of matrix1 and matrix2 respectively:");
        break;
    }

    printf("enter the elemnts in matrix1:");
    for (int i=0;i<r1;++i)
    for (int j=0;j<c1;++j)
    {
        printf("enter the elements A%d%d",i+1,j+1);
        scanf("%d",&A[i][j]);
    }

    printf("enter the elemnts in matrix2:");
    for (int i=0;i<r2;++i)
    for (int j=0;j<c2;++j)
    {
        printf("enter the elements B%d%d",i+1,j+1);
        scanf("%d",&B[i][j]);
    }
    //initializing the result matrix with 0
    int result[10][10];
    for (int i=0;i<r1;++i)
    for (int j=0;j<c2;++j)
    {
        result[i][j]=0;
    }
    
    for (int i=0;i<r1;++i)
    for (int j=0;j<c2;++j)
    for (int k=0;k<c1;++k)
    {
        result[i][j]=result[i][j]+ A[i][k]*B[k][j];
    }

    printf("matrix after multiplication is:\n\n");
    for (int i=0;i<r1;++i)
    for (int j=0;j<c2;++j)
    {
        printf("%d\t",result[i][j]);
        if (j==c2-1){
            printf("\n\n");
        }
    }
    return 0;
}