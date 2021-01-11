#python
string=input()
count=0
for i in string:
      count=count+1
new=string[0:2]+string[count-2:count]

print(new)