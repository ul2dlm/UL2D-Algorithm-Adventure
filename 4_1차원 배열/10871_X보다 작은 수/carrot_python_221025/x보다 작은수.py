### X보다 작은 수 (https://www.acmicpc.net/problem/10871)

n, x = map(int, input().split())
a = list(map(int, input().split()))

for i in a:
    if i < x:
        print(i, end=' ')
