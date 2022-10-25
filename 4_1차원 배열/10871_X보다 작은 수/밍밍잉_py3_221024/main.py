import sys
num, x = map(int, sys.stdin.readline().split())
arr = sys.stdin.readline().split()
arr[-1] = arr[-1].rstrip('\n')
min_list = list()
for elem in arr:
    if int(elem) < x:
        print(elem, end=' ')