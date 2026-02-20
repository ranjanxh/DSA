def ropecutting(n,a,b,c):
  if(n==0):
    return 0
  if(n<0):
    return -1
  res=max(ropecutting(n-a,a,b,c),ropecutting(n-b,a,b,c),ropecutting(n-c,a,b,c))
  if(res<0):
    return -1
  return res+1

print(ropecutting(23,12,9,11))