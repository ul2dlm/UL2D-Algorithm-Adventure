import sys
N,M,K = map(int, sys.stdin.readline().split())
arr = [int(sys.stdin.readline()) for _ in range(N)]

sum_arr = [0] * N

#부분합 배열 미리 구하기
sum_arr[0] = arr[0]
for i in range(1, N):
    sum_arr[i] = sum_arr[i-1] + arr[i]

# 값 변경 - 부분합 배열 값 변경


for _ in range(M+K):
    x,y,z = map(int, sys.stdin.readline().split())
    if x == 1: # 값변경
        arr[y-1] = z
    else : # x==2 # 부분합
        hab = 0
        for i in range(y-1, z):
            hab += arr[i]
        print(hab)

