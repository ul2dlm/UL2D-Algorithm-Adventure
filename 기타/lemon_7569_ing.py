'''
    7569
    토마토
    메모 : 3차원배열,  BFS
'''
import sys

N, M, H = map(int, input().split())
box = []
queue = []
a = M*H
pos = [[1, 0, 0], [-1, 0, 0], [0, 1, 0], [0, -1, 0], [0,0,1], [0,0,-1]]

#입력을 input()으로 받으면 시간초과가 발생한다. -> sys.stdin.readline()으로 사용해주기
for i in range(M*H):
    box.append(list(map(int,sys.stdin.readline().split())))
    for j in range(N):
        if box[i][j]==1:
            queue.append([i,j]) # 1. 시작 위치 queue에 넣기 

# 2. 박스 모두 체크 함수
def box_check() :
    day = 0
    for i in range(M*H):
        for j in range(N):
            if box[i][j] == 0:
                return -1       # 하나라도 안익었다면 -1 
                exit(0)
        day = max(day, max(box[i]))
    return day-1                  # 모두 체크했는데 안익은게 없다면 MAX 값 출력

# 3. BFS 
def BFS():
    while queue:
        q = queue.pop(0)
        
        for i in range(6): 
            uu = q[0] + pos[i][0] + pos[i][2] * M
            vv = q[1] + pos[i][1]
            if (uu >= 0 and vv >= 0 and uu < M*H and vv < N):
                if box[uu][vv] == 0 :
                    box[uu][vv] = box[q[0]][q[1]] + 1
                    queue.append([uu,vv])

BFS()
print(box_check())
# 시간초과떠서 접음