def palindrome(n):
  n1=rev(n,0)
  if(n1==n):
    return True
  else: 
    return False
def rev(n,n1):
  if(n==0):
    return n1
  n1=n1*10+(n%10)
  return rev(n//10,n1)

print(palindrome(121))