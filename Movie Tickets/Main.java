x=int(input())
y=float(input());
if((y==13.30) and (x>13)):
  print("$5.00")
elif((y==13.30) and (x<=13)):
  print("$2.00")
elif(x>13):
   print("$8.00")
else:
   print("$4.00")
