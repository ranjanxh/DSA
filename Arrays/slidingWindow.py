def maxSumofK(arr,k):
  res=0
  i=0
  while(i+k-1<len(arr)):
    curr=0
    for j in range(k):
      curr=curr+arr[i+j]
    res=max(res,curr)
    i+=1
  return res
# arr=[1,8,30,-5,20,7]
# print(maxSumofK(arr,3))

def slidingWindow(arr,k):
  curr=0
  for i in range(k):
    curr=curr+arr[i]
  res=curr
  for j in range(k,len(arr)):
    curr=curr-arr[j-k]+arr[j]
    res=max(curr,res)
  return res
arr=[1,8,30,-5,20,7]
print(slidingWindow(arr,3))
