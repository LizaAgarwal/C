//write a func to count the occurence of vowels in a string
#include<stdio.h>

int count(char str[]);

int main() {
    char str[]={"hello world"};
    printf("%d",count(str));
    return 0;
}

int count(char str[]) {
    int count=0;
    for (int i=0; str[i]!='\0';i++){
        if (str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'){
            count++;
        }
    
    }
    return count;
}