
import sys
N = int(input())
arr = list(map(int, sys.stdin.readline().split()))
M = int(input())

result = []

arr.sort()

start = 1
end = arr[-1]

while start <= end:
    mid = (start + end) // 2

    hab = 0
    for i in arr:
        if mid >= i :
            hab += i - mid
        else :
            hab += mid
    
    if hab <= M:
        start = mid + 1
        result.append(mid)
    else :
        end = mid - 1

print(max(result))