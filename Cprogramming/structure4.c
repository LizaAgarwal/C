//pointers to structures
#include<stdio.h>

struct student {
    char name[100];
    int roll;
    float cgpa;
};

int main(){
    struct student s1={"liza",607,9.7};
    struct student *ptr;
    ptr=&s1;

    printf("name is=%s\n",(*ptr).name);
    printf("roll is=%d\n",(*ptr).roll);
    printf("cgpa is=%f\n",(*ptr).cgpa);

    printf("name is=%s",ptr->name);//both syntax gives the same result

    return 0;
}