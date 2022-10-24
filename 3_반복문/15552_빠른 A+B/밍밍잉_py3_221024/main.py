import sys
line = int(sys.stdin.readline())
for i in range(line):
    a, b = map(int, sys.stdin.readline().split())
    sys.stdout.writelines(str(a+b) + '\n')