t1=9
t2=11
n=int(input())
for i in range(1,n+1):
   print(t1,end=" ");
   nextTerm = t1 + t2
   t1 = t2
   t2 = nextTerm