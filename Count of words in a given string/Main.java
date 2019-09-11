#include<stdio.h>
#include<string.h>
int main()
{
  char str[100];
  gets(str);
  int i,count=0;
  for(i=0;i<str[i]!='\0';i++)
  {
     if(str[i] == ' ')
     {
       count++;
     }
  }
  printf("%d",count+1);
  
}