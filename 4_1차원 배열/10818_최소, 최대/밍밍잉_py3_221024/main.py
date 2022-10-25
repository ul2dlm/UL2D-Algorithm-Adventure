import sys
num = int(sys.stdin.readline())
arr = map(int, sys.stdin.readline().split())
arr = list(arr)
val = max(arr)
print(val)
print(arr.index(val))