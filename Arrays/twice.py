def twiceUsingHash(arr):
  n=len(arr)+1
  hash=[0]*n
  for i in arr:
    hash[i]+=1
  for j in range(n):
    if(hash[j]==1):
      return j
    
arr1=[1,1,2,3,3,4,4]
print(twiceUsingHash(arr1))
