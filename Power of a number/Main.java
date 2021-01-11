#python
number = int(input())
exponent = int(input())
power= 1
for i in range(1, exponent + 1):
  power = power * number    
print(power)