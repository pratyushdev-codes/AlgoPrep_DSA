/*
        *
       ***
        *           
*/
#include<iostream>
using namespace std;
int main(){
    int nst =1;
    int n = 5;
    int nsp = n/2;
    for(int i =1;i<=n;i++){
        for(int  j =1 ;j<=nsp;j++){
            cout<<" ";
        }
        for(int k =1 ;k<=nst;k++){
            cout<<"*";
        }
        if(i<=n/2){
        nst = nst+2;
        nsp--;
        }else{
            nsp++;
            nst = nst-2;
        }
         cout<<endl;
    }
    return 0;
}
