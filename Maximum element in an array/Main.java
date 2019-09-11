#include<stdio.h>
int main()
{
  	int i,a[100],n,temp;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  temp = a[0];
  for(i=0;i<n;i++)
  {
    if(temp < a[i])
    {
      temp = a[i];
    }
  }
  printf("%d",temp);
  return 0;
}