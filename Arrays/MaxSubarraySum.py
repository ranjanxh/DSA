def maxubarraysum(arr):
  Maxsum=float('-inf')

  for i in range(0,len(arr)):
    for j in range(i,len(arr)):
      subarray=arr[i:j+1]
      sum=0
      for z in subarray:
        sum+=z
      if(sum>Maxsum):
        Maxsum=sum
  return Maxsum

def kadane(arr):
  sum=0
  maxsum=arr[0]
  n=len(arr)
  for i in range(n):
    sum+=arr[i]
    maxsum=max(sum,maxsum)
    if(sum<=0):
      sum=0
  return maxsum


arr=[2, 3, -8, 7, -1, 2, 3]
print(maxubarraysum(arr))
print(kadane(arr))



    