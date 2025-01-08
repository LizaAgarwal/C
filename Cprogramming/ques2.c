//write a program to calculate the percentage of student from marks in science, maths and sanskrit
#include<stdio.h>

int percent(int science, int maths, int sanskrit);

int main() {
    int science= 98;
    int maths= 86;
    int sanskrit= 96;
    printf("percentage of sudent is %d",percent(science, maths, sanskrit));
    return 0;
}

int percent(int science, int maths, int sanskrit) {
    return (science+ maths+ sanskrit)/3;
}