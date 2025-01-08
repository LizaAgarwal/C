//ask the user to input their name and print the length of the name
#include<stdio.h>

int count_len( char arr[]);

int main() {
    char arr[100];
    printf("enter your name");
    fgets(arr,100,stdin);
    printf("%d",count_len(arr));
    return 0;

}

int count_len( char arr[]) {
    int count=0;
    for (int i=0; arr[i]!='\0';i++){
        count++;
    }
    return count-1;
}

