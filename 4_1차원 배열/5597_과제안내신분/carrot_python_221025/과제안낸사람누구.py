## 과제 안 내신 분..?

s = list(range(1,31))
#print(s)

a = []
for i in range(28):
    a.append(int(input()))

#print(a)

r = sorted(set(s).difference(set(a))) # set(s) - set(a)
for i in r: ## range(2)
    print(i)

## 또는 print(r[0],\n,r[1])