## 평균은 넘겠지 (https://www.acmicpc.net/problem/4344)

case = int(input())

for i in range(case):
    n = 0
    x = list(map(int, input().split()))
    avg = sum(x[1:len(x)])/x[0]
    
    for j in range(1,len(x)):
        if x[j] > avg:
            n += 1
    
    print(f'{round(n/x[0]*100,3):.3f}%')




