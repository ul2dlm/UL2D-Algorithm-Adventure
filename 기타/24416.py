n = int(input())

def fib(x):
    global count1
    if x == 1 or x == 2 :
        count1 += 1
        return 1
    else : 
        return fib(x-1) + fib(x-2)

f = [0] * (n+1)
def fibonacci(x):
    global count2
    
    f[1] = 1
    f[2] = 1
    for i in range(3, n+1):
        f[i] = f[i-1] + f[i-2]
        count2 += 1
    return f[x]

count1 = 0
count2 = 0
fib(n)
fibonacci(n)
print(count1, count2)