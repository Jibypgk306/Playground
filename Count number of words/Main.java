#Type your code here
string=input()
char=0
word=1
for i in string:
      char=char+1
      if(i==' '):
            word=word+1
print("The number of words in string are :",word)