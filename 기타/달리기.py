import sys
N = int(input())
arr = [int(sys.stdin.readline()) for _ in range(N)]

for i in range(N):
    if i == 0:
        print(1)
    else :
        count = 0
        for j in range(i):
            if arr[i] > arr[j]:
                count += 1
        print(i+1-count)
