import math
def isPrime(n):
  for i in range(2,int(math.sqrt(n))+1):
    if(n%i==0):
      return False
  return True

def PrimeFactorisation(num):
  for i in range(2,num+1):
    if isPrime(i):
      x=i
      if(num%x==0):
        print(i)
        x=i*x

print(PrimeFactorisation(35))
