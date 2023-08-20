#include<iostream>
using namespace std;
int main(){
    int n ;
    cin>>n;
    int nst =1;
    for(int i = 1; i<=n ;i++){
        for(int j = 1 ;j<=nst;j++){
cout<<"*";
        }
        nst++;
        cout<<endl;
    }
    return 0 ;
}