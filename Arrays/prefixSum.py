def getSumBrute(arr,start,end):
  curr=0
  for i in range(start,end+1):
    curr+=arr[i]
  return curr

def prefixSum(arr,start,end):
  pSum=[0 for i in range(len(arr))]
  pSum[0]=arr[0]
  for j in range(1,len(arr)):
    pSum[j]=pSum[j-1]+arr[j]
  if start==0:
    return pSum[end]
  else:
    return pSum[end]-pSum[start-1]
   
arr=[2,8,3,9,6,5,4]
print(getSumBrute(arr,1,3))
