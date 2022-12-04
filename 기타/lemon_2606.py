'''
    2606
    바이러스
'''
N = int(input())
M = int(input())
arr = [[0]*(N+1) for _ in range(N+1)]
visited = [0]*(N+1)
count = 0

for _ in range(M):
    x, y = map(int, input().split())
    arr[x][y] = arr[y][x] = 1

def BFS(num):
    global count
    que = []
    que.append(num)  # queue에 넣음
    visited[num] = 1 # 방문체크
    
    # queue 가 empty가 아니면 계속
    while que:
        p = que.pop(0)
        for i in range(2, N+1):
            if arr[p][i] == 1 and visited[i] == 0:
                que.append(i)
                visited[i] = 1
                count+=1

BFS(1)
print(count)