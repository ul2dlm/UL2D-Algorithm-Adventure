import sys

arr = [True for _ in range(31)]
arr[0] = False
for _ in range(28):
    num = int(sys.stdin.readline())
    arr[num] = False

for idx, elem in enumerate(arr):
    if elem:
        print(idx)
