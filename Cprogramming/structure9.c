//create a structure to store bank account info of customer in ABC bank(also make alias for it)
#include<stdio.h>

typedef struct bankaccountinfo{
    char name[100];
    int acc_no;
} acc;

int main() {
    acc person1={"liza",123};
    printf("account holder's name is %s\n",person1.name);
    printf("account number is %d\n",person1.acc_no);
    return 0;
}