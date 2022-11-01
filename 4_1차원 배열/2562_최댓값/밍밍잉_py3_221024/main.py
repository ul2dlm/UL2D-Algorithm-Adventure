import sys
max = -1
max_idx = -1
for idx in range(9):
    num = int(sys.stdin.readline())
    if max < num:
        max_idx = idx
        max = num

print(max, max_idx+1, sep='\n')