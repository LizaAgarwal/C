//calculate percentage of marks using C language and structure.
#include<stdio.h>
struct student{
    char name[100];
    int roll;
    float marks[3];
    float percentage;
};

int main() {
    struct student s[3];
    for (int i=0;i<3;i++){
        printf("name of student %d:",i+1);
        scanf("%s",s[i].name);
        printf("roll of student %d:",i+1);
        scanf("%d",&s[i].roll);
        printf("marks of student %d in three subjects:",i+1);
        scanf("%f%f%f",&s[i].marks[0],&s[i].marks[1],&s[i].marks[2]);
        s[i].percentage=(s[i].marks[0]+s[i].marks[1]+s[i].marks[2])/3;
    }

    for (int i=0;i<3;i++){
        printf("%.2f\n",s[i].percentage);
    }
    return 0;
}
   