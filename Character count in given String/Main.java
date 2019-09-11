#include<stdio.h>
#include<string.h>
void main()
{
	int len,i,count=1;
  char string[50];
  gets(string);
  if(strlen(string)>20)
  {
    printf("Invalid Input");
  }
  else
  {
    for(i=0;i<strlen(string);i++)
    {
      if(string[i]==string[i+1])
      {
        count++;
      }
		else
        {
			printf("%c%d",string[i],count);
          count=1;
        }
    }
  }
  
}