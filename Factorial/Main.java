#include<stdio.h>
int main()
{
	int num;
  long int fact=1;
  scanf("%d",&num);
  while(num>0)
  {
    fact=fact*num;
    num--;
  }
  printf("%ld",fact);
}