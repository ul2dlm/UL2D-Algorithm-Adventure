import sys
num = int(sys.stdin.readline())
arr = sys.stdin.readline().split()
arr[-1] = arr[-1].rstrip('\n')
comp = sys.stdin.readline().rstrip('\n')
print(arr.count(comp))