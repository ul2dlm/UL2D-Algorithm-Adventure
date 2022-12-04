'''
   문제번호 10815
   https://www.acmicpc.net/problem/10815
   숫자카드
   메모: 이분탐색을 사용
'''
N = int(input())
sang = list(map(int, input().split()))
M = int(input())
card = list(map(int, input().split()))

# 정렬
sang.sort();

# 이분탐색 생성
def binary_search(a, num):
    pl = 0;        # 검색 범위 가장 왼쪽
    pr = len(a)-1; # 검색 범위 가장 오른쪽
    
    while True:
        ban = int((pl+pr)/2);
        if a[ban] == num:
            print('1',end=' ')
            break;
            
        if a[ban] < num:
            pl = ban+1; # 검색범위를 오른쪽으로 좁히기
        else:
            pr = ban-1; # 검색범위를 왼쪽으로 좁좁히기
        
        # 검색실패
        if pl > pr:
            print('0',end=' ');
            break;
            
for i in range(M):
    binary_search(sang, card[i]);
