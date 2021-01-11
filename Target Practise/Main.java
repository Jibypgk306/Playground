attempt=0
sum=0
target=int(input())
while sum<target:
  score=int(input())
  sum=sum+score
  attempt+=1
print("The number of turns is",attempt)

