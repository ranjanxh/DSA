def moveZeroesToEnd(arr):
  
  j=1
  for i in range(0,len(arr)-1):
    if(arr[i]==0):
      temp=arr[i]
      arr[i]=arr[i+1]
      arr[i+1]=temp

  return arr

arr=[1,0,2,3,2,0,0,4,5,1]
print(moveZeroesToEnd(arr))
    