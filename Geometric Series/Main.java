#include<stdio.h>
#include<math.h>
int main()
{
  int i,num,ans;
  scanf("%d",&num);
  if(num%2==0)
  {
    ans = pow(3,(num/2-1));
  }
  else
  {
    ans = pow(2,(num/2));
  }
  printf("%d",ans);
  return 0;
}