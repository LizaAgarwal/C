//The Greatest Number Among the Given Three Number
#include<stdio.h>
int main() {
    int n1,n2,n3;
    printf("enter three numbers:");
    scanf("%d%d%d",&n1,&n2,&n3);
    if(n1>=n2 && n1>=n3){
        printf("%d is the greatest",n1);
    }
    else if(n2>=n1 && n2>=n3){
        printf("%d is the greatest",n2);
    }
    else{
        printf("%d is the greatest",n3);
    }
    return 0;
}