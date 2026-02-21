def CountByRecursion(n,count):
  if(n==0):
    return count 
  count+=1
  return CountByRecursion(n//10,count)
  
n=1234
print(CountByRecursion(n,0))
