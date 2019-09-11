#include<stdio.h>
#include<math.h>
int main()
{
    int rem1,bin,oct[100],count=0,i,k,rem,temp=0;
  scanf("%d",&bin);
  while(bin>0)
  {
    rem = bin%10;
    if(rem==1)
    {
    temp = temp + pow(2,i);
    }
    i++;
    bin /=10;
  }
  // printf("%d",temp);
  while(temp!=0)
  {
    oct[k++] = temp % 8;
    temp = temp / 8;
  }
  int j;
  for(j=k-1;j>=0;j--)
  {
  printf("%d",oct[j]);
  }
  return 0;
  }