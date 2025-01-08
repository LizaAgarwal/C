#include<stdio.h>

int main() {
  
  float a,b;
  scanf("%f,%f",&a,&b);
  do{
    int i=-1;
    scanf("%d",&i);
    i++;
    a=b;
    
  }
  while(b!=-1);
    return 0;
}