#https://www.acmicpc.net/problem/1654
#매개변수 https://www.acmicpc.net/problemset?sort=ac_desc&algo=170
import sys
N, M = map(int, input().split())
arr = []

for _ in range(N):
    arr.append(int(input()))
    
min_v, max_v = 1, max(arr)

while min_v <= max_v:
    mid = (min_v + max_v) // 2
    
    hab = 0 
    for i in arr:
        hab += i // mid
    
    if hab >= M:
        min_v = mid + 1
    else:
        max_v = mid - 1
    
print(max_v)