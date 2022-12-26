import sys
N, M = map(int, sys.stdin.readline().split())

graph = [[0]*(M+1) for _ in range(N+1)]

print(graph)
