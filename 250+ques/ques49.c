//convert the given character in lower case letter to an upper case letter. 
#include<stdio.h>
int main() {
    char ch;
    printf("enter any character:");
    scanf("%c",&ch);
    if (ch>='a'&& ch<='z'){
        ch=ch-'a'+'A'; //since the difference between the captital a and small a is same the difference betn any other alphabet
    }
    printf("%c",ch);
    return 0;
}