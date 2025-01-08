#include<stdio.h>
#include<string.h>

struct student {
    char name[100];
    int roll;
    float cgpa;
};

int main() {
    struct student ECE[100];
    ECE[0].roll=607;
    ECE[0].cgpa=8.9;
    strcpy(ECE[0].name,"liza agarwal");

    printf("name=%s\n",ECE[0].name);
    printf("roll no=%d\n",ECE[0].roll);
    printf("cgpa =%f\n",ECE[0].cgpa);

    return 0;
}