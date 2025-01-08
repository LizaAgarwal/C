//strcmp compares between two strings. 
//Output 0 indicates both strings are equal, 1 indicates first string is greater than 2nd
//-1 indicates 2nd string is greater than 1st based on their ASCII value
#include<stdio.h>
#include<string.h>

int main() {
    char first_name[]="a";
    char sec_name[]="b";
    printf("%d",strcmp(first_name,sec_name));
    return 0;

}