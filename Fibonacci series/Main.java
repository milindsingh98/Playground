#include<stdio.h>
int main()
{
  int num,a=0,b=1,fibo;
  scanf("%d",&num);
  printf("%d %d ",a,b);
  for(int i=2;i<num;i++)
  {
    fibo = a + b;
    a = b;
    b = fibo;
    printf("%d ",fibo);
  }
  
  
  return 0;
}