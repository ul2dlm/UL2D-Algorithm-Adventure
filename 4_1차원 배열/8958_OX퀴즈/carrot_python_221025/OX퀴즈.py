n = int(input())

for i in range(n):
    s = t = 0
    case = input()
    for j in case:
        if j == 'O':
            t += 1+s
            s += 1
        else:
            s = 0
    print(t)
