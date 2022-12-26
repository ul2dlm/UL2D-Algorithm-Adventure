import sys
sys.setrecursionlimit(10**6)

# test case
t = int(sys.stdin.readline())

#
def dfs(node):
    global result

    for i in graph[node]:
        if visited[i] == -1:
            if visited[node] == 1:
                visited[i] = 2
            else:
                visited[i] = 1
            dfs(i)
        else:
            if visited[i] == visited[node]:
                result = False
                return


for _ in range(t):
    i, j = map(int, sys.stdin.readline().split())

    # 방문
    visited = [-1] * (i+1)
    # 그래프
    graph = [[] for _ in range(i+1)]
        
    for _ in range(j):
        x, y = map(int, sys.stdin.readline().split())
        graph[x].append(y)
        graph[y].append(x)
    
    result = True

    for k in range(1, i+1):
        if visited[k] == -1 :
            visited[k] = 1
            dfs(k)

            if result == False:
                break

    if result == False:
        print("NO")
    else:
        print("YES")