/******************************************************************************

https://www.acmicpc.net/problem/10988
팰린드롬인지 확인하기
string

*******************************************************************************/
#include <iostream>

using namespace std;

string str;
int result = 1;
int main()
{
    cin >> str;
    
    for (int i=0; i<str.length()/2; i++) {
        char start = str[i];
        char end = str[str.length()-(i+1)];
        if(start == end) continue;
        else {
            result = 0;
            break;
        }
    }
    cout << result;
    
   
    return 0;
}