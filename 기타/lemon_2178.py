from collections import deque

N, M = map(int, input().split())
miro = []
visited_bfs = [[0]*M for _ in range(N)]    # 방문여부체크
                     # 방문횟수체크
pos = [[0,1],[0,-1],[1,0],[-1,0]] # 상하좌우 이동

miro = [list(map(int, input())) for _ in range(N)]    
# 또는
# for _ in range(N):
#    miro.append(list(map(int, input())))

def BFS(u, v):
    que = deque([[u,v]])

    while que:
        V=que.popleft()

        for i in range(4):
            uu = V[0] + pos[i][0]
            vv = V[1] + pos[i][1]
            if uu >= 0 and uu < N and vv >= 0 and vv < M:
                if miro[uu][vv] == 1:
                    miro[uu][vv] = miro[V[0]][V[1]] + 1
                    que.append([uu,vv])
            
BFS(0,0)
print(miro[N-1][M-1])
print(miro)