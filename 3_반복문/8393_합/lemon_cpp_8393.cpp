/*
    빠른 a+b
    https://www.acmicpc.net/problem/15552
*/
#include <iostream>

using namespace std;

int main()
{
    ios::sync_with_stdio(false); cin.tie(NULL);

    int N, sum = 0;
    cin >> N;
    for (int i=0;i<N;i++ ) {
        int x, y;
        cin >> x >> y;
        cout << x+y << '\n';
    }
    return 0;
}