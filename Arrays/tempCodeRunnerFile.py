def if_sorted(arr):
  for i in range(len(arr)-1):
    if(arr[i]<arr[i+1]):
      return True
    else:
      return False
    
arr1=[10,20,39]
if_sorted(arr1)