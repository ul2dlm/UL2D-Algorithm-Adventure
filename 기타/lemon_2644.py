'''
    2644
    DFS
'''
N = int(input()) # 이웃수
X, Y = map(int, input().split())
M = int(input()) # 주어질 간선 수
graph = [[0]*(N+1) for _ in range(N+1)]
visit = [0]*(N+1)
answer = -1
checked = False

# 간선 그래프 초기화
for _ in range(M):
    a, b = map(int, input().split())
    graph[a][b] = graph[b][a] = 1

def DFS(x, z):
    global checked
    global answer
    visit[x] = 1

    for i in range(1, N+1):
        if graph[x][i] == 1 and visit[i] == 0:
            if i == Y:
                checked = True
                answer = z+1
                break
            DFS(i, z+1)

DFS(X, 0)

print(answer)