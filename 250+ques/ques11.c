//Read Integer (N) and Print the First Three Powers (N^1, N^2, N^3)
#include<stdio.h>
#include<math.h>
int main() {
    int n,n1,n2,n3;
    printf("enter any number:");
    scanf("%d",&n);
    n1=pow(n,1);
    n2=pow(n,2);
    n3=pow(n,3);
    printf("n^1=%d\n",n1);
    printf("n^2=%d\n",n2);
    printf("n^3=%d\n",n3);
    return 0;
}