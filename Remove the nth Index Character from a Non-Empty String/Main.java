#python
def remove(string, n):  
      first = string[:n]   
      last = string[n+1:]  
      return first + last
string=input()
n=int(input())

print(remove(string, n))