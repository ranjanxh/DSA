def leftRotate(arr,d):
  reverse(arr,0,len(arr)-1)
  reverse(arr,0,len(arr)-d-1)
  reverse(arr,len(arr)-d,len(arr)-1)
  return(arr)



def reverse(arr, start,end):
  while(start<=end):
    temp=arr[start]
    arr[start]=arr[end]
    arr[end]=temp
    start+=1
    end-=1


arr=[1,2,3,4,5]
print(leftRotate(arr,2))
