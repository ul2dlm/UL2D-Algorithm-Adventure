#input을 쓰면 시간초과
# sys.stdin.readline().split() 을 통해 입력받기

import sys 

N = int(sys.stdin.readline())

stack = []

def VPS(str):
    for i in range(len(str)):
        if i == 0 and str[i] == ')':
            print("NO")
        
        if str[i] == '(':
            stack.append('(')
        elif str[i] == ')':
            if len(stack) == 0:
                print("NO")
            else:
                print(stack[-1])
                del stack[-1]

for i in range(N):
    txt = sys.stdin.readline().split()
    VPS(txt)
    
