#include<stdio.h>
#include<math.h>
int main()
{
  int i, num,rem[32],bin=0,count=0;
  scanf("%d",&num);
  while(num>0)
  {
    rem[i] = num % 2;
    num = num /2;
    i++;
    count++;
  }
  for(i=count;i>=0;i--)
  {
  printf("%d",rem[i]);
  }
  return 0;
}