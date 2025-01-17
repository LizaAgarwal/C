//mangoes cost Rs.52.80 per dozen.find the cost of 28 mangoes to the nearest paisa and to print the answer as rupees and paise.
#include<stdio.h>
int main() {
    float cost_dozen=52.80;
    float rcost_28=((cost_dozen*100.0/12.0)*28.0+0.5);
    int cost_28=rcost_28;
    int rupees=cost_28/100;
    int paise=cost_28%100;
    printf("cost of 28 mangoes is\n");
    printf("RS=%d,ps=%d",rupees,paise);
    return 0;
}