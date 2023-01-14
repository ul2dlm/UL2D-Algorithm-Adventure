# 그래프이론, 그래프 탐색
# 트리
# 깊이 우선 탐색

import sys
N = int(input())
graph = list(map(int, sys.stdin.readline().split()))
d = int(input())

# 트리 생성
tree = [[] for _ in range(N+2)]
for i in range(N):
    if graph[i] == -1:
        tree[N+1].append(i)
    else:
        tree[graph[i]].append(i)

# 깊이 우선 탐색
def dfs(x):
    global cnt
    if len(tree[x]) == 0:
        cnt += 1
        return cnt    
    
    for i in range(len(tree[x])):
        if tree[x][i] == d:
            if len(tree[x]) == 1:
                cnt += 1
                return cnt
            else:
                continue
        else:
            dfs(tree[x][i])

cnt = 0 
if graph[d] == -1:
    print(0)
else:
    dfs(N+1)
    print(cnt)

