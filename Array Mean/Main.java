n=int(input())
a=[]
for i in range(0,n):
    elem=int(input())
    a.append(elem)
avg=sum(a)/n
print(round(avg,2)) 