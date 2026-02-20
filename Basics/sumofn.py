number=int(input("Enter:"))
def sumToN(n):
  sum=(n*(n+1))//2
  return sum
def sumToN2(n):
  sum=0
  for i in range(n+1):
    sum=sum+i
  return sum

#print(sumToN(number))
print(sumToN2(number))
