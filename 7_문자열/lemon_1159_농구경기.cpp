/******************************************************************************

https://www.acmicpc.net/problem/1159
농구 경기
counting 배열 map or array
*******************************************************************************/
#include <iostream>
#include <algorithm>

using namespace std;

int N, cnt[26];
string s, ret;
int main()
{
    cin >> N;
    for (int i=0; i<N; i++) {
        cin >> s;
        cnt[s[0] - 'a']++;
    }
    
    for(int i=0; i<26 ;i++) if(cnt[i] >= 5) ret += (i+'a');
    if(ret.size()) cout << ret << endl;
    else cout << "PREDAJA" << endl;
    
    return 0;
}