/******************************************************************************

https://www.acmicpc.net/problem/10808 
알파벳개수
counting -> map or array

*******************************************************************************/
#include <iostream>

using namespace std;
int arr[26];
string str;
int main()
{
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);
    
    cin >> str;
    
    for (char a : str) {
        arr[a-'a']++;
    }
    for (int i=0; i<26; i++) cout << arr[i] << " ";

    return 0;
}