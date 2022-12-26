
#input을 쓰면 시간초과
# sys.stdin.readline().split() 을 통해 입력받기

import sys 

N = int(sys.stdin.readline())

arr = []

for i in range(N):
    txt = sys.stdin.readline().split()
    x = txt[0]

    if x == 'push' :
        arr.append(txt[1])
    elif x == 'top' :
        if len(arr) == 0:
            print(-1)
        else:
            print(arr[len(arr)-1])
    elif x == 'pop' :
        if len(arr) == 0:
            print(-1)
        else :
            print(arr[len(arr)-1])
            del arr[len(arr)-1]
    elif x == 'size':
        print(len(arr))
    elif x == 'empty':
        if len(arr) == 0:
            print(1)
        else :
            print(0)