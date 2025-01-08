//here is the marks of 2 students in their 3 subjects
//0th index indicates the 1st position and 1st index indicates the 2nd position
#include<stdio.h>

int main() {

    int marks[2][3];
    marks[0][0]=90;
    marks[0][1]=98;
    marks[0][2]=97;

    marks[1][0]=56;
    marks[1][1]=78;
    marks[1][2]=87;

    printf("marks of 1st student in his 2nd sub is %d",marks[0][1]);
    return 0;
}