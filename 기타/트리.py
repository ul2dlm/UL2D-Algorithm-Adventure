import sys

#N,M,K = map(int, sys.stdin.readline().split())
 
N = int(input())
tree = [0] * (N+1)


def make_tree(start, end, index):
    if index >= N+1:
        return 1
    if start == end :
        tree[index] = 1
        return 1
    
    mid = (start+end) // 2
    
    #               왼쪽노드                     +  오른쪽노드     
    tree[index] = make_tree(start, mid, index*2) + make_tree(mid+1, end, index*2+1)
    return tree[index]





make_tree(1, N, 1)
    
print(tree)


#트리 
#