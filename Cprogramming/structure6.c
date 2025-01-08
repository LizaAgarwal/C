//enter address(house no.,block, city,state) of 5 people
#include<stdio.h>

struct address{
    int house_no;
    int block_no;
    char city[100];
    char state[100];
};

void address_info(struct address add);

int main() {
    struct address add[5];

    printf(" enter address of person 1\n");
    scanf("%d",&add[0].house_no);
    scanf("%d",&add[0].block_no);
    scanf("%s",&add[0].city);
    scanf("%s",&add[0].state);
    address_info(add[0]);

    printf(" enter address of person 2\n");
    scanf("%d",&add[1].house_no);
    scanf("%d",&add[1].block_no);
    scanf("%s",&add[1].city);
    scanf("%s",&add[1].state);
    address_info(add[1]);

    printf(" enter address of person 3\n");
    scanf("%d",&add[2].house_no);
    scanf("%d",&add[2].block_no);
    scanf("%s",&add[2].city);
    scanf("%s",&add[2].state);
    address_info(add[2]);

    printf(" enter address of person 4\n");
    scanf("%d",&add[3].house_no);
    scanf("%d",&add[3].block_no);
    scanf("%s",&add[3].city);
    scanf("%s",&add[3].state);
    address_info(add[3]);

    printf(" enter address of person 5\n");
    scanf("%d",&add[4].house_no);
    scanf("%d",&add[4].block_no);
    scanf("%s",&add[4].city);
    scanf("%s",&add[4].state);
    address_info(add[4]);

    return 0;
}

void address_info(struct address add) {
    printf("house no is %d\n",add.house_no);
    printf("block no is %d\n",add.block_no);
    printf("city is %s\n",add.city);
    printf("state is %s\n",add.state);
}

