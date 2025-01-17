//Write C Program to interchange diagonals of a matrix
#include<stdio.h>
int main() {
    int A[10][10];
    int r,c;
    printf("enter the no of rows:");
    scanf("%d",&r);
    printf("enter the no of columns:");
    scanf("%d",&c);
    if (r==c){
        printf("elements in the matrix are:");
        for (int i=0;i<r;++i)
        for (int j=0;j<c;++j)
        {
            printf("the element A%d%d",i+1,j+1);
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
        //printing the matrix after interchanging the diagonal
        for (int i=0;i<r;++i){
            int a=A[i][i];
            A[i][i]=A[i][r-i-1];
            A[i][r-i-1]=a;
        }
        printf("matrix after interchanging diagonal is:\n");
        for (int i=0;i<r;++i)
        for (int j=0;j<c;++j)
        {
            printf("%d\t",A[i][j]);
            if (j==c-1){
                printf("\n\n");
            }
        }
    }
    else{
        printf("the given matrix is not a square matrix");
    }
    return 0;

}