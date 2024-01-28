#include<iostream>
using namespace std;

int main(){
int n ;
cin>>n;
// If the number is Negative 
if(n<0){
    n = -1 * n;
}
while(n>0){
    int lastdigit = n%10;
     cout<<lastdigit;
     n = n/10;
}
return 0 ;
}
