def sumOfDigit(n):
  if(n==0):
    return 0
  
  return int(n%10)+sumOfDigit(n//10)
x=sumOfDigit(123)
print(x)