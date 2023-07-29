/*
*  *    *  *
*          *
*  *    *  *

*/
#include<iostream>
using namespace std;
int main(){
    int n ;
    cin>>n;
    int nst = (n/2)+1;
    int nsp =1;
    for(int i = 1;i<=n;i++){
        for(int j =1;j<=nst;j++){
            cout<<"*";
        }
        for(int k =1;k<=nsp;k++){
            cout<<" ";
        }
        for(int l =1;l<=nst;l++){
            cout<<"*";
        }
        if(i<=n/2){
        nst--;
        nsp =nsp+2;
        }else{
            nst++;
            nsp =nsp-2;
        }
        cout<<endl;
    }
    return 0;
}

