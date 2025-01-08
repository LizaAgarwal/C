//write a func named slice which takes input and returns a sliced string from index n to m
#include<stdio.h>

void slice(char str[], int n, int m);

int main() {
    char str[100];
    fgets(str,100,stdin);
    slice(str,3,6);
    return 0;
}

void slice(char str[], int n, int m) {
    char new_str[100];
    int j=0;
    for (int i=n;i<=m;i++,j++){
        new_str[j]= str[i];
    }
    new_str[j]='\0';
    puts(new_str);
}