/******************************************************************************

https://www.acmicpc.net/problem/2309
일곱 난쟁이
9C7 
9명중에 7명을 뽑아서 합이 100이 되는 경우를 찾는 것.
순열을 써서 노가다 or 조합을 쓰기

*******************************************************************************/
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int arr[9];
int sum=0;
int main()
{
    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);

    pair<int, int> ret;
    vector<int> v;
    for (int i=0; i<9; i++) {
        cin >> arr[i];
        sum += arr[i];
    }
    
    for (int i=0; i<9; i++) {
        for (int j=0; j<i; j++) {
            if (sum - arr[i] - arr[j] == 100) {
                ret = {i, j};
                break;
            }
        }
    }
    
    for (int i=0; i<9; i++) {
        if (ret.first == i || ret.second == i) continue;
        v.push_back(arr[i]);
    }
    sort(v.begin(), v.end());
    for(int i : v) cout << i << endl;
    
    return 0;
}