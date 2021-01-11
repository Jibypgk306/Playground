NumList = []
Number = int(input())
for i in range(1, Number + 1):
    value = int(input())
    NumList.append(value)

print(max(NumList))