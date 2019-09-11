#include<stdio.h>
int main()
{
	int num;
  scanf("%d",&num);
  if(num==1 || num ==2)
  {
    printf("0");
  }
  else if(num%2!=0)
  {
	printf("%d",num-1);
  }
  else
  {
    printf("%d",(num-1)/2);
  }
  return 0;
}