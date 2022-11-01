/*
    문자열 반복
    https://www.acmicpc.net/problem/2675
    2022.10.28 레몬

    문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오. 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.

    QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.

    [입력]
    첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 

    [출력]
    P
*/
#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
    // #1. 기본셋팅 & 입력받기
    int T;
    cin >> T;

    // #2. T횟수만큼 반복
    for (int i=0; i<T ; i++) {
        int R;
        string S;
        cin >> R >> S;
        // #3. 글자 하나씩 선택
        for (int j=0; j<S.size() ;j++) {
            // #4. 각 문자를 R번씩 출력
            for(int k=0; k<R ;k++) {
                cout << S[j];
            }
        }
        cout << endl;
    }

    return 0;

}