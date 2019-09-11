#include<stdio.h>
int main()
{
  	int i,j,n,x,y,count1=-1,count2=-1,a[100];
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d%d",&x,&y);
  for(i = 0; i<n; i++)
  {
    if(x == a[i] && count1==-1)
    {
      count1 = i;
    }
    if(y == a[i] && count2==-1)
    {
      count2=i;
    }
  }
  printf("Element 1 index = %d\nElement 2 index = %d",count1,count2);
}