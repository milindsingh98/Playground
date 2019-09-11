#include<stdio.h>
int main()
{
  char string[100];
  int len;
  gets(string);
  len = strlen(string);
  printf("%d",len);
  return 0;
}