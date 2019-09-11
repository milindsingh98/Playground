#include<stdio.h>
int main()
{
  float SI,rate;
  float p,t;
  scanf("%f%f%f",&p,&t,&rate);
  SI = (p*rate*t)/100;
  printf("%f",SI);
  return 0;
}