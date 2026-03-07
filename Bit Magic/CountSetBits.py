def countSetBit(n):
  arr=[]
  count=0
  while(n!=0):
    temp=n%2
    arr.append(temp)
    n=n//2
  for i in arr:
    if(i==1):
      count+=1
  
  return count

print(countSetBit(128))