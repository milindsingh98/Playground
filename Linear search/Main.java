#include<stdio.h>
int main()
{
  int a[100],count=0,i,n,x;
  scanf("%d",&n);
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d",&x);
  for(i=0;i<n;i++)
  {
   if(a[i]==x)
   {
     printf("%d",i+1);
     count++;
     break;
   }
  }
  if(count==0)
  {
    printf("%d isn't present in the array.",x);
  }
  
  
  return 0;
}