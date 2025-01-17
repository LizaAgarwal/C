//C program to find the eligibility of admission for an engineering course based on the following
//Marks in Maths >=65
//Marks in Phy >=55
//Marks in Chem>=50
//Total in all three subject >=180 or Total in Math and Subjects >=140
#include<stdio.h>
int main() {
    int m,p,c;
    printf("enter the marks of maths:");
    scanf("%d",&m);
    printf("enter the marks of physics:");
    scanf("%d",&p);
    printf("enter the marks of chemistry:");
    scanf("%d",&c);
    if (m>=65){
        if (p>=55){
            if (c>=50){
                if ((m+p+c)>=180 || (m+p)>=140){
                    printf("candid is eligible");
                }
                else{
                    printf("not eligible");
                }
            }
            else{
                printf("not eligible");
            }
        }
        else{
            printf("not eligible");
        }
    }
    else{
        printf("not eligible");
    }
    return 0;
}