#python
string1=input()
string2=input()
count1=0
count2=0
for i in string1:
      count1=count1+1
for j in string2:
      count2=count2+1
if(count1<count2):
    
      print(string2)
elif(count1==count2):
      print("Both strings are equal.")
else:
     
      print(string1)