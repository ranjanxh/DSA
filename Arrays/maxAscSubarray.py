def MaxAscSub(arr):
  sum=arr[0]
  maxsum=sum
  for i in range(len(arr)):
    if(arr[i]>arr[i-1]):
      sum+=arr[i]
      if(sum>maxsum):
        maxsum=sum
    else:
      sum=arr[i]

  return maxsum

arr=[12,17,15,13,10,11,12]
print(MaxAscSub(arr))


      