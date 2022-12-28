N, M, V = map(int, input().split())
graph = [[0]*(N+1) for _ in range(N+1)]
visit = [0]*(N+1)
for _ in range(M):
    x, y = map(int, input().split())
    graph[x][y] = graph[y][x] = 1

def DFS(x):
    print(x, end=' ')
    visit[x] = 1

    for i in range(N+1):
        if graph[x][i] == 1 and visit[i] == 0:
            visit[i] = 1
            DFS(i)

def BFS(x):
    que = []
    visit[x] = 1
    que.append(x)

    while que:
        y = que.pop(0)
        if visit[y] == 1 :
            print(y, end=' ')
        for i in range(N+1):
            if graph[y][i] == 1 and visit[i] == 0:
                visit[i] = 1
                que.append(i)


DFS(V)
print()
visit = [0]*(N+1)
BFS(V)