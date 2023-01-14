T = int(input())

graph = []
visited = []
direct = [[0,1], [1,0], [0,-1], [-1,0]]

def BFS(a, b, N, M):
    que = []
    que.append([a,b])
    visited[a][b] = 1 #방문체크
    
    #print('start : ', a, b)
    while que:
        pos = que.pop()
        x = pos[0]
        y = pos[1] 
        for i in range(4):
            nx = x + direct[i][0]
            ny = y + direct[i][1]
            if nx >= 0 and nx < M and ny >= 0 and ny < N:
                if visited[nx][ny] == 0 and graph[nx][ny] == 1:
                    visited[nx][ny] = 1
                    que.append([nx, ny])

for i in range(T):
    cnt = 0
    M,N,K = map(int, input().split())
    graph = [[0]*N for k in range(M)]
    visited = [[0]*N for k in range(M)]
    #print(graph)
    for j in range(K):
        x, y = map(int, input().split())
        graph[x][y] = 1
    #print(graph)
    
    #print(visited)
    for n in range(M):
        for m in range(N):

            if visited[n][m] == 0 and graph[n][m] == 1:
                BFS(n, m, N, M)
                cnt += 1
    print(cnt)
        


        
        
