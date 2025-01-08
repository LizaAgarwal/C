//calculate the sum of square of the sum of the numbers in each row and print it
#include<stdio.h>
int main() {
    int m,n,a;
    printf("enter the no of rows:");
    scanf("%d",&m);
    printf("enter the no of columns:");
    scanf("%d",&n);
    int rowindex,columnindex;
    rowindex=0;
    int rowsum; 
    int colsum=0;
    int rowsumsq;
    while (rowindex<m){
        rowsum=0;
        columnindex=0;
        while (columnindex<n){
            printf("enter the elements of the matrix:");
            scanf("%d",&a);
            rowsum=rowsum+a;
            columnindex++;
        }
        rowsumsq=rowsum*rowsum;
        colsum=colsum+rowsumsq;
        rowindex++;
    }
    printf("sum is %d",colsum);
    return 0;
}