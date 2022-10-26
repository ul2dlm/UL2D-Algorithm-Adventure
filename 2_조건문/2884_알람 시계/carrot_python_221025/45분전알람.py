### 알람시계 (https://www.acmicpc.net/problem/2884)
#### 1번
H, M = map(int, input().split())

if M < 45:
    M += 15
    if H == 0:
        H = 23
    else:
        H -= 1
else:
    M -= 45

print(H,M)

#### 2번

H, M = map(int, input().split())

if M < 45:
    M += 60
    if H == 0:
        H = 23
    else:
        H -= 1

print(H,M-45)