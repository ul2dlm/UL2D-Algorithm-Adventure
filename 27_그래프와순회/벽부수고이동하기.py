import sys
N, M = map(int, sys.stdin.readline().split())

MAX = 1000001
graph = []
visited = [[MAX]*M for _ in range(N)]
direct = [[0,1],[0,-1], [1,0], [-1,0]]

def bfs():
    wall = True
    que = []
    que.append([0,0])
    visited[0][0] = 1
    
    while que:
        pos = que.pop()
        x = pos[0]
        y = pos[1]
        for i in range(4):
            nx = x + direct[i][0]
            ny = y + direct[i][1]
            if (nx >= 0 and nx < N and ny >= 0 and ny < M):
                if graph[x][y] == '2':
                    graph[x][y] = '0'
                    wall = True
                #print(nx,ny)
                #print(graph[nx][ny] == '0', graph[nx][ny] == '1', visited[nx][ny] == 0 , wall == True)
                if graph[nx][ny] == '0' and visited[nx][ny] == MAX :
                    visited[nx][ny] = min(visited[x][y] + 1, visited[nx][ny])
                    que.append([nx,ny])
                elif graph[nx][ny] == '1' and visited[nx][ny] == MAX and wall == True:
                    wall = False
                    visited[nx][ny] = min(visited[x][y] + 1, visited[nx][ny])
                    graph[x][y] = '2' #벽깬위치 기억
                    que.append([nx,ny])
                    

for _ in range(N):
    #x = sys.stdin.readline().split()
    lst = list(sys.stdin.readline())
    graph.append(lst)

bfs()
if visited[N-1][M-1] == MAX:
    visited[N-1][M-1] = -1
print(visited[N-1][M-1])

