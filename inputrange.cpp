#include<iostream>
#include<string>
using namespace std;

int main()
{
    int a,upper,lower;
    cin>>upper>>lower;
    do{
        cin>>a;
        if(a>=upper && a<=lower)
            continue;
        else{
            cout<<"Your entered number is not in range";
            break;
        }
    }
    while(true);
    return 0;
}
