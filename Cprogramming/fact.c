#include <stdio.h>

int fact(int n);

int main() {
  int n;
  printf("enter n:");
  scanf("%d",&n);
  
  printf("%d",fact(n));
  return 0;
}

int fact(int n) {
  int fact=1;
  for (int i=n; i>=1; i=i-1) {
    fact=fact*i;
  }
  return fact;
}
    