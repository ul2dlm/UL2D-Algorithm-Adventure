'''
    2667
    단지
'''
N = int(input())
arr = []
danzi = []
visited =  [[0]*(N) for _ in range(N)]
pos = [[0,1],[0,-1],[1,0],[-1,0]] # 상하좌우 이동

for _ in range(N):
    arr.append(list(map(int, input())))

# 1. 시작점 찾기
def start_pos():
    for i in range(N):
        for j in range(N):
            if visited[i][j] == 0 and arr[i][j] == 1:
                return i, j
    return -1, -1

# 2. BFS
def BFS(x, y):
    
    que = []
    que.append([x, y])
    visited[x][y] = 1
    count = 1   #현재부터 카운트
    
    # empty 까지
    while que:
        p = que.pop(0)
        
        for i in range(4):
            uu = p[0] + pos[i][0]
            vv = p[1] + pos[i][1]
            if uu >= 0 and uu < N and vv >= 0 and vv < N:
                if visited[uu][vv] == 0 and arr[uu][vv] == 1:
                    que.append([uu, vv])
                    visited[uu][vv] = 1
                    count += 1
    danzi.append(count)


# 3. -1, -1 이 반환되면 다 체크할게 없으므로 종료하고 답 제출
while True:
    i, j = start_pos()
    if i == -1 and j == -1 :
        break;
    BFS(i, j)

danzi.sort()
print(len(danzi))
for i in range(len(danzi)):
    print(danzi[i])