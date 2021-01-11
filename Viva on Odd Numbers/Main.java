n=0
s=0.0;
a=int(input())
while(n<3):
  if a%2!=0 and a>0:
    s=s+1
    n=n+1
  elif a%2==0 and a>0:
    s=s-0.5
  elif a<0:
    s=s-1.0
    break
print(s)