#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  float rad,ang,arc;
  cin>>rad>>ang;
  arc = (2*3.14*rad)*(ang/360);
  cout<<fixed<<setprecision(2)<<arc;
}