### 더하기 사이클 (https://www.acmicpc.net/problem/1110)
n = input()
c = 1

if int(n) < 10:
        m = str(0+int(n)) 
else:   
    m = str(int(n[0])+int(n[1]))

m = n[-1] + m[-1]

while True:
    if n == m or '0' + n == m:
        break 
    else:
        a = m[1]
        z = str(int(m[0])+int(m[1]))
        if len(z) == 2:
            m = a + z[1] 
        else:
            m = a + z
    c += 1

print(c)