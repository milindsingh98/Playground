#include <stdio.h>
#include <string.h>
int main() {
	char a,b;
  scanf("%c",&a);
  if('A'<=a && a<='Z')
  {
    // a - 32;
    printf("%c",a+32);
  }
  else if('a'<=a && a<='z')
  {
     //a+32;
    printf("%c",a-32);
  }
  else
  {
    printf("invalid");
  }
	return 0;
}