a_list = []
n=int(input())
for i in range(1,n+1):
    b=int(input())
    a_list.append(b)
a_set = set(a_list)
lgth = len(a_set)
print(lgth)