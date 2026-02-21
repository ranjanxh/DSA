def is_armstrong(n):
  s1=str(n)
  count=len(s1)
  sum=0
  og=n
  while(n!=0):
    digit=n%10
    sum=sum+(digit**count)
    n=n//10
  print(sum)

  if sum==og:
    return True
  else:
    return False

n=153

print(is_armstrong(n))