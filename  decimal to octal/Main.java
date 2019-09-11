#include<stdio.h>
int main()
{
  int num,rem[32],count=0,i;
  scanf("%d",&num);
  if(num<8)
  {
    printf("%d",num);
  }
  else
  {
  while(num>0)
  {
    rem[i] = num % 8;
    num = num / 8;
    i++;
    count++;
  }
  for(i=count-1;i>=0;i--)
  {
    printf("%d",rem[i]);
  }
  }
  return 0;
}