def LongestSubarrayWithSumK(arr,sum): 
  s,curr=0,0
  for e in range(len(arr)):
    curr+=arr[e]
    while(curr>sum):
      curr-=arr[s]
      s+=1
      if(curr==sum):
        return True
  return False


def BruteF(arr):
  for i in range(len(arr)):
    curr=0
    for j in range(i,len(arr)):
      curr+=arr[j]
      if(curr==sum):
        return True
      
    return False
